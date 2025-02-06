"""
Prueba de escritorio de algunas funciones
"""
from apoyo import ingresar_entero, mostrar_mensaje

def main():
    n=ingresar_entero("Por favor ingrese su valor n: ")
    secuencia=contarSecuencai(n)
    mostrar_mensaje(secuencia)



def contarSecuencai(n):
    salida=""
    i=1
    while i<= n:
        j=n-i
        while j>=0:
            salida=salida + f"{i} : {j}\n"
            j=j-2
        i=i+3
    return salida

main()
