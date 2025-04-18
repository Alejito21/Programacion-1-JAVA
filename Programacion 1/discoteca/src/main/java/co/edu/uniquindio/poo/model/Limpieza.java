package co.edu.uniquindio.poo.model;

public class Limpieza extends Empleado{
    public Limpieza(String id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono, direccion);
    }

    @Override
    public void trabajar(){
        System.out.printf("El sector de limpieza esta trabajando\n");
    }
}
