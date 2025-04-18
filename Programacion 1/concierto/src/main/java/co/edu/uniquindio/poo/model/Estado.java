package co.edu.uniquindio.poo.model;

public enum Estado {
    PROGRAMADO(0), CANCELADO(1), FINALIZADO(2);

    private final int valor;
    Estado(int valor) {
        this.valor = valor;
    }
}
