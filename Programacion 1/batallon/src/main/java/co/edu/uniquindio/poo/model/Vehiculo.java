package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Optional;

public abstract class Vehiculo {
    public String id;
    public String modelo;
    public String fechaFabricacion;
    public float kilometraje;
    public EstadoOperativo estadoOperativo;
    public int numeroMisiones;
    public ArrayList<Mision> listaMisiones;


    public Vehiculo(String id, String modelo, String fechaFabricacion, EstadoOperativo estadoOperativo, int numeroMisiones) {
        this.id = id;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.kilometraje = 0;
        this.estadoOperativo = estadoOperativo;
        this.numeroMisiones = numeroMisiones;
        this.listaMisiones = new ArrayList<>();
    }

    public String registrarMision(Mision mision) {
        String mensaje = "";
        Optional<Mision> misionBuscada = buscarMision(mision);
        if (!misionBuscada.isPresent()) {
            listaMisiones.add(mision);
            numeroMisiones++;
            mensaje = "El mision se ha registrado con exito";
        }else{
            mensaje = "El mision ya existe";
        }
        return mensaje;
    }

    public float sumarKilometraje(float cantidad1, float cantidad2) {
        kilometraje = cantidad1 + cantidad2;
        return kilometraje;
    }

    public Optional<Mision> buscarMision(Mision mision) {
         return listaMisiones.stream()
                .filter(m -> m.getCodigoMision().equals(mision.getCodigoMision()))
                .findFirst();
    }

    public void agregarKilometraje(int cantidad) {
        if(cantidad < 0) {
            throw new RuntimeException("Cantidad negativa no se puede agregar");
        }else{
            kilometraje += cantidad;
        }
    }


    public ArrayList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(ArrayList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String newFechaFabricacion) {
        this.fechaFabricacion = newFechaFabricacion;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float newKilometraje) {
        this.kilometraje = newKilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo newEstadoOperativo) {
        this.estadoOperativo = newEstadoOperativo;
    }

    public int getNumeroMisiones() {
        return numeroMisiones;
    }

    public void setNumeroMisiones(int numeroMisiones) {
        this.numeroMisiones = numeroMisiones;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", kilometraje=" + kilometraje +
                ", estadoOperativo=" + estadoOperativo +
                '}';
    }
}
