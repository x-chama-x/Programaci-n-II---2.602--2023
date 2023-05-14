
package ejercicio_3;

import java.util.ArrayList;


public class Curso {
    private String codigo;
    private String titulo;
    private int duracion;
    private ArrayList<Alumno> alumnosInscriptos;
    
    //CONSTRUCTOR
    public Curso(String codigo, String titulo, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        alumnosInscriptos = new ArrayList<>();
    }
    
    // OTROS METODOS
    public void añadirAlumno(Alumno alumno){
        alumnosInscriptos.add(alumno);
    }
    
    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double prom){
        ArrayList<Alumno> AlumnosPorEncimaDe = new ArrayList<>();
        for(Alumno a: alumnosInscriptos){
            if(a.calcularPromedio()>prom ){
                AlumnosPorEncimaDe.add(a);
            }
        }
        return AlumnosPorEncimaDe;
    }
    

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", titulo=" + titulo + ", duracion=" + duracion + '}';
    }
    
    
}
