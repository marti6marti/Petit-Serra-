import json

with open('data/products.json', 'r', encoding='utf-8') as archivo:
    DATA = json.load(archivo)

PRODUCTS = DATA.get("products", [])

def read_all() -> list:
    return list(DATA.values())

def read_item(item_id: dict) -> dict:
    if item_id not in DATA:
        raise KeyError("id not found")
    return DATA[item_id]

def create(item: dict):
    new_id = max(list(DATA.keys())) + 1
    item["id"] = len(DATA.keys()) + 1
    DATA[new_id] = item

def update(item):
    id = item["id"]
    if id not in DATA:
        raise KeyError("id not found")
    else:
        #Print update Item
        DATA[id] = item
        return DATA[id]

def delete(id):
    return DATA.pop(id)

