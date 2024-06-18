package licencias;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Circuito implements Evaluable {

    private int tiempo;
    private int faltas;

    public Circuito(int tiempo, int faltas) {
        this.tiempo = tiempo;
        this.faltas = faltas;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public boolean seAprobo() {
        final int maxFaltas = 2;
        return faltas <=maxFaltas;
    }
}