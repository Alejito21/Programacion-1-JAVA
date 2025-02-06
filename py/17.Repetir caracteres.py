"""
Programa para indicar las caracteres repetidos en dos frases
Autor Logica G2D
Fecha OCT 2024
Licencia GNU GLP v3
"""
from apoyo import ingresar_texto, mostrar_mensaje

def main():
    frase_1=ingresar_texto("Ingrese por favor la primera frase: ")
    frase_2=ingresar_texto("Ingrese por favor la segunda frase: ")
    caracteres_repetidos=determinar_caracteres_repetidos(frase_1, frase_2)
    mensaje=generar_mensaje(frase_1, frase_2, caracteres_repetidos)
    mostrar_mensaje(mensaje)

def determinar_caracteres_repetidos(frase_1, frase_2):
    caracteres = ""
    for letra in frase_1:
        if letra in frase_2 and letra not in caracteres:
            caracteres += letra
    return caracteres

def generar_mensaje(frase_1, frase_2, caracteres_repetidos):
    mensaje=f"Los caracteres repetidos entre la frase 1: {frase_1} y la frase 2: {frase_2} son: {caracteres_repetidos}"
    return mensaje


main()

