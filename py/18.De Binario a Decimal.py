"""
Programa para pasar de un numero binario(de una longitud de 8) a un numero decimal
Autro Alejito
Fecha Sep 2024
Licencia: GNU GLP v3
"""

from apoyo import ingresar_texto, mostrar_mensaje

LONGITUD= 8

def main():
    binario=ingresar_texto_longitud("Ingrese su numero binario: ", LONGITUD)
    decimal=convertir_binario_decimal(binario)
    mensaje=generar_mensaje(binario,decimal)
    mostrar_mensaje(mensaje)

def ingresar_texto_longitud(mensaje,longitud):
    repetir=True
    while repetir:
        texto=ingresar_texto(mensaje)
        if len(texto) !=longitud:
            print(f"Lo sentimos pero su binario debe contener la longitud de {longitud}")
        else:
            repetir=False
    return texto


def convertir_binario_decimal(binario):
    valor=0
    potencia=0
    i=len(binario)-1
    while i>=0:
        valor= valor+int(binario[i])*2**potencia
        potencia=potencia+1
        i=i-1
    return valor

def generar_mensaje(binario,decimal):
    mensaje=f"En base a su binario: {binario} la equivalecnia a decimal es de: {decimal}"
    return mensaje

main()

