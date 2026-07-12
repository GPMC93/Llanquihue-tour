package model;

/**
 * Representa un vehículo utilizado por la agencia.
 */
public class Vehiculo extends RecursoAgencia {

    private String patente;
    private String tipo;

    public Vehiculo(
            String codigo,
            String nombre,
            String patente,
            String tipo
    ) {
        super(codigo, nombre);

        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La patente no puede estar vacía."
            );
        }

        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El tipo de vehículo no puede estar vacío."
            );
        }

        this.patente = patente;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La patente no puede estar vacía."
            );
        }

        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El tipo de vehículo no puede estar vacío."
            );
        }

        this.tipo = tipo;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo | Código: " + getCodigo()
                + " | Nombre: " + getNombre()
                + " | Patente: " + patente
                + " | Tipo: " + tipo;
    }
}