def paraules_extremes(lista_de_paraules):
    # Inicialitzar les variables per la paraula més curta i més llarga
    paraula_mes_llarga = lista_de_paraules[0]
    paraula_mes_curta = lista_de_paraules[0]

    # Recórrer totes les paraules de la llista
    for paraula in lista_de_paraules:
        # Si la paraula actual és més llarga que la més llarga trobada fins ara
        if len(paraula) > len(paraula_mes_llarga):
            paraula_mes_llarga = paraula
        # Si la paraula actual és més curta que la més curta trobada fins ara
        elif len(paraula) < len(paraula_mes_curta):
            paraula_mes_curta = paraula

    # Retornar les dues paraules com a tupla
    return (paraula_mes_curta, paraula_mes_llarga)


# Exemple d'ús:
llista = ["gat", "elefant", "casa", "arbre", "bicicleta"]
resultat = paraules_extremes(llista)
print(resultat)  # Sortida: ('gat', 'bicicleta')
