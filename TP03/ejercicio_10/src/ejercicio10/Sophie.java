package ejercicio10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Sophie {

    private ArrayList<Programa> programas;

    // CONSTRUCTOR
    public Sophie() {
       programas = new ArrayList<>();
    }
    

    public ArrayList<Programa> programasPorDebajoDe(Double umbral) {
        ArrayList programasPorDebajoDe = new ArrayList<Programa>();
        for (Programa p: programas){
            if(p.indiceCalidad()<umbral){
                programasPorDebajoDe.add(p);
            }
        }
        return programasPorDebajoDe;
    }

    void agregarPrograma(Programa p1) {
        programas.add(p1);
    }
    
    

}