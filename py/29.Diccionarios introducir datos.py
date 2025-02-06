"""
Programa que crea un diccionario y junta esa informacion de diferentes maneras
Autro Logica G2D
Fecha Nov 2024
Licencia: GNU GLP v3
"""
from apoyo import ingresar_texto, mostrar_mensaje, ingresar_entero_mayor_que, ingresar__real_mayor_que

VALOR_MIN=0

def main():
    lista=crear_lista()

def crear_lista():
    seguir="s"
    i=0
    diccionario=[]
    while seguir == "s":
        datos=agregar_diccionario(i+1)
        seguir=ingresar_texto("Quieres agregar más aspectos: (s/n): ")
        diccionario.append(datos)
    print (diccionario)

def agregar_diccionario(posicion):
    mostrar_mensaje(f"Ingrese los datos en la posicion {posicion}")
    codigo=ingresar_texto("Ingrese el codigo del estudiante: ")
    nombre=ingresar_texto("Ingrese el nombre del estudiante: ")
    edad=ingresar_entero_mayor_que("Ingrese la edad del estudiante: ",VALOR_MIN)
    notas=ingresar_tuplas("Ingrese las notas del estudiante: ")
    estudiante=(codigo, nombre, edad, notas)
    return estudiante

def ingresar_tuplas(mensaje):
    seguir="s"
    notas=[]
    while seguir == "s":
        datos=ingresar__real_mayor_que(mensaje, VALOR_MIN)
        seguir=ingresar_texto("Quieres agregar más aspectos: (s/n): ") 
    notas.append(datos)
    return notas
main()
