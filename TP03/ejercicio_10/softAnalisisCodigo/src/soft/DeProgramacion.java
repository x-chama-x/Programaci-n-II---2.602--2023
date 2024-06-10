package soft;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeProgramacion extends Fuente {

    private ArrayList<Metodo> metodos;


    public DeProgramacion(String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.metodos = new ArrayList<Metodo>();
    }

    public void agregarMetodo(Metodo metodo) {
        metodos.add(metodo);
    }

    @Override
    public double indiceCalidad() {
        return promedioCalidadMetodos();
    }

    public double promedioCalidadMetodos() {
        double prom = 0;
        for (Metodo metodo : metodos) {
            prom += metodo.indiceCalidad();
        }
        return prom / metodos.size();
    }

    public Metodo buscarMetodo(String nombre) {
        int i = 0;
        Metodo encontrado = null;
        while (i < metodos.size() && encontrado == null) {
            if (metodos.get(i).getNombre().equals(nombre)) {
                encontrado = metodos.get(i);
            }
            i++;
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}