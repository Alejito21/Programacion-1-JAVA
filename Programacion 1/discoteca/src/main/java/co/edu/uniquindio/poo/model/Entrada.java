package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Entrada {
    private int costo;
    private Date fecha;
    private Tipo tipo;

    public Entrada(int costo, Date fecha, Tipo tipo) {
        this.costo = costo;
        this.fecha = fecha;
        this.tipo = tipo;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
