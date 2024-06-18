package uprop;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Inmueble {

    private double superficie;
    private int cantidadAmbientes;
    private double precio;
    private ArrayList<Notificable> interesados;
    private Domicilio dom;

    public Inmueble(double superficie, int cantidadAmbientes, double precio, Domicilio dom) {
        this.superficie = superficie;
        this.cantidadAmbientes = cantidadAmbientes;
        this.precio = precio;
        this.dom = dom;
        this.interesados = new ArrayList<Notificable>();
    }

    public void setPrecio(double p) {
        this.precio = p;
    }

    public double getPrecio() {
        return precio;
    }

    public void agregarInteresado(Notificable n) {
        interesados.add(n);
    }

    public void removerInteresado(Notificable n) {
        interesados.remove(n);
    }

    public void notificarInteresados(double double1, double double2) {
        for (Notificable n : interesados) {
            n.notificarCambioPrecio(double1, double2, this);
        }
    }

    @Override
    public String toString() {
        return "Superficie: " + superficie + " m2, Ambientes: " + cantidadAmbientes + ", Domicilio: " + dom.toString();
    }

}