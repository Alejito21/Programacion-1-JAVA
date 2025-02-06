"""
Programa para imprimir tablas de multiplizar en un rango
Autor Logica G2D
Fecha OCT 2
Licencia GNU GLP v3
"""

from apoyo import  generar_tabla, ingresar_entero_rango, mostrar_mensaje

VALOR_MINIMO_TABLA= 0
VALOR_MAXIMO_TABLA= 10
MINIMO_TABLA=0
MAXIMO_TABLA=30

def main():
    limite_inferior=ingresar_entero_rango("Ingrese el numero que figura como limite inferior.", MINIMO_TABLA, MAXIMO_TABLA)
    limite_superior=ingresar_entero_rango("Ingrese el numero que figura como el limite superior.", MINIMO_TABLA, MAXIMO_TABLA)
    tablas=generar_tablas(limite_inferior,limite_superior, VALOR_MAXIMO_TABLA, VALOR_MINIMO_TABLA)
    mostrar_mensaje(tablas)

def generar_tablas(limite_inferior,limite_superior,valor_maximo_tabla,valor_minimo_tabla):
    mensaje_tablas=f"\n TABLAS DE MULTIPLICAR DEL {limite_inferior} A {limite_superior}"
    i=limite_inferior
    while i<= limite_superior:
        mensaje_tablas+=generar_tabla(i, valor_minimo_tabla, valor_maximo_tabla)
        i=i+1
    return mensaje_tablas

main()
