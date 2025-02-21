import time
import os

print("¡Tiempo terminado!")

s = input("start: ")

if s == "on":
    os.system(
        '"reg add "HKEY_CURRENT_USER\Control Panel\Desktop" /v Wallpaper /t REG_SZ /d "C:\ruta\de\la\imagen.jpg" /fRUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters ,1 ,True"')
    for i in range(1, 4):
        print("canvi en: " + i)
        time.sleep(1)

    os.system(
        '"reg add "HKEY_CURRENT_USER\Control Panel\Desktop" /v Wallpaper /t REG_SZ /d "C:\ruta\de\la\imagen.jpg" /fRUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters ,1 ,True"')
    for i in range(1, 4):
        print("canvi en: " + i)
        time.sleep(1)

    os.system(
        '"reg add "HKEY_CURRENT_USER\Control Panel\Desktop" /v Wallpaper /t REG_SZ /d "C:\ruta\de\la\imagen.jpg" /fRUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters ,1 ,True"')
    for i in range(1, 4):
        print("canvi en: " + i)
        time.sleep(1)
