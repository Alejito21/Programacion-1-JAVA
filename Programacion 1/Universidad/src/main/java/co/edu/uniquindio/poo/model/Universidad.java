package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Estudiante> listaEstudiantes;

    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEstudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "La universidad " + nombre + " tiene la ubicacion: " + ubicacion + "y una  lista de estudiantes: " + listaEstudiantes;
    }


    public String registrarEstudiante(String nombreEstudiante, String identificacion) {
        String mensaje = "";
        Estudiante encontrado = null;
        Estudiante nuevoEstudiante = null;
        encontrado = buscarEstudiante(identificacion);
        if (encontrado != null) {
            mensaje = "El estudiante " + encontrado.getNombreEstudiante() + "ya existe en el sistema";
        }
        nuevoEstudiante = new Estudiante(nombreEstudiante, identificacion);
        listaEstudiantes.add(nuevoEstudiante);
        mensaje = "Estudiante registrado correctamente";

        return mensaje;
    }

    public Estudiante buscarEstudiante(String identificacion) {
        Estudiante encontrado = null;
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                return estudianteAux;
            }
        }
        return encontrado;
    }

    public String actualizarEstudiante(String newNombreEstudiante, String identificacion) {
        String mensaje = "";
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                estudianteAux.setNombreEstudiante(newNombreEstudiante);
                mensaje = "Estudiante actualizado correctamente";
            }
        }
        return  mensaje;
    }


    public String eliminarEstudiante(String identificacion) {
        String mensaje = "";
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                listaEstudiantes.remove(estudianteAux);
                mensaje = "Estudiante eliminado correctamente";
            }
        }
        return mensaje;
    }

    public String agregarNota(String identificacion, String nombreNota, float valorNota) {
        String mensaje = "";
        Estudiante estudianteAux = buscarEstudiante(identificacion);
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                mensaje = estudianteAux.registrarNota(nombreNota , valorNota);
            }else{
                mensaje = " El estudiante no esta registrado";
            }

        return mensaje;
    }

    public String actualizarNota(String identificacion, String nombreNota, float newValorNota) {
        String mensaje = "";
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                mensaje = estudianteAux.actualizarNota(nombreNota , newValorNota);
            }
        }
        return mensaje;
    }

    public double calcularPromedio(String identificacion) {
        double promedio = 0;
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                promedio = estudianteAux.calcularPromedio();
            }
        }
        return promedio;
    }
}