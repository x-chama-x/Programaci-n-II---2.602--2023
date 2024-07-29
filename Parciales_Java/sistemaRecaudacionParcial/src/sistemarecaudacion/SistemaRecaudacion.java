package sistemarecaudacion;

import java.util.ArrayList;

public class SistemaRecaudacion {

    private Carrera carrera;

    public SistemaRecaudacion(String nombreCarrera) {
        this.carrera = new Carrera(nombreCarrera);
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void inscribir(String DNI, String nombre, String codigoMateria) {
        Materia materia = carrera.obtenerMateria(codigoMateria);
        if (materia != null) {
            if (materia.hayCapacidad()){
                Alumno alumno = materia.obtenerAlumno(DNI);
                if (alumno == null) { // Si el alumno no está inscripto en la materia
                    alumno = carrera.obtenerAlumno(DNI);
                    if (alumno == null) { // Si el alumno no cursa en ninguna otra carrera
                        alumno = crearAlumno(DNI, nombre);
                        inscribirAlumno(alumno, materia);
                    } else {
                        inscribirAlumno(alumno, materia);
                    }
                } else {
                    System.out.println("El alumno ya se encuentra inscripto en la materia.");
                }
            } else {
                System.out.println("No hay más cupo para la materia.");
            }
        } else {
            System.out.println("La materia no existe.");
        }
    }

    public Alumno crearAlumno(String DNI, String nombre) {
        double random = Math.random();
        Alumno alumno = null;
        if (random < 0.33) {
            alumno = new Alumno(DNI, nombre);
        } else if (random < 0.66) {
            int edad = 40 + (int)(Math.random() * 30); // Edad entre 40 y 70
            alumno = new AlumnoMayor(DNI, nombre, edad);
        } else {
            double porcentajeBeca = Math.random() * 50; // Beca entre 0% y 50%
            alumno = new AlumnoConBeca(DNI, nombre, porcentajeBeca);
        }
        return alumno;
    }

    public void inscribirAlumno(Alumno alumno, Materia materia) {
        materia.inscribir(alumno);
        alumno.inscribir(materia);
        System.out.println("Alumno inscripto correctamente.");
    }

    public ArrayList<Double> gananciaPorMateria() {
        return carrera.gananciaPorMateria();
    }

    public void imprimirGananciasPorMateria() {
        ArrayList<Double> ganancias = gananciaPorMateria();
        for (int i = 0; i < ganancias.size(); i++) {
            Materia materia = carrera.obtenerMateria(i);  // Asegúrate de obtener la materia correcta
            if (materia != null) {
                System.out.println("Ganancia de la materia " + materia.getNombre() + ": " + ganancias.get(i));
            }
        }
    }



}