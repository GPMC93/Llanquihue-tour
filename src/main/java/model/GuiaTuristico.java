package model;

/**
 * Representa a un guía turístico de la agencia.
 */
public class GuiaTuristico extends RecursoAgencia {

    private String especialidad;

    public GuiaTuristico(String codigo, String nombre, String especialidad) {
        super(codigo, nombre);

        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La especialidad no puede estar vacía."
            );
        }

        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La especialidad no puede estar vacía."
            );
        }

        this.especialidad = especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "Guía turístico | Código: " + getCodigo()
                + " | Nombre: " + getNombre()
                + " | Especialidad: " + especialidad;
    }
}