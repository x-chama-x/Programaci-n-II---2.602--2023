package estacionespacial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EstacionEspacial {

    private ArrayList<PuntoAtraque> puntosDeAtraque;

    public EstacionEspacial() {
        puntosDeAtraque = new ArrayList<PuntoAtraque>();
    }

    public void agregarPtoAtraque(PuntoAtraque p) {
        puntosDeAtraque.add(p);
    }

    public void mostrarManifiestos() {
        System.out.println("----------------------------------");
        System.out.println("Manifiestos de las naves estacionadas");
        System.out.println("----------------------------------");
        for (PuntoAtraque p : puntosDeAtraque) {
            if (p.hayNave()) { // Si hay una nave estacionada...
                p.getNave().mostrarManifiesto();
                System.out.println("----------------------------------");
            }
        }
    }

    public void estacionarNave(Nave n) {
        PuntoAtraque p = getPuntoDeAtraqueLibre();
        if (p != null) {
            p.estacionarNave(n);
        } else {
            System.out.println("No hay puntos de atraque libres");
        }
    }

    // uso un for normal porque es una busqueda lineal
    private PuntoAtraque getPuntoDeAtraqueLibre() {
        PuntoAtraque retorno = null;
        for (int i = 0; i < puntosDeAtraque.size(); i++) {
            if (puntosDeAtraque.get(i).getNave() == null) {
                retorno = puntosDeAtraque.get(i);
                i = puntosDeAtraque.size(); // para salir del for
            }
        }
        return retorno;
    }

}