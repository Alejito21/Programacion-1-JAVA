"""
Programa para contar las difernetes vocales de una frase dada por el usuario
Autor Logica G2D
Fecha OCT 2
Licencia GNU GLP v3
"""

from apoyo import ingresar_texto, mostrar_mensaje

def main():
    frase=ingresar_texto("Ingrese la frase de su preferencia: ")
    cantidad_vocales=obtener_cantidad_vocales(frase)
    mensaje=generar_mensaje(cantidad_vocales)
    mostrar_mensaje(mensaje)

def obtener_cantidad_vocales(mensaje):
    vocales= 0
    for letra in mensaje:
        if verificar_vocal(letra):
            vocales=vocales+1
    return vocales

def verificar_vocal(letra):
    vocal= letra in "aeiouAEIOUáéíóúÁÉÍÓÚ"
    return vocal

def generar_mensaje(cantidad_vocales):
    mensaje=f"En la frase anteriormente dada la cantidad de vocales usadas es {cantidad_vocales}"
    return mensaje

main()
