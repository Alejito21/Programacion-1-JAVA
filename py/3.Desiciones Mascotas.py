"""
Programa para determinar la pioridad de atencion de las mascotas de una veterinaria
Autor: Logica G2D
Fecha Sep 2024
Licencia: GNU GPL v3

"""

def main():
    nivel_atencion=ingresar_entero(("1. Leve\n"
                                    "2. Moderado\n"
                                    "3. Grave\n"
                                    "4. Urgente\n\n"
                                    "Ingrese el numero de malestar de su mascota: "))
    mensaje=generar_mensaje(nivel_atencion)
    mostrar_mensaje(mensaje)


def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def generar_mensaje(nivel_atencion):
    if nivel_atencion ==4:
        mensaje="La mascota se atenderá de forma inmediata"
    elif nivel_atencion==3:
        mensaje="Su mascota se atenderá en la proxima hora"
    elif nivel_atencion==2:
        mensaje="Su mascota se atenderá a lo largo del día"
    else:
        mensaje="Su mascota se atenderá en los proximos días"
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()
