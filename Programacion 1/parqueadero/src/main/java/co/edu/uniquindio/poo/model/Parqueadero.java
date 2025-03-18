package co.edu.uniquindio.poo.model;


import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;

    public Parqueadero(String nombre, ArrayList<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<Vehiculo>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "nombre='" + nombre + '\'' +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }

    public String agregarVehiculo(String placa, String marca, String modelo) {
        String mensaje = "";
        Vehiculo encontrado = null;
        encontrado = buscarVehiculo(placa);
        Vehiculo nuevo = null;
        if (encontrado != null) {
            mensaje = "El vehiculo ya existe";
        }
        nuevo = new Vehiculo(placa, marca, modelo);
        listaVehiculos.add(nuevo);
        mensaje = "El vehiculo se agrego con exito";


        return mensaje;
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculoAux : listaVehiculos) {
            if (vehiculoAux.getPlaca().equals(placa)) {
                return vehiculoAux;
            }

        }
        return null;

    }

    public void ordenarPorPlaca() {
        int cantidadVehiculos = listaVehiculos.size();
        boolean intercambiado;

        for (int i = 0; i < cantidadVehiculos - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < cantidadVehiculos - i - 1; j++) {
                if (listaVehiculos.get(j).getPlaca().compareTo(listaVehiculos.get(j + 1).getPlaca()) > 0) {
                    Vehiculo temp = listaVehiculos.get(j);
                    listaVehiculos.set(j, listaVehiculos.get(j + 1));
                    listaVehiculos.set(j + 1, temp);
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }

}