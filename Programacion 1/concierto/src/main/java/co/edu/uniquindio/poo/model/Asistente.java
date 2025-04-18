package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Asistente {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private ArrayList<Entrada> listaEntradasAsistente;

    public Asistente(String id, String nombre, String apellido, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.listaEntradasAsistente = new ArrayList<>();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Entrada> getListaEntradasAsistente() {
        return listaEntradasAsistente;
    }

    public void setListaEntradasAsistente(ArrayList<Entrada> listaEntradasAsistente) {
        this.listaEntradasAsistente = listaEntradasAsistente;
    }
}
