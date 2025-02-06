"""
Programa para generar un tabla de multiplicar
Autro Alejito
Fecha Sep 2024
Licencia: GNU GLP v3
"""

from apoyo import ingresar_entero_rango, mostrar_mensaje

MINIMO_VALOR_TABLA= 0
MAXIMO_VALOR_TABLA= 10
MINIMO_TABLA= 0
MAXIMO_TABLA= 20

def main():
    numero_tabla=ingresar_entero_rango("Ingrese un numero para generar su tabla: ", MINIMO_TABLA, MAXIMO_TABLA)
    mensaje_tabla=generar_tabla(numero_tabla, MINIMO_VALOR_TABLA, MAXIMO_VALOR_TABLA)
    mostrar_mensaje(mensaje_tabla)

def generar_tabla(numero_tabla, minimo_valor, maximo_valor):
    mensaje_tabla=f"\n TABLA DE MULTIPLICAR DEL {numero_tabla}\n\n"
    i= minimo_valor
    while i<= maximo_valor:
        producto= numero_tabla* i
        mensaje_tabla+=f"{numero_tabla:2d} * {i:2d}= {producto:2d}\n"
        i= i+1
    return mensaje_tabla

main()
