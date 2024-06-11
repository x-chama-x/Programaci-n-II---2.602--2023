package droidesgalacticos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CreadorDroides {

    private ArrayList<Droide> droides;

    public CreadorDroides() {
        droides = new ArrayList<Droide>();
    }

    public void agregarDroide(Droide d) {
        droides.add(d);
    }

}