
from fastapi import FastAPI
from pydantic import BaseModel
from fastapi import HTTPException
from typing import List, Optional
from database import read_db, save_db

recipes_file = "data/recipes.json"

app = FastAPI()

DB_PATH = "data/recipes.json"
DATA_LIST = read_db(DB_PATH,"recipes")

class RecipeInput(BaseModel):
    name: str
    ingredients: List[str]
    instructions: List[str]
    prepTimeMinutes: int
    cookTimeMinutes: int
    servings: int
    difficulty: str
    cuisine: str
    caloriesPerServing: int
    tags: List[str]
    userId: int
    image: str
    rating: float
    reviewCount: int
    mealType: List[str]


class RecipeOutput(RecipeInput):
    id: int

"CRUD"

@app.get("/recipes")
def read():
    return DATA_LIST


@app.get("/recipes/{recipe_id}")
def read_item(recipe_id : int) -> RecipeInput:
    for recipe in DATA_LIST.values():
        if recipe.get("id") == recipe_id:
            return recipe
    raise HTTPException(status_code=404, detail="Receta no encontrada")


@app.post("/recipes")
def create(recipe: RecipeInput):
    id = len(DATA_LIST)+1
    recipe_dict = recipe.model_dump()
    recipe_dict["id"] = id
    DATA_LIST[id] = recipe_dict
    save_db(DB_PATH, "recipes", DATA_LIST)
    return recipe_dict


@app.put("/recipes/{recipe_id}", response_model=RecipeOutput)
def update(recipe_id: int, update: RecipeInput):
    if recipe_id not in DATA_LIST:
        raise HTTPException(status_code=404, detail="Receta no encontrada")

    updated_recipe = update.model_dump()
    updated_recipe["id"] = recipe_id
    DATA_LIST[recipe_id] = updated_recipe
    save_db(DB_PATH, "recipes", DATA_LIST)
    return updated_recipe


@app.delete("/recipe_id/{recipe_id}")
def delete(recipe_id: int):
    if recipe_id not in DATA_LIST:
        raise HTTPException(status_code=404, detail="Receta no encontrada")

    del DATA_LIST[recipe_id]
    save_db(DB_PATH, "recipes", DATA_LIST)
    return {"mensaje": "Receta eliminada correctamente"}

"Funciones"

@app.get("/recipes/by-difficulty/{level}", response_model=List[RecipeOutput])
def filter_by_difficulty(level: str):
    level = level.lower()
    result = []
    for recipe in DATA_LIST.values():
        if recipe["difficulty"].lower() == level:
            result.append(recipe)
    return result


@app.get("/recipes/by-title/{word}", response_model=List[RecipeOutput])
def filter_by_title(word: str):
    word = word.lower()
    result = []
    for recipe in DATA_LIST.values():
        if word in recipe["name"].lower():
            result.append(recipe)
    return result

@app.get("/recipes/by-ingredient/{ingredient}", response_model=List[RecipeOutput])
def filter_by_ingredient(ingredient: str):
    ingredient = ingredient.lower()
    result = []
    for recipe in DATA_LIST.values():
        for ing in recipe["ingredients"]:
            if ingredient in ing.lower():
                result.append(recipe)
                break  # para no añadirlo más de una vez si hay varios ingredientes parecidos
    return result


