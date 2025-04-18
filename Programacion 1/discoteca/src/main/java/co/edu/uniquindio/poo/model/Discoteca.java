package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Discoteca {
    private String nombre;
    private String ubicacion;
    private String nit;
    private ArrayList<Evento> listaeventos;
    private ArrayList<Asistente> listaAsistentes;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Entrada> listaEntradas;

    public Discoteca(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaeventos = new ArrayList<>();
        this.listaAsistentes = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaEntradas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Evento> getListaeventos() {
        return listaeventos;
    }

    public void setListaeventos(ArrayList<Evento> listaeventos) {
        this.listaeventos = listaeventos;
    }

    public ArrayList<Asistente> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(ArrayList<Asistente> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }
}
