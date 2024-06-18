package licencias;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenAuto extends Examen {

    private Circuito circuitoAuto;
    private Vehiculo vehiculo;

    public ExamenAuto(Circuito circuitoAuto, Vehiculo vehiculo, String fecha, Persona persona) {
        super(fecha, persona);
        this.circuitoAuto = circuitoAuto;
        this.vehiculo = vehiculo;
    }

    public Circuito getCircuitoAuto() {
        return circuitoAuto;
    }

    public boolean seAprobo() {
        final int tiempoMax=90;
        return circuitoAuto.seAprobo() && circuitoAuto.getTiempo()<=tiempoMax;
    } // condiciona la evaluacion de la clase Circuito 

}