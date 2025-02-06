"""
Programa para determinar el tipo de envio, en base a la Region de usuario
Autor: Logica G2D
Fecha Sep 2024
Licencia: GNU GPL v3

"""

def main():
    region=ingresar_entero(("1.Region Andina\n"
                            "2. Region Orinoquia\n"
                            "3. Region Pacifica\n"
                            "4. Regiones Caribe y Amazonia\n"
                            "5.Insular\n\n"
                            "Ingrese el número de su región: "))
    mensaje=generar_mensaje(region)
    mostrar_mensaje(mensaje)

def ingresar_entero(mensaje):
    entero=int(input(mensaje))
    return entero

def generar_mensaje(region):
    if region== 1:
        mensaje="Su entrega será de forma inmediata"
    elif region==2:
        mensaje="Su entrega se realizará el dia siguiente"
    elif region==3:
        mensaje="Su entrega será del tipo estandar"
    elif region==4:
        mensaje="Su entrega será del tipo economica"
    else:
        mensaje="Por el momento no tenemos cobertura para la Region Insular"
    return mensaje


def mostrar_mensaje(mensaje):
    print(mensaje)

main()

        