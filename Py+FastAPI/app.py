import fastapi
from fastapi import FastAPI
import json

from pydantic import BaseModel

from database import read_db

app = FastAPI()


class RecipesOutput(BaseModel):
    id: int
    name: str
    ingredients: str
    instructions: str
    prepTimeMinutes: int
    cookTimeMinutes: int
    servings: int
    difficulty: str
    cuisine: str
    caloriesPerServing: int
    tags:[str]
    userId: int
    image: str
    rating: int
    reviewCount: int
    mealType: [str]

class RecipesInput(BaseModel):
    id: int
    name: str
    ingredients: str
    instructions: str
    prepTimeMinutes: int
    cookTimeMinutes: int
    servings: int
    difficulty: str
    cuisine: str
    caloriesPerServing: int
    tags:[str]
    userId: int
    image: str
    rating: int
    reviewCount: int
    mealType: [str]


@app.get("/")
def root():
    return {"hola"}

DB_PATH = "data/recipes.json"
db = read_db(DB_PATH, "recipes")

@app.get("/Recipes")
def read() -> list[RecipesOutput]:
    return list_RecipesOuput