import json

with open("data/frieda.json", mode="r", encoding="utf-8") as file:
    data = json.load(file)

print(type(data))
print(data)
print(data["name"])
print(data["isDog"])
print(data["hobbies"][1])
print(data["friends"][1])
print(data["friends"][1]["hobbies"][0])
