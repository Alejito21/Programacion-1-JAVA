package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Empleado {
    public String id;
    public String nombre;
    public String telefono;
    public String direccion;
    public ArrayList<Turno> turnosEmpleado;

    public Empleado(String id, String nombre, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.turnosEmpleado = new ArrayList<>();
    }

    public abstract void trabajar();
}
