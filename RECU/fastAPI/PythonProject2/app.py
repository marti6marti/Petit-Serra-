from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from typing import List, Optional

import database
from database import read_db, save_db

class PostInput(BaseModel):
    title: str
    body: str
    tags: List[str]
    userId: int

class PostOutput(PostInput):
    id: int
    views: int
    reactions: dict


DB_PATH = "data/posts.json"
db = read_db(DB_PATH, "posts")
FIELD = "posts"

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Benvingut a l'API de Posts!"}

@app.get("/posts")
def get_posts():
    return db

@app.get("/posts/{post_id}")
def get_post(post_id: int):
    post = db.get(post_id)
    if not post:
        raise HTTPException(status_code=404, detail="Post not found")
    return post


@app.post("/posts")
def create_post(post: PostInput):
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
    return [p for p in db.values() if tag in p["tags"]]

@app.get("/posts/search/{palabra}")
def search_posts(palabra: str):
    return [p for p in db.values() if palabra.lower() in p["title"].lower()]

@app.get("/posts/user/{user_id}")
def get_posts_by_user(user_id: int):
    return [p for p in db.values() if user_id == p["userId"]]

@app.get("/posts/top")
def top_liked_posts():
    posts = sorted(database.read_db_list(DB_PATH, FIELD), key=lambda p: p['reactions']['likes'], reverse=True)[:5]
    return posts

@app.get("/posts/top_views")
def top_viewed_posts():
    posts = sorted(list(db.values()), key=lambda p: p["reactions"]["views"], reverse=True)[:5]
    return posts
