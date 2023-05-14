
package ejercicio_3;

import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
        
        // instancio cursos de la academia
        Curso inf = new Curso("01","Informática:",120);
        Curso id = new Curso("02","Idiomas",80);
        

        // instancio Alumnos
        Alumno a1 = new Alumno("Juan Pérez", "12345678A");
        Alumno a2 = new Alumno("María González", "87654321B");
                
        // añado alumnos al curso de informatica
        inf.añadirAlumno(a1);
        inf.añadirAlumno(a2);
        
        // instancio parciales de informatica del alumno 1
        Evaluacion infa1p1 = new Evaluacion(8,Tipo.PRIMERO);
        Evaluacion infa1p2 = new Evaluacion(9,Tipo.SEGUNDO);
        Evaluacion infa1f = new Evaluacion(7,Tipo.FINAL);
        // instancio parciales de informatica del alumno 2
        Evaluacion infa2p1 = new Evaluacion(6,Tipo.PRIMERO);

        
        
        // añado los parciales correspondientes a la lista
        a1.añadirParcial(infa1p1);
        a1.añadirParcial(infa1p2);
        a1.añadirParcial(infa1f);
        a2.añadirParcial(infa2p1);
        
        
        // añado alumnos al curso de Idiomas
        id.añadirAlumno(a1);
        id.añadirAlumno(a2);
       
        // instancio parciales de Idiomas del alumno 1
        Evaluacion ida1p1 = new Evaluacion(10,Tipo.PRIMERO);
        Evaluacion ida1p2 = new Evaluacion(9,Tipo.SEGUNDO);
        Evaluacion ida1f = new Evaluacion(9,Tipo.FINAL);

        // instancio parciales de Idiomas del alumno 2
        Evaluacion ida2p1 = new Evaluacion(6,Tipo.PRIMERO);
        Evaluacion ida2p2 = new Evaluacion(6,Tipo.SEGUNDO);
        Evaluacion ida2f = new Evaluacion(7,Tipo.FINAL);
        
        // añado los parciales correspondientes a la lista
        a1.añadirParcial(ida1p1);
        a1.añadirParcial(ida1p2);
        a1.añadirParcial(ida1f);
        a2.añadirParcial(ida2p1);
        a2.añadirParcial(ida2p2);
        a2.añadirParcial(ida2f);
        
        // veo el promedio del alumno 1
        System.out.println(a2.calcularPromedio());
        
        
        // pruebo funcion buscarAlumnosPorEncimaDe(double prom)
        // en el curso de Informatica
        ArrayList<Alumno> alumnosEncimaDe = inf.buscarAlumnosPorEncimaDe(8);
        for (Alumno alumno : alumnosEncimaDe) {
            System.out.println(alumno);
        }
        // tiene q mostrar a Juan Lopez
        // lo unico que no pude hacer es que detecte cuantos parciales hizo cada alumno
    }
    
}
