package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class SucursalCorreo {

    private String nombre;
    private Domicilio domicilio;

    public SucursalCorreo(String nombre, Domicilio domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

}