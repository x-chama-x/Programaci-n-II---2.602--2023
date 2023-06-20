package ejercicio10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Metodo implements Calificables {

    private String nombre;
    private int cantParametros;
    private int cantInstruct;
    private int cantRamFlujo;

    //CONSTRUCTOR

    public Metodo(String nombre, int cantParametros, int cantInstruct, int cantRamFlujo) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantInstruct = cantInstruct;
        this.cantRamFlujo = cantRamFlujo;
    }
    
    
    public double indiceCalidad() {
        double indCal;
        indCal= 5 / (cantParametros + 1) + 20 / cantInstruct + 3 / (cantRamFlujo + 1);
        return indCal;
    }
   
    @Override
    public String toString() {
        return "Metodo{" + "nombre=" + nombre + ", cantParametros=" + cantParametros + ", cantInstruct=" + cantInstruct + ", cantRamFlujo=" + cantRamFlujo + '}';
    }
    
    

}