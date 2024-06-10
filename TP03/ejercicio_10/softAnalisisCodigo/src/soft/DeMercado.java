package soft;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeMercado extends Fuente {

    private double tamArchivo;

    public DeMercado(String nombre, String ubicacion, double tamArchivo) {
        super(nombre, ubicacion);
        this.tamArchivo = tamArchivo;
    }

    @Override
    public double indiceCalidad() {
        return 450/tamArchivo;
    }

    @Override
    public String toString() {
        return super.toString();
    }



}