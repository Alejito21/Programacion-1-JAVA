package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Agenda;

import javax.swing.*;


public class Main {
    public static void main(String[] args){
        String nombreAgenda = JOptionPane.showInputDialog( null,"Ingresa el nombre de tu agenda; ");
        String nombrePropietario = JOptionPane.showInputDialog(null, " A quien le pertenece la Agenda ? ");
        int cantidadContactos = 2;

        Agenda agenda = new Agenda (nombreAgenda, nombrePropietario, cantidadContactos);

        for (int i = 0; i < cantidadContactos; i++) {
            String nombre = JOptionPane.showInputDialog(null, " Ingresa el nombre del contacto " + (i + 1) + ": ");
            String telefono = JOptionPane.showInputDialog(null, "Ingresa el teléfono del contacto " + (i + 1) + ": ");

            Contacto contacto = new Contacto(nombre, telefono);
            String mensaje = agenda.registrarContacto(contacto);
            JOptionPane.showMessageDialog(null, mensaje);
        }

        // Mostrar confirmación final
        JOptionPane.showMessageDialog(null, "Los " + cantidadContactos + " han sido registrados");
        JOptionPane.showMessageDialog(null, agenda.toString());
    }









}




