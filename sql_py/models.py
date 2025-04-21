from typing import Optional

from sqlmodel import SQLModel, Field, Relationship

#Pais: nombre, capital, ciudades
#Ciudades: nombre_cidad, pais

class PaisBase(SQLModel):
    nombre: str = Field(index=True)
    capital: str

class Pais(PaisBase, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)

    ciudades: list["Ciudad"] = Relationship(back_populates="pais")

class PaisCreate(PaisBase):
    pass

class PaisPublic(PaisBase):
    id: int


class PaisUpdate(SQLModel):
    nombre: Optional[str] = None
    capital: Optional[str] = None


class CiudadBase(SQLModel):
    nombre: str = Field(index=True)

    pais_id: Optional[int] = Field(default=None, foreign_key="pais.id")


class Ciudad(CiudadBase, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)

    pais: Optional[Pais] = Relationship(back_populates="ciudades")


class CiudadPublic(CiudadBase):
    id: int


class CiudadCreate(CiudadBase):
    pass


class CiudadUpdate(SQLModel):
    nombre: Optional[str] = None

    pais_id: Optional[int] = None


class CiudadPublicWithPais(CiudadPublic):
    pais: Optional[PaisPublic] = None


class PaisPublicWithCiudades(PaisPublic):
    ciudades: list[CiudadPublic] = []
