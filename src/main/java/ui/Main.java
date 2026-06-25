package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        ServicioTuristico[] servicios = gestor.crearServicios();

        System.out.println("=== SERVICIOS TURÍSTICOS ===");

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}