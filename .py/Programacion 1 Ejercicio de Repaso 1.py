"""
Programa que te pida ingresar 5 nombres para almacenarlos en una lista. Para luego mostrarlos en el orden inverso al que fueron ingresados
"""
TOTAL_NOMBRES=5

def main():
    lista_nombres=ingresar_lista(TOTAL_NOMBRES)
    mensaje=generar_mensaje(lista_nombres)
    mostrar_mensaje(mensaje)
 

def ingresar_lista(valor):
    lista=[]
    for i in range (0, valor):
        nombre=ingresar_texto("Ingrese el nombre de la persona: ")
        lista.append(nombre)
    return lista

def ingresar_texto(mensaje):
    texto=input(mensaje)
    return texto


def generar_mensaje(lista):
    mensaje="Los nombre ahora quedan de la siguiente manera: "
    lista.reverse()
    for nombre in lista:
        mensaje+=f"\t{nombre}"
    return mensaje



def mostrar_mensaje(mensaje):
    print(mensaje)

main()


    
