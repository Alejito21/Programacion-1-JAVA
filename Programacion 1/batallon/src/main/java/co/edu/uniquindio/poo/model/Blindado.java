package co.edu.uniquindio.poo.model;

public class Blindado extends Vehiculo {
    private String nivelBlindaje;
    public Blindado(String id, String modelo, String fechaFabricacion, int kilometraje, EstadoOperativo estadoOperativo, int numeroMisiones, String nivelBlindaje){
        super(id, modelo, fechaFabricacion,kilometraje,estadoOperativo, numeroMisiones);
        this.nivelBlindaje = nivelBlindaje;
    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String newNivelBlindaje) {
        this.nivelBlindaje = newNivelBlindaje;
    }
}
