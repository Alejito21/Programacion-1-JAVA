package co.edu.uniquindio.poo.model;

public class DetalleVenta {
    private int cantidad;
    private double subtotal;
    private Producto producto;


    public DetalleVenta(int cantidad,Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = cantidad * producto.getPrecio();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tiene una cantidad " + cantidad + " De un producto: " + producto + " Dando un subtotal: " + subtotal;
    }
}
