package co.edu.uniquindio.poo.model;

public class Backstage extends Entrada {
    private final String precioBackstage;
    private final String beneficiosBackstage;


    public Backstage(String codigo, String precioBackstage, String beneficiosBackstage) {
        super(codigo);
        this.precioBackstage = precioBackstage;
        this.beneficiosBackstage = beneficiosBackstage;
    }

    public String getPrecioBackstage() {
        return precioBackstage;
    }

    public String getBeneficiosBackstage() {
        return beneficiosBackstage;
    }
}
