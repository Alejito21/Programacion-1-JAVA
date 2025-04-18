package co.edu.uniquindio.poo.model;

public class Vip extends  Entrada{
    private final String precioVip;
    private final String beneficiosVip;

    public Vip(String codigo, String precioVip, String beneficiosVip) {
        super(codigo);
        this.precioVip = precioVip;
        this.beneficiosVip = beneficiosVip;
    }

    public String getPrecioVip() {
        return precioVip;
    }

    public String getBeneficiosVip() {
        return beneficiosVip;
    }
}
