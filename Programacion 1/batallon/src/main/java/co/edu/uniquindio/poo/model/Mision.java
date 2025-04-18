package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Mision {
    private String codigoMision;
    private String fecha;
    private String ubicacion;
    private final ArrayList<Soldado> soldadosRequeridos = new ArrayList<>();
    private final ArrayList<Vehiculo> vehiculosRequeridos = new ArrayList<>();

    public Mision(String codigoMision,String fecha, String ubicacion) {
        this.codigoMision = codigoMision;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public String getCodigoMision() {
        return codigoMision;
    }

    public void setCodigoMision(String newCodigoMision) {
        this.codigoMision = newCodigoMision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String newfecha) {
        this.fecha = newfecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String newUbicacion) {
        this.ubicacion = newUbicacion;
    }

    public ArrayList<Soldado> getSoldadosRequeridos() {
        return soldadosRequeridos;
    }

    public ArrayList<Vehiculo> getVehiculosRequeridos() {
        return vehiculosRequeridos;
    }


}
