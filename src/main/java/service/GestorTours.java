package service;

import model.Tour;
import model.Ubicacion;

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
            InputStream input = getClass().getClassLoader().getResourceAsStream("tours.txt");

            if (input == null) {
                System.out.println("No se encontró el archivo tours.txt");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String tipo = partes[1];
                double precio = Double.parseDouble(partes[2]);
                String comuna = partes[3];
                String region = partes[4];

                Ubicacion ubicacion = new Ubicacion(comuna, region);
                Tour tour = new Tour(nombre, tipo, precio, ubicacion);

                listaTours.add(tour);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del precio: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: faltan datos en una línea del archivo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }

    /**
     * Retorna la lista completa de tours.
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
    /**
     * Busca tours cuyo nombre contenga el texto ingresado.
     */
    public ArrayList<Tour> buscarPorNombre(String textoBuscado) {
        ArrayList<Tour> resultados = new ArrayList<>();

        for (Tour tour : listaTours) {
            if (tour.getNombre().toLowerCase().contains(textoBuscado.toLowerCase())) {
                resultados.add(tour);
            }
        }

        return resultados;
    }
}