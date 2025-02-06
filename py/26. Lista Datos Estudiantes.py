"""
Programa que en base a los datos de los estudiantes(Edad, Nombre, Estatura y su promedio academico) determine aquellos mayores de edad y menores de edad
Autro Logica G2D
Fecha Nov 2024
Licencia: GNU GLP v3
"""
from apoyo import ingresar_entero_mayor_que,ingresar__real_mayor_que, ingresar_real_rango, ingresar_texto, mostrar_mensaje

VALOR_MIN= 0
NOTA_MIN= 0.0
NOTA_MAX=5.0

def main():
    estudaintes=ingresar_entero_mayor_que("Ingrese la cantidad de estudiantes: ", VALOR_MIN)
    datos_estudiantes=ingresar_estudiantes(estudaintes)
    mayor_edad=filtrar_mayoria_edad(datos_estudiantes)
    menor_edad=filtrar_menores_edad(datos_estudiantes)
    mensaje=generar_mensaje(mayor_edad, menor_edad)
    mostrar_mensaje(mensaje)

def ingresar_estudiantes(estudaintes):
    datos=[]
    for i in range(0, estudaintes):
        estudiante=ingresar_datos(i+1, VALOR_MIN, NOTA_MIN, NOTA_MAX)
        datos.append(estudiante)
    return datos

def ingresar_datos(posicion, valor_min, nota_min, nota_max):
    mostrar_mensaje(f"Ingrese los datos del estudainte {posicion}\n")
    nombre=ingresar_texto("Ingrese el nombre del estudiante: ")
    edad=ingresar_entero_mayor_que("Ingrese la edad del estuainte: ", valor_min)
    estatura=ingresar__real_mayor_que("Ingrese la estatura del estudiante: ", valor_min)
    promedio=ingresar_real_rango("Ingrese el promedio del estudiante: ", nota_min, nota_max)
    estudiante=(nombre, edad, estatura, promedio)
    return estudiante

def filtrar_mayoria_edad(datos_estudiantes):
    mayor=[]
    for estudiante in datos_estudiantes:
        edad=estudiante[1]
        if edad>=18:
            mayor.append(estudiante)
    return mayor

def filtrar_menores_edad(datos_estudiantes):
    menor=[]
    for estudiante in datos_estudiantes:
        edad=estudiante[1]
        if edad<18:
            menor.append(estudiante)
    return menor

def generar_mensaje(mayor_edad, menor_edad):
    mensaje=f"Las persoans mayores de edad son: \n"
    for estudiantes in mayor_edad:
        mensaje+=f"{estudiantes[0]}\n"
    mensaje+=f"Siendo un total de: {len(mayor_edad)}\n"
    mensaje+=f"Las persoans menores de edad son: \n"
    for estudiantes in menor_edad:
        mensaje+=f"{estudiantes[0]}\n"
    mensaje+=f"Siendo un total de: {len(menor_edad)}"
    return mensaje

main()
