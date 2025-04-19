package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Optional;

public class Consultorio {
    private String nombre;
    private String nit;
    private String ubiacacion;
    private ArrayList <Odontologo> listaOdontologos;
    private ArrayList <Paciente> listaPacientes;


    public Consultorio(String nombre, String nit, String ubiacacion) {
        this.nombre = nombre;
        this.nit = nit;
        this.ubiacacion = ubiacacion;

    }


    public Consultorio(String nombre) {

        this.nombre = nombre;
    }

    public String registrarOdontologo(String idOdontologo) {
        String mensaje = "";
        Odontologo encontrado = null;
        encontrado = buscarOdontologo(idOdontologo);
        if (encontrado != null) {
            mensaje = "El idOdontologo ya existe";
        }else{
            listaOdontologos.add(encontrado);
            mensaje = "El idOdontologo ya existe";
        }
        return mensaje;
    }

    public Odontologo buscarOdontologo(String idOdontologo) {
        Odontologo encontrado = null;
        for (Odontologo aux: listaOdontologos) {
        if(aux.getId().equals(idOdontologo)) {
            encontrado = aux;
            }
        }
        return encontrado;
    }

    public String eliminarOdontologo(String idOdontologo) {
       String mensaje = "";
       Odontologo encontrado = null;
       encontrado = buscarOdontologo(idOdontologo);
       if (encontrado != null) {
           listaOdontologos.remove(encontrado);
           mensaje = "El odontologo se ha eliminado";
       }else{
           mensaje = "El odontologo no existe";
       }
       return mensaje;
    }

    public String registrarPaciente(Paciente paciente) {
        String mensaje = "";
        Optional <Paciente> encontrado = buscarpaceinte(paciente);
        if (encontrado.isPresent()) {
            mensaje = "El paciente ya existe";
        }else{
            listaPacientes.add(paciente);
            mensaje = "El paciente se ha registrado";
        }
        return mensaje;
     }


     public Optional <Paciente> buscarpaceinte(Paciente paciente) {
        return listaPacientes.stream().filter(p-> p.identificacion().equals(paciente.identificacion())).findFirst();
    }

    public String eliminarPaciente(Paciente paciente) {
        String mensaje = "";
        Optional<Paciente> encontrado = buscarpaceinte(paciente);
        if (encontrado.isPresent()) {
            listaPacientes.remove(encontrado.get());
            mensaje = "El paciente se ha eliminado";
        }else{
            mensaje = "El paciente no existe";
        }
        return mensaje;
    }

    public ArrayList<Paciente> obtenerPacietnes5Tratamientos(){
        ArrayList<Paciente> pacientes5Tratamientos = new ArrayList<>();
        for (Paciente aux : listaPacientes) {
            if(aux.cantidadTratamientos() > 5){
                pacientes5Tratamientos.add(aux);
            }
        }
        return pacientes5Tratamientos;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getUbiacacion() {
        return ubiacacion;
    }

    public void setUbiacacion(String ubiacacion) {
        this.ubiacacion = ubiacacion;
    }

    public ArrayList<Odontologo> getListaOdontologos() {
        return listaOdontologos;
    }

    public void setListaOdontologos(ArrayList<Odontologo> listaOdontologos) {
        this.listaOdontologos = listaOdontologos;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", ubiacacion='" + ubiacacion + '\'' +
                ", listaOdontologos=" + listaOdontologos +
                ", listaPacientes=" + listaPacientes +
                '}';
    }
}
