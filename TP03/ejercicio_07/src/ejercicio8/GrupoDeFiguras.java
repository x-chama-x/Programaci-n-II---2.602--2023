package ejercicio8;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class GrupoDeFiguras {

    private ArrayList<Figura> figuras;

    public GrupoDeFiguras() {
        figuras = new ArrayList<Figura>();
    }
    
    public void agregarFigura(Figura figura1) {
        figuras.add(figura1);
    }

    public void mostrarInfoDeFiguras() {
        for(Figura f: figuras){
            System.out.println("Color: " + f.getColor());
            System.out.println("Área: " + f.area());
            System.out.println("Perímetro: " + f.perimetro());
            System.out.println();
        }
    }
}