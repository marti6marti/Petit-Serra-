import json

# Cargar los datos desde el archivo JSON
with open("data/products.json", "r", encoding="utf-8") as archivo:
    DATA = json.load(archivo)

# Asegurar que DATA["products"] existe y es una lista
PRODUCTS = DATA.get("products", [])


# CRUD Functions
def read_all() -> list:
    """Devuelve todos los productos como una lista"""
    return PRODUCTS


# Uso de la función read_all
print("Leer todos los productos:")
print(read_all())


def read_item(item_id: int) -> dict:
    """Busca un producto por ID"""
    for item in PRODUCTS:
        if item["id"] == item_id:
            return item
    raise KeyError("ID not found")


# Uso de la función read_item
print("\nLeer un producto por ID (id=1):")
print(read_item(1))  # Busca el producto con id 1



def create(item: dict):
    """Crea un nuevo producto"""
    if not PRODUCTS:
        new_id = 1
    else:
        new_id = max(product["id"] for product in PRODUCTS) + 1

    item["id"] = new_id
    PRODUCTS.append(item)


# Uso de la función create
new_product = {
    "title": "New Product",
    "description": "A brand new product",
    "category": "electronics",
    "price": 49.99,
    "discountPercentage": 5.0,
    "rating": 4.5,
    "stock": 10,
    "tags": ["new", "electronics"]
}

print("\nCrear un nuevo producto:")
create(new_product)
print(new_product)  # Muestra el nuevo producto creado


def update(item: dict):
    """Actualiza un producto existente"""
    for index, prod in enumerate(PRODUCTS):
        if prod["id"] == item["id"]:
            PRODUCTS[index] = item
            return item
    raise KeyError("ID not found")


# Uso de la función update
updated_product = {
    "id": 1,  # ID del producto a actualizar
    "title": "Updated Essence Mascara",
    "description": "Updated description...",
    "category": "beauty",
    "price": 8.99,
    "discountPercentage": 10.0,
    "rating": 4.9,
    "stock": 3,
    "tags": ["beauty", "mascara"]
}

print("\nActualizar un producto (id=1):")

update(updated_product)
print(updated_product)  # Muestra el producto actualizado



def delete(item_id: int):
    """Elimina un producto por ID"""
    for index, item in enumerate(PRODUCTS):
        if item["id"] == item_id:
            return PRODUCTS.pop(index)
    raise KeyError("ID not found")


# Uso de la función delete
print("\nEliminar un producto (id=1):")

deleted_item = delete(1)
print(deleted_item)


