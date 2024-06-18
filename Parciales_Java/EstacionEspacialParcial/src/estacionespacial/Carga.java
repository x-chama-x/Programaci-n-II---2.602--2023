package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Carga {

    private String descripcion;
    private double volumen;

    public Carga(String descripcion, double volumen) {
        this.descripcion = descripcion;
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "descripcion='" + descripcion + '\'' +
                ", volumen=" + volumen +
                '}';
    }
}