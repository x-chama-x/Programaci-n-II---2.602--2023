package empresatransporte;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Pasajero {

    private String nombre;
    private String DNI;
    private boolean EsmenorDeEdad;

    public Pasajero(String nombre, String DNI, boolean EsmenorDeEdad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.EsmenorDeEdad = EsmenorDeEdad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + '}';
    }

}