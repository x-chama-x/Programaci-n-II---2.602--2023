package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaDeTundra extends Area {

    private int mmLlovidos;

    public AreaDeTundra(int mmLlovidos, int extension, int elevacion, ArrayList<Double> tempMedias) {
        super(extension, elevacion, tempMedias);
        this.mmLlovidos = mmLlovidos;
    }
    
    public boolean criterioPeligroTundra(){
        final int tempMin = 10;
        final int elevacionMax = 500;
        return getTemperaturaMaximaRegistrada() > tempMin && getElevacion() <= elevacionMax;  
    }    

    @Override
    public boolean enPeligro() {
        return criterioPeligroTundra();
    } // funciona
}