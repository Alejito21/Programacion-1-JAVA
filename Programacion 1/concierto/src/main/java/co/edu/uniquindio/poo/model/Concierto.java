package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Concierto {
    private String identificacion;
    private Date fecha;
    private String lugar;
    private Estado estado;
    private ArrayList<Artista> artistasConcierto;
    private ArrayList<Asistente> asistentesConcierto;


    public Concierto(String identificacion, Date fecha, String lugar, Estado estado) {
        this.identificacion = identificacion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estado = estado;
        this.artistasConcierto = new ArrayList<>();
        this.asistentesConcierto = new ArrayList<>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Artista> getArtistasConcierto() {
        return artistasConcierto;
    }

    public void setArtistasConcierto(ArrayList<Artista> artistasConcierto) {
        this.artistasConcierto = artistasConcierto;
    }

    public ArrayList<Asistente> getAsistentesConcierto() {
        return asistentesConcierto;
    }

    public void setAsistentesConcierto(ArrayList<Asistente> asistentesConcierto) {
        this.asistentesConcierto = asistentesConcierto;
    }
}
