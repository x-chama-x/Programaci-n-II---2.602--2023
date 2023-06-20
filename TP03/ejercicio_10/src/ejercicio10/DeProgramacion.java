package ejercicio10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeProgramacion extends Fuente {

    private ArrayList<Metodo> metodos;

    public DeProgramacion(String nombre, String ubicacion) {
        super(nombre, ubicacion);
        metodos = new ArrayList<>();
    }

    public void agregarMetodo(Metodo m) {
        metodos.add(m);
    }
    
    @Override
    public double indiceCalidad() {
        return getPromIndiceCal();
    }

    private double getPromIndiceCal(){
        double prom;
        double suma=0;
        int i=0;
        for (Metodo m: metodos){
            suma+= m.indiceCalidad();
            i++;
        }
        prom=suma/i;
        return prom;
    }

    @Override
    public String toString() {
        return "DeProgramacion{" + "metodos=" + metodos + '}';
    }
     

}