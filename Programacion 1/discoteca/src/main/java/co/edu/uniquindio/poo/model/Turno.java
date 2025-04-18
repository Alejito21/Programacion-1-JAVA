package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Turno {
    private Date fecha;
    private Date fechaFinal;
    private ArrayList<Empleado> empleadosTurno;

    public Turno(Date fecha, Date fechaFinal) {
        this.fecha = fecha;
        this.fechaFinal = fechaFinal;
        this.empleadosTurno = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<Empleado> getEmpleadosTurno() {
        return empleadosTurno;
    }

    public void setEmpleadosTurno(ArrayList<Empleado> empleadosTurno) {
        this.empleadosTurno = empleadosTurno;
    }
}
