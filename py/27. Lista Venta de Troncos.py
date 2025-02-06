"""
Programa que en base a las medidas de los trocnos determine cuales se pueden vender
Autro Logica G2D
Fecha Nov 2024
Licencia: GNU GLP v3
"""
from apoyo import ingresar_entero_mayor_que, ingresar__real_mayor_que, mostrar_mensaje

VALOR_MIN=0
GROSOR_MIN=100.0
GROSOR_MAX=140.0

def main():
    troncos=ingresar_entero_mayor_que("Ingrese la cantidad de troncos: ", VALOR_MIN)
    datos_troncos=ingresar_datos(troncos)
    troncos_venta=filtrar_troncos(datos_troncos, GROSOR_MIN, GROSOR_MAX)
    mensaje=generar_mensaje(troncos_venta)
    mostrar_mensaje(mensaje)

def ingresar_datos(troncos):
    datos=[]
    for i in range(0, troncos):
        tronco=ingresar_troncos(i+1,VALOR_MIN)
        datos.append(tronco)
    return datos

def ingresar_troncos(posicion, valor_min):
    mostrar_mensaje(f"Ingrese los datos de cada tronco {posicion}\n")
    grosor=ingresar__real_mayor_que("Ingrese el grosor del tronco: ", valor_min)
    largo=ingresar__real_mayor_que("Ingrese la altura del tronoc: ", valor_min)
    tronco=(grosor, largo)
    return tronco

def filtrar_troncos(datos_troncos, grosor_min, grosor_max):
    para_venta=[]
    for tronco in datos_troncos:
        grosor=tronco[0]
        if grosor >grosor_min and grosor < grosor_max:
            para_venta.append(tronco)
    return para_venta

def generar_mensaje(troncos_venta):
    mensaje=f"\n Los troncos que estan para la venta son: {len(troncos_venta)} \n"
    for troncos in troncos_venta:
        mensaje+=f"Con unas medidas de: {troncos[0]}mm de grosor y {troncos[1]}mm de largo\n"
    return mensaje

main()
