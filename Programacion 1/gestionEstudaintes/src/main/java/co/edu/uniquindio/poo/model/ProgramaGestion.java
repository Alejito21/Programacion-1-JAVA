package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class ProgramaGestion {
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public ProgramaGestion(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
