"""
Programa para generar un listado 
Autro Alejito
Fecha Sep 2024
Licencia: GNU GLP v3
"""
from apoyo import ingresar_entero, mostrar_mensaje

VALOR_INICIAL= 0.0

def main():
    valor_inicial=ingresar_entero_mayor_que("Ingrese su valor inicial: ",VALOR_INICIAL)
    valor_final=ingresar_entero_mayor_que("Ingrese su valor final: ",valor_inicial)
    lista=generar_lista(valor_inicial, valor_final)
    mostrar_mensaje(lista)

def ingresar_entero_mayor_que(mensaje, valor_minimo):
    repetir=True
    while repetir:
        valor=ingresar_entero(mensaje)
        if valor<= valor_minimo:
            print(f"El valor debe ser mayor al: {valor_minimo}")
        else:
            repetir=False
    return valor

def generar_lista(valor_inicial, valor_final):
    lista=""
    for i in range(valor_inicial, valor_final+1):
        lista +=f"{i:2d}._____________\n"
    return lista

main()
