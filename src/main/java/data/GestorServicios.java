package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de crear y gestionar servicios turísticos.
 */
public class GestorServicios {

    public List<ServicioTuristico> crearServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Sabores del Sur", 4.5, 5));
        servicios.add(new RutaGastronomica("Ruta de Frutillar", 3.0, 3));

        servicios.add(new PaseoLacustre("Navegación Llanquihue", 2.5, "Catamarán"));
        servicios.add(new PaseoLacustre("Paseo al atardecer", 1.5, "Lancha"));

        servicios.add(new ExcursionCultural("Circuito Patrimonial", 4.0, "Museo Colonial Alemán"));
        servicios.add(new ExcursionCultural("Ruta Histórica", 5.0, "Fuerte San Antonio"));

        return servicios;
    }
}