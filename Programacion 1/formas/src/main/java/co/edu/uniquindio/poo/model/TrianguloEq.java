package co.edu.uniquindio.poo.model;

public class TrianguloEq implements Figura{
    private double lado;

    public TrianguloEq(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}

