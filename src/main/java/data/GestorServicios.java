package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de crear instancias de prueba de servicios turísticos.
 */
public class GestorServicios {

    public ServicioTuristico[] crearServicios() {

        ServicioTuristico[] servicios = new ServicioTuristico[6];

        servicios[0] = new RutaGastronomica("Sabores del Sur", 4.5, 5);
        servicios[1] = new RutaGastronomica("Ruta de Frutillar", 3.0, 3);

        servicios[2] = new PaseoLacustre("Navegación Llanquihue", 2.5, "Catamarán");
        servicios[3] = new PaseoLacustre("Paseo al atardecer", 1.5, "Lancha");

        servicios[4] = new ExcursionCultural("Circuito Patrimonial", 4.0, "Museo Colonial Alemán");
        servicios[5] = new ExcursionCultural("Ruta Histórica", 5.0, "Fuerte San Antonio");

        return servicios;
    }
}