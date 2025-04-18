package co.edu.uniquindio.poo.model;
import java.util.ArrayList;


public class Tienda {
    private String nombre;
    private String ubicacion;
    private String nit;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Venta> listaVentas;


    public Tienda(String nombre, String ubicacion, String nit, ArrayList<Producto> listaProductos, ArrayList<Cliente> listaClientes, ArrayList<Venta> listaVentas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaProductos = listaProductos;
        this.listaClientes = listaClientes;
        this.listaVentas = listaVentas;
    }

    public String agregarProducto(String codigo, String nombre, double precio, String categoria, int stockDisponible) {
        String mensaje = "";
        Producto encontrado = null;
        Producto producto = null;
        encontrado = buscarProducto(codigo);
        if (encontrado != null) {
            mensaje = "El producto ya existe en el sistema";
        }else{
            producto = new Producto(codigo, nombre, precio, categoria, stockDisponible);
            listaProductos.add(encontrado);
            mensaje = "El producto fue agregado en el sistema";
        }
        return mensaje;
    }

    public Producto buscarProducto(String codigo) {
        Producto encontrado = null;
        for (Producto aux : listaProductos) {
            if(aux.getCodigo().equals(codigo)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    public String actualizarProducto(String codigo, String newNombre, double newPrecio, String newCategoria, int newStockDisponible) {
        String mensaje = "";
        Producto encontrado = buscarProducto(codigo);
        if (encontrado != null) {
            encontrado.setNombre(newNombre);
            encontrado.setPrecio(newPrecio);
            encontrado.setCategoria(newCategoria);
            encontrado.setStockDisponible(newStockDisponible);
            mensaje = " El Producto fue actualizado ";
        }else{
            mensaje = " El producto no existe en el sistema";
        }
        return mensaje;
    }

    public String eliminarProducto(String codigo) {
        String mensaje = "";
        Producto encontrado = buscarProducto(codigo);
        if(encontrado != null) {
            listaProductos.remove(encontrado);
            mensaje = " El Producto fue eliminado ";
        }
        return mensaje;
    }

    public String agregarCliente(String identificacion, String nombre, String direccion, String telefono, String correo) {
        String mensaje = "";
        Cliente encontrado = null;
        Cliente cliente = null;
        encontrado = buscarCliente(identificacion);
        if (encontrado != null) {
            mensaje = "El cliente ya existe en el sistema";
        }else{
            cliente = new Cliente(identificacion, nombre, direccion, telefono, correo);
            listaClientes.add(encontrado);
            mensaje = "El cliente fue agregado <3 ";
        }
        return mensaje;
    }

    public Cliente buscarCliente(String identificacion) {
        Cliente encontrado = null;
        for (Cliente aux : listaClientes) {
            if(aux.getIdentificacion().equals(identificacion)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    public String actualizarCliente(String identificacion, String newNombre, String newDireccion, String newTelefono, String newCorreo) {
        String mensaje = "";
        Cliente encontrado = buscarCliente(identificacion);
        if (encontrado != null) {
            encontrado.setNombre(newNombre);
            encontrado.setDireccion(newDireccion);
            encontrado.setTelefono(newTelefono);
            encontrado.setCorreo(newCorreo);
            mensaje = " El Cliente se actualizo ";
        }else{
            mensaje = " El cliente no existe en el sistema ";
        }
        return mensaje;
    }

    public String eliminarCleinte(String identificacion) {
        String mensaje = "";
        Cliente encontrado = buscarCliente(identificacion);
        if(encontrado != null) {
            listaClientes.remove(encontrado);
            mensaje = " El Cliente fue eliminado ";
        }
        return mensaje;
    }

    public String agregarVenta(String fecha, double total, Cliente cliente) {
        String mensaje = "";
        Venta encontrado = null;
        Venta venta = null;
        encontrado = buscarVenta(fecha);
        if (encontrado != null) {
            mensaje = "La venta fue agregada ";
        }else{
            venta = new Venta(fecha, total, cliente);
            listaVentas.add(encontrado);
            mensaje = "La venta fue agregada en el sistema";
        }
        return mensaje;
    }

    public Venta buscarVenta(String fecha) {
        Venta encontrado = null;
        for (Venta aux : listaVentas) {
            if (aux.getFecha().equals(fecha)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    public String actualizarVenta(String fecha, double newTotal, Cliente newCliente) {
        String mensaje = "";
        Venta encontrado = buscarVenta(fecha);
        if (encontrado != null) {
            encontrado.setTotal(newTotal);
            encontrado.setCliente(newCliente);
            mensaje = " La venta se actualizo ";
        }else{
            mensaje = "La venta no existe en el sistema ";
        }
        return mensaje;
    }

    public String eliminarVenta(String fecha) {
        String mensaje = "";
        Venta encontrado = buscarVenta(fecha);
        if (encontrado != null) {
            listaVentas.remove(encontrado);
            mensaje = " El venta se eliminado ";
        }
        return mensaje;
    }





    //Metodo que devuelve todos los productos cuyo Stock sea menor a uno ingresado por el usuario

    public ArrayList<Producto> obtenerStockMenores (int valor){
        ArrayList<Producto> stockMenor = new ArrayList<>();
        for (Producto productoAux : listaProductos){
            int stock = productoAux.getStockDisponible();
            if (stock < valor){
                stockMenor.add(productoAux);
            }
        }

        return stockMenor;
    }

    //Metodo que devuelve el nombre mas largo.

    public String obtenerNombreMasLargo(){
        String nombreMasLargo = "";
        for (Cliente clienteAux : listaClientes){
            String nombre = clienteAux.getNombre();
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }
        return nombreMasLargo;
    }




    //Metodo que retorne las ventas de un cliente que compro todos los elementos de una misma categoria

    public ArrayList<Venta> ventasIguales (){
        ArrayList<Venta> ventasCategoria = new ArrayList<>();
        for (Venta ventaAux : listaVentas){
            ArrayList<DetalleVenta> detalles = ventaAux.getListaDetallesVentas();
            String categoriaReferencia = detalles.get(0).getProducto().getCategoria();
            boolean mismaCategoria = true;
            for (DetalleVenta detalleAux : detalles){
                if(!detalleAux.getProducto().getCategoria().equals(categoriaReferencia)){
                    mismaCategoria = false;
                }
            }
            if(mismaCategoria){
                ventasCategoria.add(ventaAux);
            }
        }
        return ventasCategoria;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> newListaProductos) {
        this.listaProductos = newListaProductos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public String toString() {
        return "Tienda de nombre " + nombre + " \n esta ubicada en: " + ubicacion + " y tiene un nit de  " + nit;
    }
}
