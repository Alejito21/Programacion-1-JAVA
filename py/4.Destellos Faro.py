"""
Programa para calcular cuantos destellos por minuto se dan en un faro, en un determinado tiempo
Autor G2D Logica
Fecha Sep 2024
Licencia GNU GLP v3
"""

def main():
    destellos=ingresar_entero("Ingrese por favor el numero de destellos por minuto: ")
    horas=ingresar_entero("Ingrese las horas en las que el faro esta en funcionamiento: ")
    minutos=ingresar_entero("Ingrese los minutos que el faro esta en funiconamiento: ")
    minutos_totales=calcular_minutos(horas, minutos)
    destellos_totales=calcular_total(minutos_totales, destellos)
    mensaje=generar_mensaje(destellos, horas, minutos, destellos_totales)
    mostrar_mensaje(mensaje)


def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def calcular_minutos(horas, minutos):
    minutos_totales=minutos+(horas*60)
    return minutos_totales

def calcular_total(minutos_totales, destellos):
    total=destellos*minutos_totales
    return total

def generar_mensaje(destellos, horas, minutos, destellos_totales):
    mensaje=f"Apreciado Publico. El planetario le informa que el faro produce {destellos_totales} destellos, para {horas} horas y {minutos} minutos, teniendo en cuenta que son {destellos} destellos por minuto"
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()