from fastapi import FastAPI
from sqlmodel import Field, Session, SQLModel, create_engine, select

from database import engine, create_db_and_tables, lifespan
from models import Hero, HeroCreate, HeroPublic

app = FastAPI(lifespan=lifespan)

@app.post("/heroes/", response_model=HeroPublic)
def create_hero(hero: HeroCreate):
    with Session(engine) as session:
        db_hero = Hero.model_validate(hero)
        session.add(db_hero)
        session.commit()
        session.refresh(db_hero)
        return db_hero


@app.get("/heroes/", response_model=list[HeroPublic])
def read_heroes():
    with Session(engine) as session:
        heroes = session.exec(select(Hero)).all()
        return heroes