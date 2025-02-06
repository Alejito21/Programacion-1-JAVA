"""
Programa para sumar numeros de unsa sucecion en base si son pares o impares
Autro Alejito
Fecha OCT 2024
Licencia: GNU GLP v3
"""
from apoyo import ingresar_entero_mayor_que, ingresar_entero, mostrar_mensaje

def main():
    limite_inferior=ingresar_entero("Ingrese el numero de su preferencia para el limite inferior: ")
    limite_superior=ingresar_entero_mayor_que("ingrese el numero que se tomara como limite superior: ", limite_inferior)
    suma_par=calcular_suma_par(limite_inferior, limite_superior)
    suma_impar=calcular_suma_impar(limite_inferior, limite_superior)
    mensaje=generar_mensaje(suma_par, suma_impar)
    mostrar_mensaje(mensaje)

def calcular_suma_par(limite_inferior, limite_superior):
    suma_par=calcular_suma(limite_inferior, limite_superior, 0)
    return suma_par

def calcular_suma_impar(limite_inferior, limite_superior):
    suma_impar=calcular_suma(limite_inferior, limite_superior, 1)
    return suma_impar

def calcular_suma(limite_inferior, limite_superior, residuo):
    suma= 0
    valor=limite_inferior
    while valor<=limite_superior:
        if valor%2==residuo:
            suma=suma+valor
        valor=valor+1
    return suma

def generar_mensaje(suma_par, suma_impar):
    mensaje=f"La suma de los numeros pares en la secuencia dada es de: {suma_par} y la suma de los numeros impares es de {suma_impar}"
    return mensaje

main()

        

