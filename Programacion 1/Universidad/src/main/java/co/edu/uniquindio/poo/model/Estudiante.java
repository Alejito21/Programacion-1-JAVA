package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Estudiante {
    private String nombreEstudiante;
    private String identificacion;
    private ArrayList<Nota> listaNotas;

    public Estudiante(String nombre, String identificacion) {
        this.nombreEstudiante = nombre;
        this.identificacion = identificacion;
        this.listaNotas = new ArrayList<Nota>();
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }

    public String registrarNota(String nombreNota, float valorNota) {
        String mensaje = "";
        Nota encontrada = null;
        Nota nuevaNota = null;
        encontrada = buscarNota(nombreNota);
        if (encontrada != null) {
            mensaje = "La nota " + encontrada.getNombre() + "ya existe en el sistema";
        }
        nuevaNota = new Nota(nombreNota, valorNota);
        listaNotas.add(nuevaNota);
        mensaje = "Nota registrada exitosamente";

        return mensaje;
    }

    public Nota buscarNota(String nombreNota) {
        Nota encontrada = null;
        for (Nota notaAux : listaNotas) {
            if (notaAux.getNombre().equals(nombreNota)) {
                return notaAux;
            }
        }
        return encontrada;
    }

    public String actualizarNota(String nombreNota, float newValorNota) {
        String mensaje = "";
        for (Nota nombreNotaAux : listaNotas) {
            if (nombreNotaAux != null && nombreNotaAux.getNombre().equals(nombreNota)) {
                nombreNotaAux.setValor(newValorNota);
                mensaje = "Nota actualizada exitosamente";
            }
        }
        return mensaje;
    }

    public float calcularPromedio(){
        float promedio = 0;
        int contador = 0;
        for (Nota notaAux : listaNotas) {
            if (notaAux != null) {
                promedio += notaAux.getValor();
                contador++;
            }
        }
        promedio = promedio/contador;
        return promedio;
    }


}


