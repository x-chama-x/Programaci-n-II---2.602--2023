package licencias;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Moto extends Vehiculo {

    private boolean tieneEspejos;

    public Moto(boolean tieneEspejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.tieneEspejos = tieneEspejos;
    }
}