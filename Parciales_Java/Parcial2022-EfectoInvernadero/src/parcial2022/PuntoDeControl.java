package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoDeControl {

    private ArrayList<Area> areas;

    public PuntoDeControl(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public void agregarArea(Area a) {
       areas.add(a);
    }

    public int cantAreasEnPeligro() {
        int cont = 0;
        for (Area a: areas){
            if(a.enPeligro()){
                cont ++;
            }
        }
        return cont;
    }

    public double tempMaxEnAreas() {
        double tempMax = 0.0;
        int i = 0;
        for (Area a: areas){
            if(a instanceof AreaDeTundra){
                if(i==0){
                   tempMax = a.getTemperaturaMaximaRegistrada();
                   i++;
                }else if (tempMax<a.getTemperaturaMaximaRegistrada()){
                    tempMax = a.getTemperaturaMaximaRegistrada();
                }
            }
        }
        return tempMax;
    }
}   // me registra tanto AreaDeTundra como AreaDeTundraPolar
    // si hay una forma mejor, preguntarle al profe