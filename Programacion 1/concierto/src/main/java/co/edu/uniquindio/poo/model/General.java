package co.edu.uniquindio.poo.model;

public class General extends Entrada {
    private final String precioGeneral;
    private final String beneficiosGeneral;


    public General(String codigo, String precioGeneral, String beneficiosGeneral) {
        super(codigo);
        this.precioGeneral = precioGeneral;
        this.beneficiosGeneral = beneficiosGeneral;
    }

    public String getPrecioGeneral() {
        return precioGeneral;
    }

    public String getBeneficiosGeneral() {
        return beneficiosGeneral;
    }
}
