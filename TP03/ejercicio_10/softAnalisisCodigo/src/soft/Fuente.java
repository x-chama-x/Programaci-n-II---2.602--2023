package soft;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Fuente implements Calificable {

    private String nombre;
    private String ubicacion;

    public Fuente(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    //public abstract double indiceCalidad();

    @Override
    public String toString() {
        return "Fuente{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}