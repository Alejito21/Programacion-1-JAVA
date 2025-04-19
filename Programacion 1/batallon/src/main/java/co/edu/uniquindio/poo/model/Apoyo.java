package co.edu.uniquindio.poo.model;

public class Apoyo extends Vehiculo {
    private Funcion funcion;
    public Apoyo(String id, String modelo, String fechaFabricacion,EstadoOperativo estadoOperativo, int numerosMisiones, Funcion funcion) {
        super(id, modelo, fechaFabricacion,estadoOperativo, numerosMisiones);
        this.funcion = funcion;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion newFuncion) {
        this.funcion = newFuncion;
    }
}
