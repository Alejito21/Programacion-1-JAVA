package co.edu.uniquindio.poo.model;

public class Solista extends Artista {
    private String nombreSolistario;
    private String apellido;

    public Solista(String id, String nombreArtistico, String genero, String requisitoTecnico,String nombreSolistario, String apellido) {
        super(id, nombreArtistico, genero, requisitoTecnico);
        this.nombreSolistario = nombreSolistario;
        this.apellido = apellido;
    }

    public String getNombreSolistario() {
        return nombreSolistario;
    }

    public void setNombreSolistario(String nombreSolistario) {
        this.nombreSolistario = nombreSolistario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
