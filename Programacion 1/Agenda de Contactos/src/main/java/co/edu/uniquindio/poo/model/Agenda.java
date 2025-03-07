package co.edu.uniquindio.poo.model;


public class Agenda {
    private String nombreAgenda;
    private String nombrePropietario;
    private Contacto listaContactos[];

    public Agenda(String nombreAgenda, String nombrePropietario, int cantidadContactos) {
        this.nombreAgenda = nombreAgenda;
        this.nombrePropietario = nombrePropietario;
        this.listaContactos = new Contacto[cantidadContactos];
    }

    public String registrarContacto(Contacto contacto) {
        int posDisponible = buscarPosicionDisponible();
        if (posDisponible == -1) {
            return "No hay espacio para agregar más contactos";
        }
        listaContactos[posDisponible] = contacto;
        return "Contacto agregado correctamente.";
    }


    public Contacto buscarContacto(String nombre) {
        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if (contactoAux.getNombre().equals(nombre)) {
                return contactoAux;
            }
        }
        return null;
    }

    public String eliminarContacto(String nombre){
        String mensaje ="";
        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux= listaContactos[i];
            if (contactoAux != null && contactoAux.getNombre().equals(nombre)) {
                listaContactos[i] = null;
                return "Contacto eliminado correctamente.";
            }
        }

        return mensaje;
    }

    public String modificarContacto(String nombreActual, String newNombre) {
        String mensaje =" El contacto a actualizar no existe en la base de datos";
        Contacto contactoEncontrado = null;
        contactoEncontrado = buscarContacto(nombreActual);
        if (contactoEncontrado != null){
            contactoEncontrado.setNombre(newNombre);
            return "Contacto actualizado correctamente.";
        }
        return mensaje;
    }

    private int buscarPosicionDisponible() {
        int posDisponible = -1;
        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if (contactoAux == null) {
                return i;
            }
        }
        return posDisponible;
    }

    @Override
    public String toString() {
        StringBuilder contactos = new StringBuilder("Agenda: " + nombreAgenda + "\nPropietario: " + nombrePropietario + "\n\nContactos registrados:\n");

        for (Contacto contacto : listaContactos) {
            if (contacto != null) {
                contactos.append(contacto.toString()).append("\n");
            }
        }

        return contactos.toString();
    }


}