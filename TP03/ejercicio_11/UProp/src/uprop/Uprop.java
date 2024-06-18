package uprop;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Uprop {

    private ArrayList<Inmobiliaria> inmobiliarias;

    public Uprop() {
        inmobiliarias = new ArrayList<Inmobiliaria>();
    }

    public void añadirInmobiliaria(Inmobiliaria i) {
        inmobiliarias.add(i);
    }

}