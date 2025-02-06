def ingresar_entero(mensaje):
    repetir=True
    while repetir:
        try:
         entero=int(input(mensaje))
         repetir=False
        except:
           print("Ingrese por favor un valor entero. ")        
    return entero


def mostrar_mensaje(mensaje):
    print(mensaje)


def ingresar_real(mensaje):
    repetir=True
    while repetir:
        try:
         real=float(input(mensaje))
         repetir=False
        except:
           print("Ingrese por favor un valor adecuado. ")        
    return real


def ingresar_texto(mensaje):
   repetir=True
   while repetir:
        try:
         texto=input(mensaje)
         repetir=False
        except:
           print("Ingrese por favor un valor adecuado. ")        
   return texto


def ingresar_real_rango(mensaje, nota_minima, nota_maxima):
    repetir= True
    while repetir:
        valor=ingresar_real(mensaje)
        if valor< nota_minima or valor> nota_maxima:
            print(f"Su valor no se encuentra entre {nota_minima} y {nota_maxima}")
        else:
            repetir= False
    return valor


def ingresar_entero_rango(mensaje, valor_minima, valor_maxima):
    repetir= True
    while repetir:
        valor=ingresar_entero(mensaje)
        if valor< valor_minima or valor> valor_maxima:
            print(f"Su valor no se encuentra entre {valor_minima} y {valor_maxima}")
        else:
            repetir= False
    return valor


def ingresar_entero_mayor_que(mensaje, valor_minimo):
    repetir=True
    while repetir:
        valor=ingresar_entero(mensaje)
        if valor<= valor_minimo:
            print(f"El valor debe ser mayor al: {valor_minimo}")
        else:
            repetir=False
    return valor

def ingresar__real_mayor_que(mensaje, valor_minimo):
    repetir=True
    while repetir:
        real=ingresar_real(mensaje)
        if real<= valor_minimo:
            print(f"El valor debe ser mayor al: {valor_minimo}")
        else:
            repetir=False
    return real


def generar_lista(valor_inicial, valor_final):
    lista=""
    for i in range(valor_inicial, valor_final+1):
        lista +=f"{i:2d}._____________\n"
    return lista


def generar_listado(valor_inicial, valor_final):
    listado=""
    i=valor_inicial
    while i<= valor_final:
        lista+=f"{i:3d}.______________\n"
        i=i+1
    return listado


def generar_tabla(numero_tabla, minimo_valor, maximo_valor):
    mensaje_tabla=f"\n TABLA DE MULTIPLICAR DEL {numero_tabla}\n\n"
    i= minimo_valor
    while i<= maximo_valor:
        producto= numero_tabla* i
        mensaje_tabla +=f"{numero_tabla:2d} * {i:2d}= {producto:2d}\n"
        i= i+1
    return mensaje_tabla


def obtener_cantidad_vocales(mensaje):
    vocales= 0
    for letra in mensaje:
        if verificar_vocal(letra):
            vocales=vocales+1
    return vocales


def verificar_vocal(letra):
    vocal= letra in "aeiouAEIOUáéíóúÁÉÍÓÚ"
    return vocal