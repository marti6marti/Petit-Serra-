from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from typing import List, Optional


app = FastAPI()



from database import read_db, save_db

class PostInput(BaseModel):
    title: str
    body: str
    tags: list
    reactions: dict
    views: int
    userId: int

class PostOutput(BaseModel):
    id: int
    title: str
    body: str
    tags: list
    reactions: dict
    views: int
    userId: int


DB_PATH = "data/posts.json"
db = read_db(DB_PATH, "posts")
FIELD = "posts"

@app.get("/")
async def root():
    return {"message": "Hello World"}

@app.get("/posts")
def get_posts():
    return db

@app.get("/posts/{post_id}")
def get_post(post_id: int):
    post = db.get(post_id)
    if not post:
        raise HTTPException(status_code=404, detail="Post not found")
    return post



@app.post("/posts", )
def create_post(post: PostInput):

    if not post.title or not post.body:
        raise HTTPException(status_code=400, detail="Title and body are required.")

    if len(post.tags) == 0:
        raise HTTPException(status_code=400, detail="At least one tag is required.")

    if "likes" not in post.reactions or "dislikes" not in post.reactions:
        raise HTTPException(status_code=400, detail="Reactions must include both 'likes' and 'dislikes'.")

    if post.views < 0:
        raise HTTPException(status_code=400, detail="Views cannot be negative.")

    if post.userId <= 0:
        raise HTTPException(status_code=400, detail="Invalid userId.")

    new_id = max(db.keys(), default=0) + 1
    new_post = post.dict()
    new_post["id"] = new_id
    db[new_id] = new_post
    save_db(DB_PATH, FIELD, db)
    return new_post

@app.put("/posts/{post_id}")
def update_post(post_id: int, post: PostInput):
    if post_id not in db:
        raise HTTPException(status_code=404, detail="Post not found")
    updated_post = post.dict()
    updated_post["id"] = post_id
    db[post_id] = updated_post
    save_db(DB_PATH, FIELD, db)
    return updated_post

@app.delete("/posts/{post_id}")
def delete_post(post_id: int):
    if post_id not in db:
        raise HTTPException(status_code=404, detail="Post not found")
    del db[post_id]
    save_db(DB_PATH, FIELD, db)
    return {"message": "Post eliminat correctament"}


@app.get("/posts/tags/{tag}")
def get_posts_by_tag(tag: str):
    posts = [p for p in db.values() if tag in p["tags"]]
    if not posts:
        raise HTTPException(status_code=404, detail=f"No se encontraron posts con el tag '{tag}'")
    return posts

@app.get("/posts/search/{palabra}")
def search_posts(palabra: str):
    posts = [p for p in db.values() if palabra.lower() in p["title"].lower()]
    if not posts:
        raise HTTPException(status_code=404, detail=f"No se encontraron posts con la palabra '{palabra}' en el título")
    return posts

@app.get("/posts/user/{user_id}")
def get_posts_by_user(user_id: int):
    posts = [p for p in db.values() if user_id == p["userId"]]
    if not posts:
        raise HTTPException(status_code=404, detail=f"No se encontraron posts del usuario con ID {user_id}")
    return posts
#
#@app.get("/posts/top")
#def top_liked_posts():
#    posts = sorted(database.read_db_list(DB_PATH, FIELD), key=lambda p: p['reactions']['likes'], reverse=True)[:5]
    #    return posts

#@app.get("/posts/top_views")
#def top_viewed_posts():
#    posts = sorted(list(db.values()), key=lambda p: p["reactions"]["views"], reverse=True)[:5]
#   return posts

