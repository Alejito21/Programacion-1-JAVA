package co.edu.uniquindio.poo.model;

public class Veterinaria {
    private String nombre;
    private String ubicacion;
    private String nit;
    private Mascota listaMascotas[] = new Mascota[5];


    public Veterinaria(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
    }


    public String agregarMascota(Mascota mascota){
        String mensaje = " La mascota no se puede resgistrar.";
        int posDisponible = -1;
        posDisponible = buscarPosDisponible();
        if(posDisponible != -1){
            listaMascotas[posDisponible] = mascota;
            mensaje = " La mascota se ha registrado";
        }

        return mensaje;
    }


    public int buscarPosDisponible(){
        int posDisponible = -1;
        for (int i = 0; i <listaMascotas.length; i++){
            if(listaMascotas[i] != null){
                posDisponible = i;
            }
        }
        return posDisponible;
    }


    public Mascota buscarMascota(String nombre){
        Mascota mascotaEncontrada = null;
        for(Mascota mascotaAux: listaMascotas){
            if(mascotaAux.getNombre().equals(nombre)){
                mascotaEncontrada = mascotaAux;
            }
        }
        return mascotaEncontrada;
    }


    public String eliminarMascota(String nombre ){
        String mensaje = "";
        for (int i = 0; i <listaMascotas.length; i++){
        Mascota mascota = listaMascotas[i];
        if(mascota.getNombre().equals(nombre)){
            listaMascotas[i] = null;
            mensaje = " La mascota se ha eliminado";
        }
        }
        return mensaje;
    }


    public String actulizarMascota(String nombre, String newNombre){
        String mensaje = "";
        for (Mascota mascotaAux: listaMascotas){
            if(mascotaAux.getNombre().equals(nombre)){
                mascotaAux.setNombre(newNombre);
                mensaje = "La mascota se ha actualizado ";
            }
        }
        return mensaje;
    }

}