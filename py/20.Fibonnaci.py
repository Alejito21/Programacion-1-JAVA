"""
Porgrama que nos dice cuantos terminos de la succesion de Fibonnacci hay entre dos numeros
Autor Logica G2D
Fecha Oct 2024
Licencia GNU GPL v3
"""
from apoyo import ingresar_entero_mayor_que, mostrar_mensaje

MINIMO=0

def main():
    limite_inferior=ingresar_entero_mayor_que("Ingrese el numero que sera su limite inferior: ", MINIMO)
    limite_superior=ingresar_entero_mayor_que("Ingrese el numero que sera su limite superior: ", limite_inferior)
    terminos_fibonnacci=contar_terminos(limite_inferior, limite_superior)
    mensaje=generar_mensaje(limite_inferior, limite_superior, terminos_fibonnacci)
    mostrar_mensaje(mensaje)

def contar_terminos(limite_inferior, limite_superior):
    terminos=0
    a=1
    b=1
    while a <= limite_superior:
        if a <= limite_superior:
            terminos= terminos+1
        c=a+b
        a=b
        b=c
    return terminos

def generar_mensaje(limite_inferior, limite_superior, terminos_fibonnacci):
    mensaje=f"Con su limite inferior {limite_inferior} y limite superior {limite_superior}, la cantidad de terminos en la succesion de Fibonnacci es de: {terminos_fibonnacci}"
    return mensaje

main()
