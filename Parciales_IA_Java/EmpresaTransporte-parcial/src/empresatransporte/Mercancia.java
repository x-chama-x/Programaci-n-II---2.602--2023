package empresatransporte;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Mercancia {

    private String descripcion;
    private double peso;
    private boolean esPeligrosa;

    public Mercancia(String descripcion, double peso, boolean esPeligrosa) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.esPeligrosa = esPeligrosa;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEsPeligrosa() {
        return esPeligrosa;
    }

    @Override
    public String toString() {
        return "Mercancia{" + "descripcion=" + descripcion + '}';
    }

}