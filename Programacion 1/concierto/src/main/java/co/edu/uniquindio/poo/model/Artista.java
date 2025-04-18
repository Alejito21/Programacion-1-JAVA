package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Artista {
    public String id;
    public String nombreArtistico;
    public String genero;
    public String requisitoTecnico;

    public Artista(String id, String nombreArtistico, String genero, String requisitoTecnico) {
        this.id = id;
        this.nombreArtistico = nombreArtistico;
        this.genero = genero;
        this.requisitoTecnico = requisitoTecnico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRequisitoTecnico() {
        return requisitoTecnico;
    }

    public void setRequisitoTecnico(String requisitoTecnico) {
        this.requisitoTecnico = requisitoTecnico;
    }
}
