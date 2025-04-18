package co.edu.uniquindio.poo.model;

public class Bartender extends Empleado {
    public Bartender(String id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono, direccion);

    }

    @Override
    public void trabajar(){
        System.out.printf("El Batender esta trabajando\n");
    }
}
