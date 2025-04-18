package co.edu.uniquindio.poo.model;


import java.util.ArrayList;

public class Venta {
    private String fecha;
    private double total;
    private ArrayList<DetalleVenta> listaDetallesVentas;
    private Cliente cliente;


    public Venta(String fecha, double total, Cliente cliente) {
        this.fecha = fecha;
        this.total = 0.0;
        this.listaDetallesVentas = new ArrayList<>();
        this.cliente = cliente;

    }


    public String agregarDetalleVenta(int cantidad, double subtotal, Producto producto) {
        String mensaje = "";
        total = 0.0;
        DetalleVenta encontrado = null;
        DetalleVenta detalleVenta = null;
        encontrado = buscarDetalleVenta(producto);
        if (encontrado != null) {
            mensaje = " El producto ya esta registrado";
        } else {
            listaDetallesVentas.add(detalleVenta);
            total += detalleVenta.getSubtotal();
            mensaje = " Se ha añadido la venta de" + detalleVenta.getProducto().getNombre();
        }
        return mensaje;
    }


    public DetalleVenta buscarDetalleVenta(Producto producto) {
        DetalleVenta encontrado = null;
        for (DetalleVenta aux : listaDetallesVentas) {
            if(aux.getProducto().equals(producto)) {
            encontrado = aux;
            }
        }
        return encontrado;
    }

    public String actualizarVenta(int newCantidad, double newSubtotal, Producto producto) {
        String mensaje = "";
        DetalleVenta encontrado = buscarDetalleVenta(producto);
        if (encontrado != null) {
            encontrado.setCantidad(newCantidad);
            encontrado.setSubtotal(newSubtotal);
            mensaje = " El detalle venta se ha actualizado ";
        }else{
            mensaje = " No se ha encotrado el detalle";
        }
        return mensaje;
    }

    public String eliminarVenta(Producto producto) {
        String mensaje = "";
        DetalleVenta encontrado = buscarDetalleVenta(producto);
        if (encontrado != null) {
            listaDetallesVentas.remove(encontrado);
            mensaje = " El detalle venta se ha eliminado ";
        }
        return mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<DetalleVenta> getListaDetallesVentas() {
        return listaDetallesVentas;
    }

    public void setListaDetallesVentas(ArrayList<DetalleVenta> listaDetallesVentas) {
        this.listaDetallesVentas = listaDetallesVentas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return " La venta de fecha: " + fecha + "\n con  el total: " + total + "\n del cliente:" + cliente.getNombre();
    }
}
