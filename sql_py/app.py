from typing import List

from fastapi import FastAPI, HTTPException, Query, Depends
from sqlmodel import Session, select

from models import Pais, Ciudad, PaisCreate, PaisPublic, PaisUpdate, PaisPublicWithCiudades, CiudadCreate, CiudadPublic, CiudadUpdate, CiudadPublicWithPais
from database import engine, lifespan, get_session

app = FastAPI(lifespan=lifespan)


@app.get("/paises/", response_model=List[PaisPublic])
def read_paises(offset: int = 0, limit: int = Query(default=100, le=100)):
    with Session(engine) as session:
        paises = session.exec(select(Pais).offset(offset).limit(limit)).all()
        return paises

@app.get("/paises/{pais_id}", response_model=PaisPublicWithCiudades)
def read_pais(pais_id: int, session: Session = Depends(get_session)):
    pais = session.get(Pais, pais_id)
    if not pais:
        raise HTTPException(status_code=404, detail="País no encontrado")
    return pais

@app.post("/paises/", response_model=PaisPublic)
def create_pais(pais: PaisCreate):
    with Session(engine) as session:
        db_pais = Pais.model_validate(pais)
        session.add(db_pais)
        session.commit()
        session.refresh(db_pais)
        return db_pais

@app.patch("/paises/{pais_id}", response_model=PaisPublic)
def update_pais(pais_id: int, pais: PaisUpdate):
    with Session(engine) as session:
        db_pais = session.get(Pais, pais_id)
        if not db_pais:
            raise HTTPException(status_code=404, detail="País no encontrado")
        pais_data = pais.model_dump(exclude_unset=True)
        for key, value in pais_data.items():
            setattr(db_pais, key, value)
        session.add(db_pais)
        session.commit()
        session.refresh(db_pais)
        return db_pais

@app.delete("/paises/{pais_id}")
def delete_pais(pais_id: int):
    with Session(engine) as session:
        pais = session.get(Pais, pais_id)
        if not pais:
            raise HTTPException(status_code=404, detail="País no encontrado")
        session.delete(pais)
        session.commit()
        return {"ok": True}


@app.get("/ciudades/", response_model=List[CiudadPublic])
def read_ciudades(offset: int = 0, limit: int = Query(default=100, le=100)):
    with Session(engine) as session:
        ciudades = session.exec(select(Ciudad).offset(offset).limit(limit)).all()
        return ciudades

@app.get("/ciudades/{ciudad_id}", response_model=CiudadPublicWithPais)
def read_ciudad(ciudad_id: int, session: Session = Depends(get_session)):
    ciudad = session.get(Ciudad, ciudad_id)
    if not ciudad:
        raise HTTPException(status_code=404, detail="Ciudad no encontrada")
    return ciudad

@app.post("/ciudades/", response_model=CiudadPublic)
def create_ciudad(ciudad: CiudadCreate):
    with Session(engine) as session:
        db_ciudad = Ciudad.model_validate(ciudad)
        session.add(db_ciudad)
        session.commit()
        session.refresh(db_ciudad)
        return db_ciudad

@app.patch("/ciudades/{ciudad_id}", response_model=CiudadPublic)
def update_ciudad(ciudad_id: int, ciudad: CiudadUpdate):
    with Session(engine) as session:
        db_ciudad = session.get(Ciudad, ciudad_id)
        if not db_ciudad:
            raise HTTPException(status_code=404, detail="Ciudad no encontrada")
        ciudad_data = ciudad.model_dump(exclude_unset=True)
        for key, value in ciudad_data.items():
            setattr(db_ciudad, key, value)
        session.add(db_ciudad)
        session.commit()
        session.refresh(db_ciudad)
        return db_ciudad

@app.delete("/ciudades/{ciudad_id}")
def delete_ciudad(ciudad_id: int):
    with Session(engine) as session:
        ciudad = session.get(Ciudad, ciudad_id)
        if not ciudad:
            raise HTTPException(status_code=404, detail="Ciudad no encontrada")
        session.delete(ciudad)
        session.commit()
        return {"ok": True}


# 1. Obtener ciudades por país
@app.get("/paises/{pais_id}/ciudades", response_model=List[CiudadPublic])
def get_ciudades_por_pais(pais_id: int, session: Session = Depends(get_session)):
    pais = session.get(Pais, pais_id)
    if not pais:
        raise HTTPException(status_code=404, detail="País no encontrado")
    return pais.ciudades



@app.get("/paises/buscar/", response_model=List[PaisPublic])
def buscar_paises(
        nombre: str = Query(..., min_length=1, description="Nombre o parte del nombre del país"),
        limit: int = Query(10, le=50)
):
    with Session(engine) as session:
        paises = session.exec(
            select(Pais).where(Pais.nombre.ilike(f"%{nombre}%")).limit(limit)
        ).all()
        return paises



@app.get("/paises/{pais_id}/contar-ciudades")
def contar_ciudades_por_pais(pais_id: int, session: Session = Depends(get_session)):
    pais = session.get(Pais, pais_id)
    if not pais:
        raise HTTPException(status_code=404, detail="País no encontrado")
    return {"pais_id": pais_id, "total_ciudades": len(pais.ciudades)}



@app.get("/capitales/", response_model=List[dict])
def obtener_capitales():
    with Session(engine) as session:
        paises = session.exec(select(Pais)).all()
        return [{"pais": p.nombre, "capital": p.capital} for p in paises]



@app.post("/paises/con-ciudades/", response_model=PaisPublicWithCiudades)
def crear_pais_con_ciudades(
        datos: dict,
        session: Session = Depends(get_session)
):

    db_pais = Pais.model_validate(datos["pais"])
    session.add(db_pais)
    session.commit()
    session.refresh(db_pais)


    for nombre_ciudad in datos.get("ciudades", []):
        ciudad = Ciudad(nombre=nombre_ciudad, pais_id=db_pais.id)
        session.add(ciudad)

    session.commit()
    session.refresh(db_pais)
    return db_pais