package droidesgalacticos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Droide {

    private String nombre;
    private ArrayList<Droide> droidesRegistrados;
    private ArrayList<Pieza> piezasOperativas;
    private ArrayList<Pieza> piezasNoOperativas;
    private boolean fueraDeServicio;

    public Droide(String nombre, boolean fueraDeServicio) {
        this.nombre = nombre;
        droidesRegistrados = new ArrayList<Droide>();
        piezasOperativas = new ArrayList<Pieza>();
        piezasNoOperativas = new ArrayList<Pieza>();
        this.fueraDeServicio = fueraDeServicio;
    }

    public void registrarDroide(Droide d) {
        if (d.fueraDeServicio) {
            droidesRegistrados.add(d);
        } else {
            System.out.println("El droide " + d.nombre + " no está fuera de servicio.");
        }
    }

    public void añadirPiezaOperativa(Pieza pieza) {
        piezasOperativas.add(pieza);
    }

    public void añaadirPiezaNoOperativa(Pieza pieza) {
        piezasNoOperativas.add(pieza);
    }

    public void listarPiezas() {
        System.out.println("Piezas operativas:");
        listarPiezasOperativas();
        System.out.println("Piezas no operativas:");
        listarPiezasNoOperativas();
    }


    private void listarPiezasOperativas() {
        for (Pieza pieza : piezasOperativas) {
            System.out.println(pieza.getNombre());
        }
    }

    private void listarPiezasNoOperativas() {
        for (Pieza pieza : piezasNoOperativas) {
            System.out.println(pieza.getNombre());
        }
    }


    public EstadoReparacion autorepararse() {
        EstadoReparacion estadoReparacion = null;
        boolean sePudoReparar = reemplazarPiezasNoOperativas();
        if (piezasNoOperativas.isEmpty()) {
            estadoReparacion = EstadoReparacion.COMPLETAMENTE_OPERATIVO;
        } else if (sePudoReparar) {
            estadoReparacion = EstadoReparacion.REPARACION_PARCIAL;
        } else {
            estadoReparacion = EstadoReparacion.REPARACION_IMPOSIBLE;
        }
        return estadoReparacion;
    }



    private boolean reemplazarPiezasNoOperativas() {
        boolean sePudoReparar = false;
        int i = 0;
        while (i < piezasNoOperativas.size()) {
            Pieza piezaNoOperativa = piezasNoOperativas.get(i);
            System.out.println("Reemplazando pieza " + piezaNoOperativa.getNombre() + "...");
            Pieza piezaOperativa = buscarPiezaOperativa(piezaNoOperativa);
            if (piezaOperativa != null) {
                piezasOperativas.add(piezaOperativa);
                piezasNoOperativas.remove(i);
                sePudoReparar = true;
                System.out.println("Pieza " + piezaNoOperativa.getNombre() + " reemplazada.");
            }
            i++;
        }
        return sePudoReparar;
    }


    private Pieza buscarPiezaOperativa(Pieza piezaNoOperativa) {
        int i = 0;
        Pieza piezaOperativa = null;
        while (i < droidesRegistrados.size()) {
            Droide droide = droidesRegistrados.get(i);
            piezaOperativa = buscarPiezaOperativaEnDroide(droide, piezaNoOperativa);
            i++;
            if (piezaOperativa != null) {
                System.out.println("Pieza " + piezaNoOperativa.getNombre() + " encontrada en el droide " + droide.nombre + "." );
                i = droidesRegistrados.size();
            }
        }
        return piezaOperativa;
    }

    private Pieza buscarPiezaOperativaEnDroide(Droide droide, Pieza piezaNoOperativa) {
        int j = 0;
        Pieza retornar = null;
        while (j < droide.piezasOperativas.size()) {
            Pieza piezaOperativa = droide.piezasOperativas.get(j);
            if (piezaOperativa.getNombre().equals(piezaNoOperativa.getNombre())) {
                retornar = piezaOperativa;
                j = droide.piezasOperativas.size();
            }
            j++;
        }
        return retornar;
    }


}