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

DB_PATH = "data/recipes.json"
db = read_db(DB_PATH, "recipes")

@app.get("/recipes")
def all_recipes() -> list[RecipeOutput]:
    return receptes.values()

@app.get("/recipes/{recipe_id}")
def recipe_by_id(recipe_id: int) -> RecipeOutput:
    if recipe_id in receptes.keys():
        return receptes[recipe_id]
    raise HTTPException(status_code=404, detail="Error")


@app.post("/recipes", status_code=status.HTTP_201_CREATED)
def create_recipe(recipe: RecipeInput) -> dict:
    new_id = 1 if not receptes else sorted(receptes.keys())[-1] + 1
    new_recipe = {"id": new_id, **recipe.dict()}
    receptes[new_id] = new_recipe
    save_db(DB_PATH, "recipes", receptes)
    return new_recipe

@app.put("/recipes/{recipe_id}", status_code=status.HTTP_200_OK)
def update_recipe(recipe_id: int, recipe: RecipeInput) -> RecipeOutput:
    updated_recipe = all_recipes(recipe_id)
    updated_recipe.update(recipe)
    save_db(DB_PATH, "recipes", receptes)
    return updated_recipe

@app.delete("/recipes/{recipe_id}", status_code=status.HTTP_200_OK)
def delete_recipe(recipe_id: int) -> dict:
    if recipe_id in receptes.keys():
        receptes.pop(recipe_id)
        save_db(DB_PATH, "recipes", receptes)
        return {"message": "Book deleted", "deleted_book":recipe_id}
    raise HTTPException(status_code=404, detail="Error")


#part 4

@app.get("/recipes/cuisine/{cuisine_name}", status_code=status.HTTP_200_OK)
def get_recipes_by_cuisine(cuisine_name: str) -> list[RecipeOutput]:
    filtered_recipes = []
    for recipe in receptes.values():
        if recipe["cuisine"] == cuisine_name:
            filtered_recipes.append(recipe)
    return filtered_recipes

@app.get("/recipes/difficulty/{difficulty_level}", status_code=status.HTTP_200_OK)
def get_recipes_by_difficulty(difficulty_level: str) -> list[RecipeOutput]:
    filtered_recipes = []
    for recipe in receptes.values():
        if recipe["difficulty"] == difficulty_level:
            filtered_recipes.append(recipe)
    return filtered_recipes

@app.get("/recipes/ingredient/{ingredient_name}", status_code=status.HTTP_200_OK)
def get_recipes_by_ingredient(ingredient_name: str) -> list[RecipeOutput]:
    filtered_recipes = []
    for recipe in receptes.values():
        for ingredient in recipe["ingredients"]:
            if ingredient_name.lower() in ingredient.lower():
                filtered_recipes.append(recipe)
    return filtered_recipes

@app.get("/recipes/prep_time_minutes/{max_prep_time}", status_code=status.HTTP_200_OK)
def get_recipes_by_prep_time(max_prep_time: int) -> list[RecipeOutput]:
    filtered_recipes = []
    for recipe in receptes.values():
        if recipe["prepTimeMinutes"] <= max_prep_time:
            filtered_recipes.append(recipe)
    return filtered_recipes

@app.get("/recipes/meal_type/{meal_type}", status_code=status.HTTP_200_OK)
def get_recipes_by_meal_type(meal_type: str) -> list[RecipeOutput]:
    filtered_recipes = []
    for recipe in receptes.values():
        for meal in recipe["mealType"]:
            if meal_type.lower() in meal.lower():
                filtered_recipes.append(recipe)
    return filtered_recipes