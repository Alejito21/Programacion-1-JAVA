package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Asistente {
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private ArrayList<Entrada> entradasAdquiridas;

    public Asistente(String id, String nombre, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.entradasAdquiridas = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Entrada> getEntradasAdquiridas() {
        return entradasAdquiridas;
    }

    public void setEntradasAdquiridas(ArrayList<Entrada> entradasAdquiridas) {
        this.entradasAdquiridas = entradasAdquiridas;
    }
}
