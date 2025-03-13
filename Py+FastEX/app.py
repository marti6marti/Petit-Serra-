import fastapi
from fastapi import FastAPI, HTTPException
import json
from pydantic import BaseModel
from rich import status

from database import read_db, save_db
from client import RecipeInput,RecipeOutput

DB_PATH = "data/recipes.json"
receptes = read_db(DB_PATH, "recipes")

app = FastAPI()



@app.get("/")
def root():
    return {"hello world"}

@app.get("/recipes")
def all_recipes() -> list[RecipeOutput]:
    return receptes.values()

@app.get("/recipes/{recipe_id}")
def get_recipe(recipe_id: int):
    recipe = receptes.get(recipe_id)
    if not recipe:
        raise HTTPException(status_code=404, detail="Recipe not found")
    return recipe

@app.post("/recipes", status_code=status.HTTP_201_CREATED)
def create_recipe(recipe: RecipeInput) -> dict:
    new_id = max(receptes.keys(), default=0) + 1
    new_recipe = recipe.dict()
    new_recipe["id"] = new_id
    receptes[new_id] = new_recipe
    save_db(DB_PATH, receptes)
    return new_recipe

@app.put("/recipes/{recipe_id}", status_code=status.HTTP_200_OK)
def update_recipe(recipe_id: int, recipe: RecipeInput) -> RecipeOutput:
    if recipe_id not in receptes:
        raise HTTPException(status_code=404, detail="Recipe not found")
    updated_recipe = recipe.dict()
    updated_recipe["id"] = recipe_id
    receptes[recipe_id] = updated_recipe
    save_db(DB_PATH, receptes)
    return updated_recipe

@app.delete("/recipes/{recipe_id}", status_code=status.HTTP_200_OK)
def delete_recipe(recipe_id: int) -> dict:
    if recipe_id not in receptes:
        raise HTTPException(status_code=404, detail="Recipe not found")
    del receptes[recipe_id]
    save_db(DB_PATH, receptes)
    return {"message": "Recipe deleted successfully"}