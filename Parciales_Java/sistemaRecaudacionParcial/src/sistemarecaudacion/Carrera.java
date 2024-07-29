package sistemarecaudacion;

import java.util.ArrayList;

public class Carrera {

    private String nombre;
    private ArrayList<Materia> materias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean existeMateria(String codigo) {
        int i = 0;
        boolean existe = false;
        while (i < materias.size() && !existe) {
            if (materias.get(i).getCodigo().equals(codigo)) {
                existe = true;
            }
            i++;
        }
        return existe;
    }

    public Materia obtenerMateria(String codigo) {
        Materia materia = null;
        int i = 0;
        boolean encontrado = false;
        while (i < materias.size() && !encontrado) {
            if (materias.get(i).getCodigo().equals(codigo)) {
                materia = materias.get(i);
                encontrado = true;
            }
            i++;
        }
        return materia;
    }

    public Materia obtenerMateria(int indice) {
        if (indice >= 0 && indice < materias.size()) {
            return materias.get(indice);
        }
        return null;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public Alumno obtenerAlumno(String DNI) {
        Alumno alumno = null;
        int i = 0;
        boolean encontrado = false;
        while (i < materias.size() && !encontrado) {
            alumno = materias.get(i).obtenerAlumno(DNI);
            if (alumno != null) {
                encontrado = true;
            }
            i++;
        }
        return alumno;
    }

    public void agregarMateria(Materia materia) {
        if (!existeMateria(materia.getCodigo())) {
            materias.add(materia);
        } else {
            System.out.println("La materia ya se encuentra en la carrera.");
        }
    }

    public ArrayList<Double> gananciaPorMateria() {
        ArrayList<Double> ganancias = new ArrayList<>();
        for (Materia materia : materias) {
            double ganancia = materia.calcularGanancia();
            ganancias.add(ganancia);
        }
        return ganancias;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias +
                '}';
    }
}