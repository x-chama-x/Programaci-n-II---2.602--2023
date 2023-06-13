package ejercicio9;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Comercio {

    private ArrayList<Facturable> operaciones;

    public Comercio() {
        // Constructor a resolver...
    }

    public double montoTotalFacturado() {
        double total=0;
        for (Facturable facturable: operaciones){
            total+=facturable.facturar();
        }
        return total;
    }

    public int cantServiciosSimples() {
        int cont = 0;
        for(Facturable f: operaciones){
            if(esServicioSimple(f)){
                cont++;
            }
        }
        return cont;
    }

    private boolean esServicioSimple(Facturable f) {
        return f instanceof DeReparacion && ((DeReparacion) f).getDificultad() < 2;
                                              // downcasting para obtener dificultad de la clase DeReparacion 
    }
}