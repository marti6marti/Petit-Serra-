amigos = []

for i in range(5):
    amigo = input()
    amigos.append(amigo)

print(amigos[2])
Ultimonombre = input()
amigos.append(Ultimonombre)
amigos[1] = "Joan"
del amigos[-1]

if amigos[1] == "Joan":
    print("ok")