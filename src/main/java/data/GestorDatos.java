package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase encargada de leer el archivo tours.txt
 * y almacenar los tours en un ArrayList.
 */
public class GestorDatos {

    // Lista donde se guardarán los objetos Tour
    private ArrayList<Tour> listaTours;

    /**
     * Constructor que inicializa la lista de tours.
     */
    public GestorDatos() {
        listaTours = new ArrayList<>();
    }

    /**
     * Método que lee el archivo tours.txt desde resources,
     * separa cada línea con split(";"),
     * crea objetos Tour y los guarda en la lista.
     */
    public void cargarDatos() {
        try {
            // Abre el archivo tours.txt desde la carpeta resources
            InputStream input = getClass().getClassLoader().getResourceAsStream("tours.txt");

            // Si no encuentra el archivo, muestra mensaje y termina
            if (input == null) {
                System.out.println("No se encontró el archivo tours.txt");
                return;
            }

            // Permite leer el archivo línea por línea
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String linea;

            // Lee cada línea hasta llegar al final del archivo
            while ((linea = reader.readLine()) != null) {

                // Separa los datos usando ; como delimitador
                String[] partes = linea.split(";");

                // Guarda cada parte en una variable
                String nombre = partes[0];
                String tipo = partes[1];
                double precio = Double.parseDouble(partes[2]);

                // Crea un objeto Tour con los datos de la línea
                Tour tour = new Tour(nombre, tipo, precio);

                // Agrega el objeto Tour al ArrayList
                listaTours.add(tour);
            }

            // Cierra el lector
            reader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del precio: " + e.getMessage());
        }
    }

    /**
     * Retorna la lista completa de tours.
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
}
