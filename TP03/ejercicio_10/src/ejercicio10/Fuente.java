package ejercicio10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Fuente implements Calificables {


    private String nombre;
    private String ubicacion;

    //CONSTRUCTOR
    public Fuente(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Fuente{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    

}