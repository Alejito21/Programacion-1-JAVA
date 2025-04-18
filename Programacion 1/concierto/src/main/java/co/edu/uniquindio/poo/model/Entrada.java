package co.edu.uniquindio.poo.model;

public abstract class Entrada {
    public String codigo;

    public Entrada(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String newCodigo) {
        this.codigo = newCodigo;
    }
}
