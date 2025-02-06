"""
Programa para decir las difernetes vocales de una frase dada por el usuario sin repetir vocal
Autor Logica G2D
Fecha OCT 2
Licencia GNU GLP v3
"""

from apoyo import ingresar_texto, mostrar_mensaje, verificar_vocal

def main():
  frase=ingresar_texto("Ingrese la frase de su preferencia: ")
  cantidad_vocales=obtener__vocales_usadas(frase)
  mensaje=generar_mensaje(cantidad_vocales)
  mostrar_mensaje(mensaje)

def obtener__vocales_usadas(mensaje):
  vocales_empleadas=""
  for letra in mensaje:
    if verificar_vocal(letra):
      if letra not in vocales_empleadas:
        vocales_empleadas=vocales_empleadas+letra
  return vocales_empleadas

def generar_mensaje(cantidad_vocales):
  mensaje=f"Dada su frase las vocales empleadas fueron: {cantidad_vocales}"
  return mensaje

main()

