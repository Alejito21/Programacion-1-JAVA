package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.Circulo;
import co.edu.uniquindio.poo.model.Cuadrado;
import co.edu.uniquindio.poo.model.Figura;
import co.edu.uniquindio.poo.model.TrianguloEq;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new TrianguloEq(3));

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
