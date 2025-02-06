"""
Programa que resive un diccionario y junta esa informacion
Autro Logica G2D
Fecha Nov 2024
Licencia: GNU GLP v3
"""
from apoyo import mostrar_mensaje

def main():
    diccionario=ingresar_diccionario()
    promedio_estudiantes=calcular_promedio_estudiantes(diccionario)
    aprobados=filtrar_aprobados(promedio_estudiantes)
    mayor_promedio=conseguir_mayor_promedio(diccionario, aprobados)
    mostrar_mensaje(mayor_promedio)

def ingresar_diccionario():
    tabla={"123":{"Codigo": "123", "Notas":(2.3, 4.5, 5.0, 3.5)},
           "234":{"Codigo": "234", "Notas":(3.4, 2.1, 0.6, 4.5)},
           "345": {"Codigo": "345", "Notas": (2.7, 5.0, 3.8, 1.4)},
           "456": {"Codigo": "456", "Notas": (0.5, 3.2, 2.5, 2)}

    }

    return tabla

def calcular_promedio_estudiantes(diccionario):
    promedios=[]
    for estudiante in diccionario:
        promedio=calcular_promedio(diccionario, estudiante)
        promedios.append(promedio)
    return promedios

def calcular_promedio(diccionario, codigo):
    estudiante=diccionario[codigo]
    notas=estudiante["Notas"]
    nota1, nota2, nota3, nota4= notas
    promedio=(nota1 + nota2 + nota3 +nota4)/len(diccionario)
    return promedio

def filtrar_aprobados(promedio_estudiantes):
    ganaron=[]
    for promedio in promedio_estudiantes:
        if promedio >= 3.0:
            ganaron.append(promedio)
    return ganaron

def conseguir_mayor_promedio(diccionario, aprobados):
    mayor_nota=[]
    for nota in aprobados:
        mayor= nota
        if mayor < nota:
            mayor=nota
    for estudiante in diccionario:
        promedio=calcular_promedio(diccionario, estudiante)
        if promedio==mayor:
            mayor_nota.append(estudiante)
    return mayor_nota

main()

