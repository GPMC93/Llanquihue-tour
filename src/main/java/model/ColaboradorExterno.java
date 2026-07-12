package model;

/**
 * Representa a un colaborador externo de la agencia.
 */
public class ColaboradorExterno extends RecursoAgencia {

    private String rol;

    public ColaboradorExterno(String codigo, String nombre, String rol) {
        super(codigo, nombre);

        if (rol == null || rol.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El rol no puede estar vacío."
            );
        }

        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        if (rol == null || rol.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El rol no puede estar vacío."
            );
        }

        this.rol = rol;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador externo | Código: " + getCodigo()
                + " | Nombre: " + getNombre()
                + " | Rol: " + rol;
    }
}