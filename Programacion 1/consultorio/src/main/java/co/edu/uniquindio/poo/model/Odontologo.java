package co.edu.uniquindio.poo.model;

public class Odontologo {
    private String id;
    private String nombre;
    private String numeroLicencia;
    private Especialidad especialidad;


    public Odontologo(String id, String nombre, String numeroLicencia, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String newNumeroLicencia) {
        this.numeroLicencia = newNumeroLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad newEspecialidad) {
        this.especialidad = newEspecialidad;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
