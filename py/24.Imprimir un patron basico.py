"""
Programa para imprimir un patron en base a un Cantidad N
Autor Logica G2D
Fecha OCT 2024
Licencia GNU GLP v3
"""

from apoyo import ingresar_entero_mayor_que, mostrar_mensaje

VALOR_MINIMO=0

def main():
    n=ingresar_entero_mayor_que("Ingrese el valor n: ", VALOR_MINIMO)
    patron=generar_patron(n)
    mostrar_mensaje(patron)


def generar_patron(n):
    dibujo=""
    for j in range(0,n):
        dibujo+= repetir_caracter("*",(n+1)-n)
        dibujo+= repetir_caracter(".",j)
        dibujo+= repetir_caracter("*",(n+1)-n)
        dibujo+= "\n"
    dibujo+= repetir_caracter("*", n+2)
    return dibujo

def repetir_caracter(caracter,cantidad):
    mensaje= ""
    for i in range (0, cantidad):
        mensaje+= caracter
    return mensaje

main()

