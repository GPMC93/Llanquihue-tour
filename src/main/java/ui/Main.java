package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

/**
 * Clase principal que ejecuta la interfaz gráfica del sistema.
 */
public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        // Agrega algunos registros para probar el sistema.
        gestor.cargarDatosIniciales();

        boolean continuar = true;

        while (continuar) {

            String opcion = JOptionPane.showInputDialog(
                    null,
                    """
                    LLANQUIHUE TOUR - GESTIÓN DE ENTIDADES

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar entidades registradas
                    5. Salir

                    Ingrese una opción:
                    """,
                    "Llanquihue Tour",
                    JOptionPane.QUESTION_MESSAGE
            );

            // Si el usuario cierra la ventana o presiona Cancelar.
            if (opcion == null) {
                continuar = false;
                continue;
            }

            try {
                switch (opcion) {

                    case "1":
                        registrarGuia(gestor);
                        break;

                    case "2":
                        registrarVehiculo(gestor);
                        break;

                    case "3":
                        registrarColaborador(gestor);
                        break;

                    case "4":
                        mostrarEntidades(gestor);
                        break;

                    case "5":
                        continuar = false;
                        JOptionPane.showMessageDialog(
                                null,
                                "Programa finalizado."
                        );
                        break;

                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Opción no válida.",
                                "Aviso",
                                JOptionPane.WARNING_MESSAGE
                        );
                }

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage(),
                        "Error de validación",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    /**
     * Solicita los datos y registra un guía turístico.
     */
    private static void registrarGuia(GestorEntidades gestor) {

        String codigo = solicitarTexto("Ingrese el código del guía:");
        if (codigo == null) {
            return;
        }

        String nombre = solicitarTexto("Ingrese el nombre del guía:");
        if (nombre == null) {
            return;
        }

        String especialidad = solicitarTexto(
                "Ingrese la especialidad del guía:"
        );
        if (especialidad == null) {
            return;
        }

        GuiaTuristico guia = new GuiaTuristico(
                codigo,
                nombre,
                especialidad
        );

        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente."
        );
    }

    /**
     * Solicita los datos y registra un vehículo.
     */
    private static void registrarVehiculo(GestorEntidades gestor) {

        String codigo = solicitarTexto("Ingrese el código del vehículo:");
        if (codigo == null) {
            return;
        }

        String nombre = solicitarTexto(
                "Ingrese el nombre o modelo del vehículo:"
        );
        if (nombre == null) {
            return;
        }

        String patente = solicitarTexto("Ingrese la patente:");
        if (patente == null) {
            return;
        }

        String tipo = solicitarTexto(
                "Ingrese el tipo de vehículo:"
        );
        if (tipo == null) {
            return;
        }

        Vehiculo vehiculo = new Vehiculo(
                codigo,
                nombre,
                patente,
                tipo
        );

        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente."
        );
    }

    /**
     * Solicita los datos y registra un colaborador externo.
     */
    private static void registrarColaborador(GestorEntidades gestor) {

        String codigo = solicitarTexto(
                "Ingrese el código del colaborador:"
        );
        if (codigo == null) {
            return;
        }

        String nombre = solicitarTexto(
                "Ingrese el nombre del colaborador:"
        );
        if (nombre == null) {
            return;
        }

        String rol = solicitarTexto(
                "Ingrese el rol del colaborador:"
        );
        if (rol == null) {
            return;
        }

        ColaboradorExterno colaborador = new ColaboradorExterno(
                codigo,
                nombre,
                rol
        );

        gestor.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                null,
                "Colaborador externo registrado correctamente."
        );
    }

    /**
     * Muestra las entidades en la GUI y también en la consola.
     */
    private static void mostrarEntidades(GestorEntidades gestor) {

        JOptionPane.showMessageDialog(
                null,
                gestor.generarResumenGeneral(),
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );

        // Aquí se ejecuta también la lógica con instanceof.
        gestor.mostrarEntidadesPorConsola();
    }

    /**
     * Solicita un texto y valida que no esté vacío.
     */
    private static String solicitarTexto(String mensaje) {

        String valor = JOptionPane.showInputDialog(
                null,
                mensaje
        );

        // Cancelar la operación actual.
        if (valor == null) {
            return null;
        }

        valor = valor.trim();

        if (valor.isEmpty()) {
            throw new IllegalArgumentException(
                    "El dato ingresado no puede estar vacío."
            );
        }

        return valor;
    }
}