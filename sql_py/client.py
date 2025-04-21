import requests

base_url = "http://127.0.0.1:8000"


def read_paises():
    r = requests.get(f"{base_url}/paises/")
    print(r.status_code)
    print(r.json())


def read_pais(pais_id):
    r = requests.get(f"{base_url}/paises/{pais_id}")
    print(r.status_code)
    print(r.json())


def create_pais():
    pais = {"nombre": "Wakanda", "capital": "Birnin Zana"}
    r = requests.post(f"{base_url}/paises/", json=pais)
    print(r.status_code)
    print(r.json())


def update_pais(pais_id, data):
    r = requests.patch(f"{base_url}/paises/{pais_id}", json=data)
    print(r.status_code)
    print(r.json())


def delete_pais(pais_id):
    r = requests.delete(f"{base_url}/paises/{pais_id}")
    print(r.status_code)
    print(r.json())


def read_ciudades():
    r = requests.get(f"{base_url}/ciudades/")
    print(r.status_code)
    print(r.json())


def create_ciudad():
    ciudad = {"nombre": "Shuri City", "pais_id": 1}
    r = requests.post(f"{base_url}/ciudades/", json=ciudad)
    print(r.status_code)
    print(r.json())


def get_ciudades_por_pais(pais_id):
    r = requests.get(f"{base_url}/paises/{pais_id}/ciudades")
    print(r.status_code)
    print(r.json())


def buscar_paises(nombre):
    r = requests.get(f"{base_url}/paises/buscar/", params={"nombre": nombre})
    print(r.status_code)
    print(r.json())


def obtener_capitales():
    r = requests.get(f"{base_url}/capitales/")
    print(r.status_code)
    print(r.json())


if __name__ == "__main__":
    read_paises()
    read_pais(1)
    create_pais()
    update_pais(1, {"capital": "Nueva Wakanda"})
    delete_pais(3)
    read_ciudades()
    create_ciudad()
    get_ciudades_por_pais(1)
    buscar_paises("an")
    obtener_capitales()
