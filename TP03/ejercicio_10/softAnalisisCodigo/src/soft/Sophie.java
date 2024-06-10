package soft;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Sophie {

    private ArrayList<Programa> programas;

    public Sophie() {
        this.programas = new ArrayList<Programa>();
    }

    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }

    public ArrayList<Programa> programasPorDebajoDe(double double1) {
        ArrayList lista = new ArrayList<Programa>();
        int i = 0;
        while (i < programas.size()) {
            if (programas.get(i).indiceCalidad() < double1) {
                lista.add(programas.get(i));
            }
            i++;
        }
        return lista;
    }

}