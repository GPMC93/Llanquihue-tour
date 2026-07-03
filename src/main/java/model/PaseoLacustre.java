package model;

/**
 * Subclase que representa un paseo lacustre.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String mostrarInformacion() {
        return "Paseo Lacustre -> Nombre: " + getNombre() +
                ", Duración: " + getDuracionHoras() + " horas" +
                ", Tipo de embarcación: " + tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}