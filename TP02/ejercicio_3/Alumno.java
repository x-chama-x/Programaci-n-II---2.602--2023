
package ejercicio_3;

import java.util.ArrayList;


class Alumno {
    private String nombre;
    private String DNI;
    private ArrayList<Evaluacion> evaluaciones;
    
    //CONSTRUCTOR
    public Alumno(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        evaluaciones = new ArrayList<>();
    }
    // para punto C
    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    
    
    
    
    
    // OTROS METODOS
    public void añadirParcial(Evaluacion parcial){
        evaluaciones.add(parcial);
    }
    
    public double calcularPromedio(){
        int suma=0,cont=0;
        double promedio;
        for(Evaluacion e : evaluaciones ){
            suma+=e.getNota();
            cont++;
        }
        promedio= (double)suma/cont;
        return promedio;
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
    
    
}
