"""
Programa que determine de precio de hospitalizacion en base a los dias  y el valor del dia, descuento del 5% por prestacion de servicios
"""

def main():
    dias=ingresar_entero("Ingrese los dias de su hopitalizacion: ")
    precio_hospitalizacion=ingresar_entero("Ingrese el precio diario de hospitalizacion: ")
    hospitalizacion=calcular_total(dias, precio_hospitalizacion)
    descuento=calcular_descuento(hospitalizacion)
    total=hospitalizacion-descuento
    mensaje=generar_mensaje(hospitalizacion, descuento, total)
    mostrar_mensaje(mensaje)

def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def calcular_total(dias, precio_hospitalizacion):
    valor= dias* precio_hospitalizacion
    return valor

def calcular_descuento(hospitalizacion):
    descuento= hospitalizacion*0.05
    return descuento

def generar_mensaje(hospitalizacion, descuento, total):
    mensaje=f"Su hospitalizacion sin descuento es de ${hospitalizacion}, con su descuento de ${descuento} le queda en ${total}"
    return mensaje


def mostrar_mensaje(mensaje):
    print(mensaje)

main()
