package model;

/**
 * Clase que representa un tour de la agencia Llanquihue Tour.
 */
public class Tour {

    // Atributos del tour
    private String nombre;
    private String tipo;
    private double precio;

    /**
     * Constructor que inicializa un tour con nombre, tipo y precio.
     */
    public Tour(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter del tipo
    public String getTipo() {
        return tipo;
    }

    // Setter del tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter del precio
    public double getPrecio() {
        return precio;
    }

    // Setter del precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve la información del tour en formato legible.
     */
    @Override
    public String toString() {
        return "Tour: " + nombre +
                ", Tipo: " + tipo +
                ", Precio: " + precio;
    }
}
