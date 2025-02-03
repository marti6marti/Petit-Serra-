def comptar_caracters(cadena):
    comptador = {
        'majúscules': 0,
        'minúscules': 0,
        'altres': 0
    }

    # Recórrer cada caràcter de la cadena
    for car in cadena:
        if car.isupper():  # Si és majúscula
            comptador['majúscules'] += 1
        elif car.islower():  # Si és minúscula
            comptador['minúscules'] += 1
        else:  # Si no és ni majúscula ni minúscula (altres)
            comptador['altres'] += 1

    return comptador



cadena = input("Escriu una cadena de text: ")
resultat = comptar_caracters(cadena)
print(resultat)