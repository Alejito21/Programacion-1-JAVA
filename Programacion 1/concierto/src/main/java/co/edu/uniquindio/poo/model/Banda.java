package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Banda extends Artista {
    private ArrayList<Integrante> listaIntegrantes;

    public Banda(String id, String nombre, String genero, String requisitoTecnico) {
        super(id, nombre, genero, requisitoTecnico);
        this.listaIntegrantes = new ArrayList<>();
    }

    public ArrayList<Integrante> getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(ArrayList<Integrante> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }
}
