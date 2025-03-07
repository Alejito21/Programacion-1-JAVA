package co.edu.uniquindio.poo.model;

public class Nota{
    private String nombre;
    private Float valor;


    public Nota (String nombre, Float valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " La nota: " + nombre + "\nValor: " + valor;
    }
}
