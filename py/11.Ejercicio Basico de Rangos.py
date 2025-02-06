"""
Archivo dedicado para importar
"""
from apoyo import ingresar_real


NOTA_MINIMA_GANAR= 3.0
NOTA_MINIMA= 0.0
NOTA_MAXIMA= 5.0

def main():
    nota=ingresar_real_rango("Ingrese la nota pertinente: ", NOTA_MINIMA, NOTA_MAXIMA)
    mensaje_nota=generar_mensaje_nota(nota)
    mostrar_mensaje(mensaje_nota)


def ingresar_real_rango(mensaje, nota_minima, nota_maxima):
    repetir= True
    while repetir:
        valor=ingresar_real(mensaje)
        if valor< nota_minima or valor> nota_maxima:
            print(f"Su valor no se encuentra entre {nota_minima} y {nota_maxima}")
        else:
            repetir= False
    return valor

def generar_mensaje_nota(nota):
    if nota>=NOTA_MINIMA_GANAR:
        mensaje="Usted aprobo la asignatura"
    else:
        mensaje="Usted reprobo la asignatura"
    return mensaje

def mostrar_mensaje(mensaje_nota):
    print(f"{mensaje_nota}")


main ()
