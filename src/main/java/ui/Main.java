package ui;

import data.GestorDatos;
import model.Tour;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {

    public static void main(String[] args) {

        // Crea el gestor de datos
        GestorDatos gestor = new GestorDatos();

        // Carga los tours desde el archivo tours.txt
        gestor.cargarDatos();

        // Muestra todos los tours cargados
        System.out.println("=== LISTA COMPLETA DE TOURS ===");
        for (Tour tour : gestor.getListaTours()) {
            System.out.println(tour);
        }

        // Filtra los tours con precio mayor a 60000
        System.out.println();
        System.out.println("=== TOURS CON PRECIO MAYOR A 60000 ===");
        for (Tour tour : gestor.getListaTours()) {
            if (tour.getPrecio() > 60000) {
                System.out.println(tour);
            }
        }

        // Filtra los tours de tipo Gastronomico
        System.out.println();
        System.out.println("=== TOURS DE TIPO GASTRONOMICO ===");
        for (Tour tour : gestor.getListaTours()) {
            if (tour.getTipo().equalsIgnoreCase("Gastronomico")) {
                System.out.println(tour);
            }
        }
    }
}