from sqlmodel import Session

from models import Pais, Ciudad
from database import engine, create_db_and_tables

def create_ciudades():
    with Session(engine) as session:

        pais_argentina = Pais(nombre="Argentina", capital="Buenos Aires")
        pais_brasil = Pais(nombre="Brasil", capital="Brasilia")
        pais_chile = Pais(nombre="Chile", capital="Santiago")

        session.add(pais_argentina)
        session.add(pais_brasil)
        session.add(pais_chile)
        session.commit()


        session.refresh(pais_argentina)
        session.refresh(pais_brasil)
        session.refresh(pais_chile)

        ciudad_buenos_aires = Ciudad(nombre="Buenos Aires", pais_id=pais_argentina.id)
        ciudad_cordoba = Ciudad(nombre="Córdoba", pais_id=pais_argentina.id)
        ciudad_rosario = Ciudad(nombre="Rosario", pais_id=pais_argentina.id)


        ciudad_rio = Ciudad(nombre="Rio de Janeiro", pais_id=pais_brasil.id)
        ciudad_sao_paulo = Ciudad(nombre="São Paulo", pais_id=pais_brasil.id)


        ciudad_valparaiso = Ciudad(nombre="Valparaíso", pais_id=pais_chile.id)
        ciudad_concepcion = Ciudad(nombre="Concepción", pais_id=pais_chile.id)


        session.add(ciudad_buenos_aires)
        session.add(ciudad_cordoba)
        session.add(ciudad_rosario)
        session.add(ciudad_rio)
        session.add(ciudad_sao_paulo)
        session.add(ciudad_valparaiso)
        session.add(ciudad_concepcion)

        session.commit()

        print("Created country:", pais_argentina)
        print("Created country:", pais_brasil)
        print("Created country:", pais_chile)

        print("Created city:", ciudad_buenos_aires)
        print("Created city:", ciudad_cordoba)
        print("Created city:", ciudad_rosario)
        print("Created city:", ciudad_rio)
        print("Created city:", ciudad_sao_paulo)
        print("Created city:", ciudad_valparaiso)
        print("Created city:", ciudad_concepcion)


def main():
    create_db_and_tables()
    create_ciudades()


if __name__ == "__main__":
    main()
