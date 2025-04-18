package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public record Paciente(String identificacion, int numeroHistroiaClinica, String nombre, int edad, String telefono, String dirreccion, LocalDate fecha, int cantidadTratamientos) {

    @Override
    public int numeroHistroiaClinica() {
        return numeroHistroiaClinica;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int edad() {
        return edad;
    }

    @Override
    public String telefono() {
        return telefono;
    }

    @Override
    public String dirreccion() {
        return dirreccion;
    }

    @Override
    public LocalDate fecha() {
        return fecha;
    }

    @Override
    public int cantidadTratamientos() {
        return cantidadTratamientos;
    }
}

