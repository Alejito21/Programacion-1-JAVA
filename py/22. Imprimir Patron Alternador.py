"""
Programa para imprimir un patron en base a un Cantidad N
Autor Logica G2D
Fecha OCT 2024
Licencia GNU GLP v3
"""
from apoyo import ingresar_entero_mayor_que, mostrar_mensaje

VALOR_MINIMO=0
def main():
    valor=ingresar_entero_mayor_que("Ingrese su valor N: ", VALOR_MINIMO)
    patron=generar_patron(valor)
    mostrar_mensaje(patron)

def generar_patron(valor):
    alternador = True
    dibujo = ""  # Aquí acumularemos todas las filas
    for i in range(valor, 0, -1):
        fila = ""
        for j in range(i):
            if alternador:
                fila += "#"
            else:
                fila += "*"
            alternador = not alternador
        dibujo += fila + "\n"  # Añadimos la fila completa al dibujo y pasamos a la siguiente línea
        if i%2==0:
             alternador= not alternador   # Reiniciamos el alternador para que cada fila comience igual
    return dibujo

main()

    