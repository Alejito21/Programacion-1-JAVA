"""
Programa para determinar un descuento en base si un cliente es VIP y en la distnaica del viaje
"""

def main():
    desicion=ingresar_texto("Si es un cliente VIP(Si/No): ")
    vip=determinar_vip(desicion)
    precio=ingresar_real("Ingrese el valor del KM: ")
    distancia=ingresar_real("Ingrese la cantidad de KM recorridos: ")
    factura=precio*distancia
    descuento=determinar_descuento(distancia, vip)
    valor_descuento=calcular_descuento(factura, descuento)
    valor_total=calcular_total(factura, valor_descuento)
    mensaje=generar_mensaje(factura, valor_total, valor_descuento)
    mostrar_mensaje(mensaje)


def ingresar_texto(mensaje):
    texto=input(mensaje)
    return texto


def ingresar_real(mensaje):
    real=float(input(mensaje))
    return real

def determinar_vip(desicion):
    if desicion=="Si":
        vip=True
    else:
        vip=False
    return vip

def determinar_descuento(distancia, vip):
    if vip==True and distancia>2000:
        descuento=0.25
    elif vip==True and distancia>=1000 and distancia<=2000:
        descuento=0.15
    elif vip==True and distancia<1000:
        descuento=0.10
    elif vip==False and distancia>2000:
        descuento=0.15
    elif vip==False and distancia>=1000 and distancia<=2000:
        descuento=0.10
    else:
        descuento=0.05
    return descuento

def calcular_descuento(factura, descuento):
    porcentaje=factura*descuento
    return porcentaje

def calcular_total(factura, valor_descuento):
    total=factura-valor_descuento
    return total

def generar_mensaje(factura, valor_total, valor_descuento):
    mensaje=f"Su factura era de ${factura}, con el descuento de ${valor_descuento} dando un valor total de {valor_total}"
    return mensaje


def mostrar_mensaje(mensaje):
    print(mensaje)

main()
