"""
Programa para determinar el descuento en base al metodo de pago 
Autor: Logica G2D
Fecha Sep 2024
Licencia: GNU GPL v3

"""


def main():
    metodo_pago=ingresar_entero(("1.Efectivo\n"
                                 "2.Tarjetas de Debito\n"
                                 "3. Cupones\n "
                                 "4. Tarjeta de Credito\n\n"
                                 "Ingrese el numero de su medio de pago: "))
    mensaje=generar_mensaje(metodo_pago)
    mostrar_mensaje(mensaje)


def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero


def generar_mensaje(metodo_pago):
    if metodo_pago==1:
        mensaje="Tienes un descuento del 10% en la compra total."
    elif metodo_pago==2:
        mensaje="Tienes un descuento del 5% en productos seleccionados."
    elif metodo_pago==3:
        mensaje="Tienes un descuento del 2% en productos frescos"
    elif metodo_pago==4:
        mensaje="No cuentamos con descuento para ti"
    return mensaje


def mostrar_mensaje(mensaje):
    print(mensaje)
    
main()
