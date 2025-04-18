package co.edu.uniquindio.poo.model;

public class Dj extends Empleado {
    private String nombreArtistico;

    public Dj(String id, String nombre, String telefono, String direccion, String nombreArtistico) {
        super(id, nombre, telefono, direccion);
        this.nombreArtistico = nombreArtistico;
    }

    @Override
    public void trabajar() {
        System.out.printf("El dj esta trabajando: %s\n", nombreArtistico);
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
}
