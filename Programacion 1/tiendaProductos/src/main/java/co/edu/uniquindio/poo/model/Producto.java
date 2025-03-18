package co.edu.uniquindio.poo.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String categoria;
    private int stockDisponible;

    public Producto(String codigo, String nombre, double precio, String categoria, int stockDisponible){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stockDisponible = stockDisponible;

    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getStockDisponible(){
        return stockDisponible;
    }

    public void setCodigo( String newCodigo){
        this.codigo = newCodigo;
    }

    public void setNombre( String newNombre){
        this.nombre = newNombre;
    }

    public void setPrecio( double newPrecio){
        this.precio = newPrecio;
    }

    public void setCategoria( String newCategoria){
        this.categoria = newCategoria;
    }

    public void setStockDisponible( int newStockDisponible){
        this.stockDisponible = newStockDisponible;
    }

    public String toString(){
        return " El producto " + nombre + " Con el codigo " + codigo + " su precio es " + precio + " Es de la categoria " + categoria + " y el stock disponible es de: " + stockDisponible;
    }

}
