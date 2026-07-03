package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        List<ServicioTuristico> servicios = gestor.crearServicios();

        System.out.println("=== SERVICIOS TURÍSTICOS - SEMANA 7 ===");

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio.mostrarInformacion());
        }
    }
}