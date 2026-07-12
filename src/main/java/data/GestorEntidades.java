package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

/**
 * Gestiona las entidades registrables de Llanquihue Tour.
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    /**
     * Inicializa la colección de entidades.
     */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una nueva entidad a la colección.
     *
     * @param entidad objeto que implementa Registrable
     */
    public void agregarEntidad(Registrable entidad) {
        if (entidad == null) {
            throw new IllegalArgumentException(
                    "La entidad no puede ser nula."
            );
        }

        entidades.add(entidad);
    }

    /**
     * Agrega objetos iniciales para probar el sistema.
     */
    public void cargarDatosIniciales() {
        agregarEntidad(new GuiaTuristico(
                "GUI-001",
                "Ana Pérez",
                "Trekking"
        ));

        agregarEntidad(new Vehiculo(
                "VEH-001",
                "Minibús Hyundai",
                "ABCD12",
                "Minibús"
        ));

        agregarEntidad(new ColaboradorExterno(
                "COL-001",
                "Carlos Díaz",
                "Chofer"
        ));
    }

    /**
     * Retorna todas las entidades registradas.
     *
     * @return colección de entidades
     */
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    /**
     * Recorre la colección y muestra información utilizando
     * polimorfismo e instanceof.
     */
    public void mostrarEntidadesPorConsola() {

        System.out.println("=== ENTIDADES REGISTRADAS ===");

        for (Registrable entidad : entidades) {

            // Comportamiento polimórfico
            System.out.println(entidad.mostrarResumen());

            // Diferenciación según el tipo real
            if (entidad instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) entidad;

                System.out.println(
                        "Acción específica: asignar rutas de "
                                + guia.getEspecialidad()
                );

            } else if (entidad instanceof Vehiculo) {
                Vehiculo vehiculo = (Vehiculo) entidad;

                System.out.println(
                        "Acción específica: revisar documentación del vehículo "
                                + vehiculo.getPatente()
                );

            } else if (entidad instanceof ColaboradorExterno) {
                ColaboradorExterno colaborador =
                        (ColaboradorExterno) entidad;

                System.out.println(
                        "Acción específica: coordinar funciones del rol "
                                + colaborador.getRol()
                );
            }

            System.out.println();
        }
    }

    /**
     * Genera un texto con los resúmenes para mostrarlo después en la GUI.
     *
     * @return resumen de todas las entidades
     */
    public String generarResumenGeneral() {

        if (entidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {
            resumen.append(entidad.mostrarResumen())
                    .append("\n");
        }

        return resumen.toString();
    }
}