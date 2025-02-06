"""
Programa para calcular el costo total de un viaje en base a medio de transporte y la distancia recorrida
Autor G2D Logica
Fecha Sep 2024
Licencia GNU GLP v3
"""

def main():
    medio_trasnporte=ingresar_texto(("1.Tren\n"
                                    "2. Otro medio de transporte\n\n"
                                    "Escriba el medio de trasnporte que usa: "))
    distancia=ingresar_entero("Ingrese la distancia recorrida en Km: ")
    valor_viaje=determinar_valor(medio_trasnporte)
    valor_total=calcular_total(distancia, valor_viaje)
    mensaje=generar_mensaje(valor_total, valor_viaje, distancia, medio_trasnporte)
    mostrar_mensaje(mensaje)

def ingresar_texto(mensaje):
    texto=input(mensaje)
    return texto

def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def determinar_valor(medio_transporte):
    match medio_transporte:
        case "Tren":
            coste_viaje= 2000
        case _:
            coste_viaje= 5000
    return coste_viaje


def calcular_total(distancia, valor_viaje):
    coste_total_viaje= distancia*valor_viaje
    return coste_total_viaje


def generar_mensaje(valor_total, valor_viaje, distancia, medio_trasnporte):
    mensaje=f"Con su medio de transporte: {medio_trasnporte}, la tarifa del viaje es de {valor_viaje} y con su distancia de {distancia} Km el valor total de su viaje es de ${valor_total}"
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()