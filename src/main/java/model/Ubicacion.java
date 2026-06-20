package model;

/**
 * Representa la ubicación donde se realiza un tour.
 */
public class Ubicacion {

    private String comuna;
    private String region;

    public Ubicacion(String comuna, String region) {
        this.comuna = comuna;
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return comuna + ", " + region;
    }
}