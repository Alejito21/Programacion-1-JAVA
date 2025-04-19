package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Optional;

public class Batallon {
    private String id;
    private String nombre;
    private String ubicacion;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Mision> listaMisiones;
    private ArrayList<Soldado> listaSoldados;

    public Batallon(String id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaVehiculos = new ArrayList<>();
        this.listaMisiones = new ArrayList<>();
        this.listaSoldados = new ArrayList<>();
    }



    public String agregarVehiculo(Vehiculo vehiculo) {
        String mensaje = "";
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo2(vehiculo.getId());
        if (optionalVehiculo.isPresent()) {
            mensaje = "La mision ya existe en el sistema";
        }else{
            listaVehiculos.add(vehiculo);
            mensaje = " El mision se ha agregado";
        }
        return mensaje;
    }

    public Vehiculo buscarVehiculo(String idVehiculo) {
        Vehiculo encontrado = null;
        for (Vehiculo aux : listaVehiculos) {
            if(aux.getId().equals(idVehiculo)) {
            encontrado = aux;
            }
        }
        return encontrado;
    }

    public Optional<Vehiculo> buscarVehiculo2(String idVehiculo) {
        return listaVehiculos.stream()
                .filter(v -> v.getId().equals(idVehiculo))
                .findFirst();
    }


    public String actualizarVehiculo(String idVehiculo, int newKilometraje, EstadoOperativo newEstadoOperativo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        encontrado = buscarVehiculo(idVehiculo);
        if (encontrado != null) {
            encontrado.setKilometraje(newKilometraje);
            encontrado.setEstadoOperativo(newEstadoOperativo);
            mensaje = " El vehiculo se ha actualizado";
        }else{
            mensaje = " El vehiculo no existe";
        }
        return mensaje;
    }

    public String eliminarVehiculo(String idVehiculo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        encontrado = buscarVehiculo(idVehiculo);
        if (encontrado != null) {
            listaVehiculos.remove(encontrado);
            mensaje = " El vehiculo se ha eliminado";
        }else{
            mensaje = " El vehiculo no existe";
        }

        return mensaje;
    }

    public String agregarMision(String codigoMision,String fecha, String ubicacion) {
        String mensaje = "";
        Mision encontrado = null;
        encontrado = buscarMision(codigoMision);
        Mision nuevaMison = null;
        if (encontrado != null) {
            mensaje = "La mision ya existe en el sistema";
        }else{
            nuevaMison = new Mision(codigoMision, fecha, ubicacion);
            listaMisiones.add(nuevaMison);
            mensaje = " El mision se ha agregado";
        }
        return mensaje;
    }

    public Mision buscarMision(String idMision) {
        Mision encontrado = null;
        for (Mision aux : listaMisiones) {
            if(aux.getCodigoMision().equals(idMision)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    public String eliminarMision(String idMision) {
        String mensaje = "";
        Mision encontrada = null;
        encontrada = buscarMision(idMision);
        if (encontrada != null) {
            listaMisiones.remove(encontrada);
            mensaje = " El mision se ha eliminado con exito ";
        }
        return mensaje;
    }

    public String agregarSoldado(Soldado soldado) {
        String mensaje = "";
        Optional <Soldado> encontrado = buscarSoldado2(soldado);
        if (encontrado.isPresent()) {
            mensaje = "La soldada ya existe en el sistema";
        }else{
            listaSoldados.add(soldado);
            mensaje = " El soldada se ha agregado";
        }
        return mensaje;
    }

    public Optional<Soldado> buscarSoldado2(Soldado soldado) {
        return listaSoldados.stream().filter(s -> s.id().equals(soldado.id()) ).findFirst();

    }
    public Soldado buscarSoldado(String id) {
        Soldado encontrado = null;
        for (Soldado aux : listaSoldados) {
            if(aux.id().equals(id)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }


    public String eliminarSoldado(Soldado soldado) {
        String mensaje = "";
        Optional <Soldado> encontrado = buscarSoldado2(soldado);
        if (encontrado.isPresent()) {
            listaSoldados.remove(soldado);
            mensaje = " El soldada se ha eliminado";
        }else{
            mensaje = " El soldada no existe";
        }
        return mensaje;
    }

    public Vehiculo obtenerVehiucloMasMisiones(){
        Vehiculo encontrado = null;
        int valorMayor = -1;
        for(Vehiculo aux : listaVehiculos){
            ArrayList<Mision> totalMisiones = aux.getListaMisiones();
            int total = totalMisiones.size();
                if(total > valorMayor){
                    valorMayor = total;
                    encontrado = aux;
                }
            }
        return encontrado;
    }

    public void registrarSoldado2(Soldado soldado) {
        Optional<Soldado> encontrado = buscarSoldado2(soldado);
        if (encontrado.isEmpty()) {
            throw new RuntimeException("El soldado es vacio");
        }
    }

    /*
    public  ArrayList<Soldado> obtenerSoldadosR(){
        ArrayList<Soldado> soldadosR = new ArrayList<>();
        String letra = "";
        for(Soldado aux : listaSoldados){
            letra = aux.nombre().toLowerCase();
            letra.charAt(0);
            if(letra.equals("r")){
                soldadosR.add(aux);
            }
        }
        return soldadosR;
    }


     */

    public ArrayList<Soldado> obtenerSoldadosR() {
        ArrayList<Soldado> soldadosR = new ArrayList<>();
        for (Soldado aux : listaSoldados) {
            if (!aux.nombre().isEmpty() && aux.nombre().toLowerCase().charAt(0) == 'r') {
                soldadosR.add(aux);
            }
        }
        return soldadosR;
    }

    public ArrayList<Vehiculo> obtenerVehiculosDisponibles() {
        ArrayList<Vehiculo> vehiculosDisponibles = new ArrayList<>();
        for (Vehiculo aux : listaVehiculos){
            EstadoOperativo estado = aux.getEstadoOperativo();
            if(estado == EstadoOperativo.DISPONIBLE){
                vehiculosDisponibles.add(aux);
            }
        }
        return vehiculosDisponibles;
    }

    public ArrayList<Apoyo> obtenerApoyoTipoMedico(){
        ArrayList<Apoyo> apoyoTipoMedico = new ArrayList<>();
        ArrayList<Apoyo> listaApoyo = obtenerApoyo();
        for (Apoyo aux : listaApoyo){
            if(aux.getFuncion() == Funcion.MEDICO){
                apoyoTipoMedico.add(aux);
            }
        }

        return apoyoTipoMedico;
    }


    public ArrayList<Apoyo> obtenerApoyo(){
        ArrayList<Apoyo> listaApoyo = new ArrayList<>();
        for (Vehiculo aux : listaVehiculos){
            if(aux instanceof Apoyo){
                listaApoyo.add((Apoyo) aux);
            }
        }
        return listaApoyo;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public ArrayList<Soldado> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(ArrayList<Soldado> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }

    public ArrayList<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public void setListaMisiones(ArrayList<Mision> listaMisiones) {
        this.listaMisiones = listaMisiones;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
