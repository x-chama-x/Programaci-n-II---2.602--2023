package ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeArmado extends Servicio {

    private static final double VALORHORA = 250;

    public DeArmado(double cantHoras) {
        super(cantHoras);
    }

    @Override
    public double getValorHora() {
        return VALORHORA;
    }

}