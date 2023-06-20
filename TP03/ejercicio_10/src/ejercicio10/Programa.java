package ejercicio10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Programa implements Calificables {

    private String ID;
    private String nombre;
    private String responsable;
    private boolean pasoPruebas;
    private ArrayList<Fuente> fuentes;
    
    //CONSTRUCTOR
    public Programa(String ID, String nombre, String responsable, boolean pasoPruebas) {
        this.ID = ID;
        this.nombre = nombre;
        this.responsable = responsable;
        this.pasoPruebas = pasoPruebas;
        fuentes = new ArrayList<>();
    }
    
    public void agregarFuente(Fuente f) {
        fuentes.add(f);
    }

    public void mostrarDetalleDeMetodo(String string1) {
        // Método a resolver...
    }

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
        // Método a resolver...
        return null;
    }    
    
    @Override
    public double indiceCalidad() {
        double indCal = 0;
        if(!pasoPruebas){
            return indCal;
        }
        else{
            indCal=getPromIndiceCal();
        }
        return indCal;
    }
    
    
    private double getPromIndiceCal(){
        double prom=0;
        int i=0;
        double suma=0;
        for(Fuente f: fuentes){
            suma += f.indiceCalidad();
            i++;
        }
        prom=suma/i;
        return prom;
    }

    @Override
    public String toString() {
        return "Programa{" + "ID=" + ID + '}';
    }
    
    

}