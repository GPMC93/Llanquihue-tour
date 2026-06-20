package model;

/**
 * Clase que representa un tour de la agencia Llanquihue Tour.
 */
public class Tour {

    private String nombre;
    private String tipo;
    private double precio;
    private Ubicacion ubicacion;

    public Tour(String nombre, String tipo, double precio, Ubicacion ubicacion) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del tour no puede estar vacío.");
        }

        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo del tour no puede estar vacío.");
        }

        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }

        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del tour no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo del tour no puede estar vacío.");
        }
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        this.precio = precio;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Tour: " + nombre +
                ", Tipo: " + tipo +
                ", Precio: " + precio +
                ", Ubicacion: " + ubicacion;
    }
}