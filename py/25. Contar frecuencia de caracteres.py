"""
Programa para contar la frecuencia de caracteres en una frase y luego mostrar esa frecuencia en *
Autor Logica G2D
Fecha OCT 2024
Licencia GNU GLP v3
"""
from apoyo import ingresar_texto, mostrar_mensaje

def main():
    frase=ingresar_texto("Por favor ingrese la frase que desee: ")
    frecuencia_caracteres=contar_frecuencia_caracteres(frase)
    mostrar_mensaje(frecuencia_caracteres)


def contar_frecuencia_caracteres(frase):
    # Diccionario para almacenar la frecuencia de cada caracter
    frecuencia = {}
    
    # Contar la frecuencia de cada caracter
    for caracter in frase:
        caracter = caracter.lower()  # Convertir a minúsculas
        if caracter in frecuencia:
            frecuencia[caracter] += 1
        else:
            frecuencia[caracter] = 1
    
    # Construir el mensaje con las frecuencias
    mensaje = "La frecuencia de cada caracter es:\n"
    for caracter, frecuencia in frecuencia.items():  # Uso correcto de items()
        mensaje += f"{caracter}: {'*' * frecuencia}\n"  # Representación con asteriscos

    return mensaje  # Retornar el mensaje completo


main()