package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Domicilio {

    private String calle;
    private int Altura;
    private int comuna;

    public Domicilio(String calle, int Altura, int comuna) {
        this.calle = calle;
        this.Altura = Altura;
        this.comuna = comuna;
    }

    public int getComuna() {
        return comuna;
    }
}