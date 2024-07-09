package juego;

import java.util.Random;

public class Guerrero extends Personaje {

    private double fuerza;

    public Guerrero(String nombre, double fuerza) {
        super(nombre);
        this.fuerza = fuerza;
    }

    public double ataque() {
        int vidaInicial = 100;
        double porcentajeVidaCritica = 0.2; // 20% de la vida inicial como punto crítico
        double vidaPorDebajoDe = vidaInicial * porcentajeVidaCritica;
        double incrementoFuerza = 0.1;
        if (getPuntosVida() < vidaPorDebajoDe) {
            fuerza += fuerza * incrementoFuerza; // Incrementa la fuerza en un 10%
        }
        return fuerza;
    }

}