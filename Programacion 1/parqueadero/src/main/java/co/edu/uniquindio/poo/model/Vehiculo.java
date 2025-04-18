package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;


    public Vehiculo(String placa, String marca , String modelo){
        this.placa= placa;
        this.marca= marca;
        this.modelo=modelo;

    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca (String newPlaca){
        this.placa= newPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "El vehiculo de placa " + placa + " de marca " + marca + " y de modelo " + modelo;
    }

}
