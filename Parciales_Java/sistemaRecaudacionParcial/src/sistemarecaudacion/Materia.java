package sistemarecaudacion;

import java.util.ArrayList;

public class Materia {

    private String codigo;
    private String nombre;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnosInscriptos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    private boolean estaInscripto(Alumno alumno) {
        int i = 0;
        boolean estaInscripto = false;
        while (i < alumnosInscriptos.size() && !estaInscripto) {
            if (alumnosInscriptos.get(i).getDNI().equals(alumno.getDNI())) {
                estaInscripto = true;
            }
            i++;
        }
        return estaInscripto;
    }

    public void inscribir(Alumno alumno) {
        if (!estaInscripto(alumno)) {
            alumnosInscriptos.add(alumno);
        } else {
            System.out.println("El alumno ya se encuentra inscripto en la materia.");
        }
    }

    public void mostrarAlumnosInscriptos() {
        System.out.println("Alumnos inscriptos en la materia " + nombre + ":");
        for (Alumno alumno : alumnosInscriptos) {
            System.out.println(alumno);
        }
    }

    public Alumno obtenerAlumno(String DNI) {
        Alumno alumno = null;
        int i = 0;
        boolean encontrado = false;
        while (i < alumnosInscriptos.size() && !encontrado) {
            if (alumnosInscriptos.get(i).getDNI().equals(DNI)) {
                alumno = alumnosInscriptos.get(i);
                encontrado = true;
            }
            i++;
        }
        return alumno;
    }

    public boolean hayCapacidad() {
        final int CAPACIDAD = 20;
        return alumnosInscriptos.size() < CAPACIDAD;
    }

    public double calcularGanancia() {
        double ganancia = 0;
        int i = 0;
        while (i < alumnosInscriptos.size()) {
            ganancia += alumnosInscriptos.get(i).calcularCuota();
            i++;
        }
        return ganancia;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}