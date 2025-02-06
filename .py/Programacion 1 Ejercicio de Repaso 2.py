"""
Programa que cambie el orden de una lista de manera ascendente, sin usar la funcion de Python sort 
"""

LISTA=[2,3,4,45,6,7,8,8,2,1,2,3,4,7,5,3,4,2,3,2]

def main():
    lista_organizada=organizar_lista(LISTA)
    mensaje=generar_mensaje(lista_organizada)
    mostrar_mensaje(mensaje)

def organizar_lista(lista):
    n=len(lista)
    for i in range(n):
        for j in range(0, n-i-1):
           if lista[j] > lista[j+1]:
               lista[j], lista [j+1]= lista[j+1], lista[j]
    return lista

def generar_mensaje(lista):
    mensaje=f"El nuevo orden de la lista: {LISTA} "
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()


