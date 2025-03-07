package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Universidad;
import co.edu.uniquindio.poo.model.Estudiante;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("UniQuindío", "Armenia");

        boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú:\n" +
                            "1. Registrar estudiante\n" +
                            "2. Registrar nota a estudiante\n" +
                            "3. Actualizar nota de un estudiante\n" +
                            "4. Calcular promedio de un estudiante\n" +
                            "5. Mostrar estudiantes\n" +
                            "6. Eliminar estudiante\n" +
                            "7. Salir\n\n" +
                            "Seleccione una opción:"
            );

            if (opcion == null) {
                break;
            }

            switch (opcion) {
                case "1":
                    String nombre;
                    do {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                        if (nombre == null) return;
                    } while (nombre.trim().isEmpty());

                    String identificacion;
                    do {
                        identificacion = JOptionPane.showInputDialog("Ingrese la identificación del estudiante (solo números):");
                        if (identificacion == null) return;
                    } while (!identificacion.matches("\\d+"));

                    JOptionPane.showMessageDialog(null, universidad.registrarEstudiante(nombre, identificacion));
                    break;

                case "2":
                    String idEstudiante = solicitarIdentificacion("Ingrese la identificación del estudiante:", universidad);
                    if (idEstudiante == null) break;

                    String nombreNota;
                    do {
                        nombreNota = JOptionPane.showInputDialog("Ingrese el nombre de la nota:");
                        if (nombreNota == null) return;
                    } while (nombreNota.trim().isEmpty());

                    Float valorNota = solicitarNota("Ingrese el valor de la nota (0 a 5):");
                    if (valorNota == null) break;

                    JOptionPane.showMessageDialog(null, universidad.agregarNota(idEstudiante, nombreNota, valorNota));
                    break;

                case "3":
                    String idActualizarNota = solicitarIdentificacion("Ingrese la identificación del estudiante:", universidad);
                    if (idActualizarNota == null) break;

                    String nombreNotaActualizar;
                    do {
                        nombreNotaActualizar = JOptionPane.showInputDialog("Ingrese el nombre de la nota a actualizar:");
                        if (nombreNotaActualizar == null) return;
                    } while (nombreNotaActualizar.trim().isEmpty());

                    Float nuevoValorNota = solicitarNota("Ingrese el nuevo valor de la nota (0 a 5):");
                    if (nuevoValorNota == null) break;

                    JOptionPane.showMessageDialog(null, universidad.actualizarNota(idActualizarNota, nombreNotaActualizar, nuevoValorNota));
                    break;

                case "4":
                    String idPromedio = solicitarIdentificacion("Ingrese la identificación del estudiante:", universidad);
                    if (idPromedio == null) break;

                    double promedio = universidad.calcularPromedio(idPromedio);
                    JOptionPane.showMessageDialog(null, "El promedio del estudiante es: " + promedio);
                    break;

                case "5":
                    StringBuilder listaEstudiantes = new StringBuilder("Lista de estudiantes:\n");
                    for (Estudiante e : universidad.getListaEstudiantes()) {
                        listaEstudiantes.append(e).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, listaEstudiantes.toString());
                    break;

                case "6":
                    String idEliminar = solicitarIdentificacion("Ingrese la identificación del estudiante a eliminar:", universidad);
                    if (idEliminar == null) break;

                    JOptionPane.showMessageDialog(null, universidad.eliminarEstudiante(idEliminar));
                    break;

                case "7":
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }


    private static String solicitarIdentificacion(String mensaje, Universidad universidad) {
        String identificacion;
        do {
            identificacion = JOptionPane.showInputDialog(mensaje);
            if (identificacion == null) return null;
        } while (!identificacion.matches("\\d+"));

        Estudiante estudiante = universidad.buscarEstudiante(identificacion);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Error: El estudiante no existe.");
            return null;
        }

        return identificacion;
    }


    private static Float solicitarNota(String mensaje) {
        while (true) {
            String valorNotaStr = JOptionPane.showInputDialog(mensaje);
            if (valorNotaStr == null) return null;

            try {
                float valorNota = Float.parseFloat(valorNotaStr);
                if (valorNota < 0 || valorNota > 5) {
                    JOptionPane.showMessageDialog(null, "Error: La nota debe estar entre 0 y 5.");
                } else {
                    return valorNota;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.");
            }
        }
    }
}