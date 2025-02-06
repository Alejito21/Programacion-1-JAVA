"""
Programa que genere una tabla de mutiplicar de un numero dado por el usuario
"""

def main():
   numero=ingresar_entero_mayor_que("Ingresa un valor: ", 0)
   tabla=generar_tabla(numero)
   mostrar_mensaje(tabla)

def ingresar_entero_mayor_que(mensaje, valor_minimo):
    repetir=True
    while repetir:
        valor=ingresar_entero(mensaje)
        if valor<= valor_minimo:
            print(f"El valor debe ser mayor al: {valor_minimo}")
        else:
            repetir=False
    return valor
   
def ingresar_entero(mensaje):
    repetir=True
    while repetir:
        try:
         entero=int(input(mensaje))
         repetir=False
        except:
           print("Ingrese por favor un valor entero. ")        
    return entero

def generar_tabla(n):
   mensaje=f"Esta es la tabla del numero {n}:\n"
   for i in range(1, 11):
      producto= n * i 
      mensaje+=f"{n} * {i} = {producto}\n"
   return mensaje

def mostrar_mensaje(mensaje):
   print(mensaje)

main()


  
