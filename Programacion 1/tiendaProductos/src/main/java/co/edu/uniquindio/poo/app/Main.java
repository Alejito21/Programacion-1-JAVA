package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Listas para la tienda
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Venta> listaVentas = new ArrayList<>();

        // Crear tienda
        Tienda tienda = new Tienda("Mi Tienda", "Centro", "123456789", listaProductos, listaClientes, listaVentas);

        String[] opciones = {
                "Gestionar clientes", "Gestionar productos", "Agregar una venta",
                "Listar ventas", "Consultar stock bajo", "Cliente con el nombre más largo",
                "Ventas de una sola categoría", "Salir"
        };

        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(
                    null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opciones, opciones[0]
            );

            switch (opcion) {
                case 0: gestionarClientes(tienda); break;
                case 1: gestionarProductos(tienda); break;
                case 2: agregarVenta(tienda); break;
                case 3: listarVentas(tienda); break;
                case 4: consultarStockBajo(tienda); break;
                case 5: JOptionPane.showMessageDialog(null, "Cliente con el nombre más largo: " + tienda.obtenerNombreMasLargo()); break;
                case 6: listarVentasMismaCategoria(tienda); break;
                case 7: JOptionPane.showMessageDialog(null, "Gracias por usar el sistema."); break;
                default: break;
            }
        } while (opcion != 7);
    }

    // -----------------------------------------------
    // 1. GESTIÓN DE CLIENTES
    // -----------------------------------------------
    private static void gestionarClientes(Tienda tienda) {
        String[] opciones = {"Agregar Cliente", "Buscar Cliente", "Actualizar Cliente", "Eliminar Cliente"};
        int opcion = JOptionPane.showOptionDialog(
                null, "Seleccione una opción:", "Gestión de Clientes",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]
        );

        switch (opcion) {
            case 0:
                String id = JOptionPane.showInputDialog("Identificación:");
                String nombre = JOptionPane.showInputDialog("Nombre:");
                String direccion = JOptionPane.showInputDialog("Dirección:");
                String telefono = JOptionPane.showInputDialog("Teléfono:");
                String correo = JOptionPane.showInputDialog("Correo:");
                JOptionPane.showMessageDialog(null, tienda.agregarCliente(id, nombre, direccion, telefono, correo));
                break;
            case 1:
                Cliente cliente = tienda.buscarCliente(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
                JOptionPane.showMessageDialog(null, cliente != null ? cliente.getNombre() : "Cliente no encontrado.");
                break;
            case 2:
                String idActualizar = JOptionPane.showInputDialog("Ingrese la identificación del cliente:");
                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
                String nuevaDireccion = JOptionPane.showInputDialog("Nueva dirección:");
                String nuevoTelefono = JOptionPane.showInputDialog("Nuevo teléfono:");
                String nuevoCorreo = JOptionPane.showInputDialog("Nuevo correo:");
                JOptionPane.showMessageDialog(null, tienda.actualizarCliente(idActualizar, nuevoNombre, nuevaDireccion, nuevoTelefono, nuevoCorreo));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, tienda.eliminarCleinte(JOptionPane.showInputDialog("Ingrese la identificación del cliente:")));
                break;
            default:
                break;
        }
    }

    // -----------------------------------------------
    // 2. GESTIÓN DE PRODUCTOS
    // -----------------------------------------------
    private static void gestionarProductos(Tienda tienda) {
        String[] opciones = {"Agregar Producto", "Buscar Producto", "Actualizar Producto", "Eliminar Producto"};
        int opcion = JOptionPane.showOptionDialog(
                null, "Seleccione una opción:", "Gestión de Productos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]
        );

        switch (opcion) {
            case 0:
                String codigo = JOptionPane.showInputDialog("Código:");
                String nombre = JOptionPane.showInputDialog("Nombre:");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));
                String categoria = JOptionPane.showInputDialog("Categoría:");
                int stock = Integer.parseInt(JOptionPane.showInputDialog("Stock disponible:"));
                JOptionPane.showMessageDialog(null, tienda.agregarProducto(codigo, nombre, precio, categoria, stock));
                break;
            case 1:
                Producto producto = tienda.buscarProducto(JOptionPane.showInputDialog("Ingrese el código del producto:"));
                JOptionPane.showMessageDialog(null, producto != null ? producto.toString() : "Producto no encontrado.");
                break;
            case 2:
                String codigoActualizar = JOptionPane.showInputDialog("Ingrese el código del producto:");
                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
                double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio:"));
                String nuevaCategoria = JOptionPane.showInputDialog("Nueva categoría:");
                int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Nuevo stock:"));
                JOptionPane.showMessageDialog(null, tienda.actualizarVenta(codigoActualizar, nuevoNombre, nuevoPrecio, nuevaCategoria, nuevoStock));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, tienda.eliminarProducto(JOptionPane.showInputDialog("Ingrese el código del producto:")));
                break;
            default:
                break;
        }
    }

    // -----------------------------------------------
    // 3. AGREGAR VENTA
    // -----------------------------------------------
    private static void agregarVenta(Tienda tienda) {
        String fecha = JOptionPane.showInputDialog("Fecha de la venta:");
        String idCliente = JOptionPane.showInputDialog("Identificación del cliente:");
        Cliente cliente = tienda.buscarCliente(idCliente);
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        double total = Double.parseDouble(JOptionPane.showInputDialog("Total de la venta:"));
        JOptionPane.showMessageDialog(null, tienda.agregarVenta(fecha, total, cliente));
    }

    // -----------------------------------------------
    // 4. LISTAR VENTAS
    // -----------------------------------------------
    private static void listarVentas(Tienda tienda) {
        StringBuilder ventasString = new StringBuilder();
        for (Venta venta : tienda.getListaVentas()) {
            ventasString.append(venta.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, ventasString.toString(), "Lista de Ventas", JOptionPane.INFORMATION_MESSAGE);
    }

    // -----------------------------------------------
    // 5. CONSULTAR STOCK BAJO
    // -----------------------------------------------
    private static void consultarStockBajo(Tienda tienda) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el límite de stock:"));
        JOptionPane.showMessageDialog(null, tienda.obtenerStockMenores(limite));
    }

    // -----------------------------------------------
    // 6. LISTAR VENTAS MISMA CATEGORÍA
    // -----------------------------------------------
    private static void listarVentasMismaCategoria(Tienda tienda) {
        JOptionPane.showMessageDialog(null, tienda.ventasIguales(), "Ventas de una misma categoría", JOptionPane.INFORMATION_MESSAGE);
    }
}


