"""
Programa que determine un descuento en base a la bosa que tenga el cliente
Autor Logica G2D
Fecha Sep 2024
Licencia: GNU GPL v3
"""

def main():
    tipo_bolsa=ingresar_texto(("1.Plastica\n"
                               "2.Biodegradable\n"
                               "3.Francesa\n\n"
                               "Escribe el tipo de Bolsa que utilizas: "))
    compra=ingresar_entero("Ingrese el valor total de su compra: ")
    descuento=determinar_descuento(tipo_bolsa)
    descuento_total=valor_descuento(compra,descuento)
    mensaje=generar_mensaje(tipo_bolsa, descuento, compra, descuento_total)
    mostrar_mensaje(mensaje)

def ingresar_texto(mensaje):
    texto=input(mensaje)
    return texto

def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def determinar_descuento(tipo_bolsa):
    match tipo_bolsa:
        case "Plastica":
            porcentaje_descuento=0.10
        
        case "Biodegradable":
            porcentaje_descuento=0.15
        
        case "Francesa":
            porcentaje_descuento=0.02
        case _:
            porcentaje_descuento=0.00

    return porcentaje_descuento

def valor_descuento(compra,descuento):
    descuento_total=compra-(compra*descuento)
    return descuento_total

def generar_mensaje(tipo_bolsa, porcentaje_descuento, compra, descuento_total):
    mensaje=f"Con su bolsa {tipo_bolsa}, su descuento equivale al {porcentaje_descuento*100}%.Con esto su compra originalmente de {compra}, termina en {descuento_total}."
    return mensaje

def mostrar_mensaje(mensaje):
    print(mensaje)

main()