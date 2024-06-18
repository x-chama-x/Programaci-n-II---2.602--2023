package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Area implements AreaEnPeligro {

    private int extension;
    private int elevacion;
    private ArrayList<Double> temperaturas;

    public Area(int extension, int elevacion, ArrayList<Double> temperaturas) {
        this.extension = extension;
        this.elevacion = elevacion;
        this.temperaturas = temperaturas;
    }
    
    public double getTempPromedio(){
        double sumaTemp = 0;
        for (double t: temperaturas){
            sumaTemp += t;
        }
        return sumaTemp/ temperaturas.size();
    }
    
    public double getTemperaturaMaximaRegistrada(){
        double tempMax = 0;
        for(int i = 0; i < temperaturas.size(); i++){
            double t = temperaturas.get(i);
            if(i == 0){
                tempMax = t; 
            }
            else if(t > tempMax){
                tempMax = t;
            }
        }
        return tempMax;
    }

    public int getElevacion() {
        return elevacion;
    }
}