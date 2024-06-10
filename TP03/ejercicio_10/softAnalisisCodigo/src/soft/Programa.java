package soft;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Programa implements Calificable {

    private String ID;
    private String nombre;
    private String nombreResponsable;
    private boolean pasoPruebasUnitarias;
    private ArrayList<Fuente> fuentes;

    public Programa(String ID, String nombre, String nombreResponsable, boolean pasoPruebasUnitarias) {
        this.ID = ID;
        this.nombre = nombre;
        this.nombreResponsable = nombreResponsable;
        this.pasoPruebasUnitarias = pasoPruebasUnitarias;
        this.fuentes = new ArrayList<Fuente>();
    }

    public void agregarFuente(Fuente fuente) {
        fuentes.add(fuente);
    }

    @Override
    public double indiceCalidad() {
        if (!this.pasoPruebasUnitarias) {
            return 0;
        } else {
            return promedioCalidadFuentes();
        }
    }


    private double promedioCalidadFuentes() {
        double prom = 0;
        for (Fuente fuente : fuentes) {
            prom += fuente.indiceCalidad();
        }
        return prom / fuentes.size();
    }


public void mostrarDetalleDeMetodo(String nombre) {
    int i = 0;
    boolean encontrado = false;
    while (i < fuentes.size() && !encontrado) {
        Fuente fuente = fuentes.get(i);
        if (fuente instanceof DeProgramacion deProgramacion) {
            Metodo metodo = deProgramacion.buscarMetodo(nombre);
            if (metodo != null) {
                System.out.println(metodo);
                encontrado = true;
            }
        }
        i++;
    }
    if (!encontrado) {
        System.out.println("No se encontró el método con nombre " + nombre);
    }
}

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
        ArrayList <Fuente> fuentesMayoresAlPromedio = new ArrayList<Fuente>();
        double promedio = promedioCalidadFuentes();
        int i = 0;
        while (i < fuentes.size()) {
            Fuente fuente = fuentes.get(i);
            if (fuente.indiceCalidad() > promedio) {
                fuentesMayoresAlPromedio.add(fuente);
            }
            i++;
        }
        return fuentesMayoresAlPromedio;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "ID='" + ID + '\'' +
                '}';
    }
}