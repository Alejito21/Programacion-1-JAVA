package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Evento {
    private String nombre;
    private Date fecha;
    private ArrayList<Asistente> asistentes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Dj> djes;
    private TipoEvento tipo;

    public Evento(String nombre, Date fecha, TipoEvento tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.asistentes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.djes = new ArrayList<>();
        this.tipo = tipo;
    }

    public String agregarDj(Dj dj) {
        String mensaje = "";
        Optional<Dj> encontrado = buscarDj(dj);
        if (encontrado.isPresent()) {
            mensaje= " El dj ya esta registrado";
        }else{
            djes.add(dj);
            mensaje= " El dj ha sido registrado";
        }
        return mensaje;
    }

    public Optional<Dj> buscarDj(Dj dj){
        return djes.stream().filter(d-> d.getNombreArtistico().equals(dj.getNombreArtistico())).findFirst();
    }

    public String eliminarDj(Dj dj) {
        String mensaje = "";
        Optional<Dj> encontrado = buscarDj(dj);
        if (encontrado.isPresent()) {
            djes.remove(dj);
            mensaje= " El dj ha sido eliminado";
        }else{
            mensaje= " El dj no esta en la lista";
        }
        return mensaje;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Dj> getDjes() {
        return djes;
    }

    public void setDjes(ArrayList<Dj> djes) {
        this.djes = djes;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
}
