package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class PlataformaGestion {
    private String nombre;
    private String link;
    private ArrayList<Artista> listaArtistas;
    private ArrayList<Entrada> listaEntradas;
    private ArrayList<PersonalTecnico> personalTecnicos;
    private ArrayList<Concierto> listaConciertos;

    public PlataformaGestion(String nombre, String link){
        this.nombre = nombre;
        this.link = link;
        this.listaArtistas = new ArrayList<>();
        this.listaEntradas = new ArrayList<>();
        this.personalTecnicos = new ArrayList<>();
        this.listaConciertos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public ArrayList<PersonalTecnico> getPersonalTecnicos() {
        return personalTecnicos;
    }

    public void setPersonalTecnicos(ArrayList<PersonalTecnico> personalTecnicos) {
        this.personalTecnicos = personalTecnicos;
    }

    public ArrayList<Concierto> getListaConciertos() {
        return listaConciertos;
    }

    public void setListaConciertos(ArrayList<Concierto> listaConciertos) {
        this.listaConciertos = listaConciertos;
    }
}
