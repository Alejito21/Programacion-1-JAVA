"""
Programa que calcule el valor total de un viaje en base a la distancia recorrida y los dias de estancia
"""
VALOR_KM=89500

def main():
    distancia=ingresar_real("Ingrese los Km recorridos en su viaje: ")
    dias=ingresar_entero("Ingrese el numero de dias de su viaje: ")
    factura=distancia*VALOR_KM
    descuento=determinar_descuento(distancia, dias)
    valor_descuento=calcular_descuento(factura, descuento)
    total=factura-valor_descuento
    mensaje=generar_mensaje(total)
    mostrar_mensaje(mensaje)

    
def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def ingresar_real(mensaje):
    real=float(input(mensaje))
    return real

def determinar_descuento(distancia, dias):
    if distancia>1000 and dias>7:
        descuento=0.3
    else:
        descuento=0
    return descuento

def calcular_descuento(factura, descuento):
    porcentaje=factura*descuento
    return porcentaje

def generar_mensaje(total):
    mensaje=f"El total a pagar es de ${total}"
    return mensaje


def mostrar_mensaje(mensaje):
    print(mensaje)

main()
