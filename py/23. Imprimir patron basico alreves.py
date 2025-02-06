from apoyo import ingresar_entero_mayor_que, mostrar_mensaje

VALOR_MINIMO=0

def main():
    n=ingresar_entero_mayor_que("Ingrese el valor n: ", VALOR_MINIMO)
    patron=generar_patron(n)
    mostrar_mensaje(patron)


def generar_patron(n):
    dibujo = ""
    # Invertimos el patrón, empezamos desde el tamaño más grande y disminuimos
    dibujo += repetir_caracter("*", n + 2) + "\n"  # La línea completa de asteriscos va al principio
    for j in range(n, 0, -1):
        dibujo += repetir_caracter("*", 1)  # Un solo asterisco al inicio
        dibujo += repetir_caracter(".", j-1)  # Puntos según el valor de j
        dibujo += repetir_caracter("*", 1)  # Un solo asterisco al final
        dibujo += "\n"
    return dibujo


def repetir_caracter(caracter,cantidad):
    mensaje= ""
    for i in range (0, cantidad):
        mensaje+= caracter
    return mensaje

main()
