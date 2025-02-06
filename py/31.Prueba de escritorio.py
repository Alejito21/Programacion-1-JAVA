"""
Prueba de escritorio de algunas funciones
"""
from apoyo import ingresar_entero, mostrar_mensaje

def main():
    n=ingresar_entero("Por favor ingrese su valor n: ")
    secuencia=contarSecuencai(n)
    mostrar_mensaje(secuencia)



def contarSecuencai(n):
    contador=0
    for i in range(0,n+1):
        for j in range(1, n-i+1):
            if (i+j) %2==0:
                contador+=1
    return contador

main()


