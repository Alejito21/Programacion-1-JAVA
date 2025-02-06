"""
Programa para cifrar y descifrar una frase dada por el usuario
Autor Logica G2D
Fecha OCT 2024
Licencia GNU GLP v3
"""
from apoyo import ingresar_texto, mostrar_mensaje

DESPLAZAMIENTO=1

def main():
    frase=ingresar_texto("Ingrese una frase de su preferencia: ")
    cifrado=cifrar_frase(frase, DESPLAZAMIENTO)
    descifrado=descifrar_frase(cifrado, DESPLAZAMIENTO)
    mensaje=generar_mensaje(cifrado, descifrado)
    mostrar_mensaje(mensaje)

def cifrar_frase(frase, desplazamiento):
    cifrado=""
    for letra in frase:
        cifrado+=chr(ord(letra)+desplazamiento)
    return cifrado

def descifrar_frase(cifrado, desplazamiento):
    descifrado=""
    for letra in cifrado:
        descifrado+=chr(ord(letra)-desplazamiento)
    return descifrado

def generar_mensaje(cifrado, descifrado):
    mensaje=f"Con la frase en cuestion su cifrado queda de la siguiente manera: {cifrado} y su desifrado es: {descifrado}"
    return mensaje

main()


