package co.edu.uniquindio.poo.model;

public class Seguridad extends Empleado{
    public Seguridad(String id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono, direccion);
    }

    @Override
    public void trabajar(){
        System.out.printf("La Seguridad esta trabajando\n");
    }
}
