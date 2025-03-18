package co.edu.uniquindio.poo.model;

public class Cliente {
    private String identificacion;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;

    public Cliente(String identificacion, String nombre, String direccion, String telefono, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return "Cliente identificado con " + identificacion + " de nombre " + nombre + " Que vive en " + direccion + " posee un telefono " + telefono + " correo " + correo;
    }
}
