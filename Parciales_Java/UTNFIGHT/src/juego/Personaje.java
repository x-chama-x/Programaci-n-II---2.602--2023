package juego;

import java.util.Random;

public abstract class Personaje implements Atacable, Defendible {

    private static final int VIDA_INICIAL = 100;
    private String nombre;
    private double puntosVida;
    

    public Personaje(String nombre) {
        this.nombre = nombre;
        reiniciar();
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public void defensa(double ataque) {
        double danioEsquivado = calcularDanioEsquivado(ataque);
        actualizarPuntosVida(danioEsquivado);
    }
    
    private double calcularDanioEsquivado(double ataque) {
        Random rand = new Random();
        double esquivar = rand.nextDouble();
        return ataque * esquivar;
    }
    private void actualizarPuntosVida(double danioEsquivado) {
        setPuntosVida(getPuntosVida() - danioEsquivado);
    }
    
    public boolean estaVivo() {
        return this.getPuntosVida() > 0;
    }
    
    public void reiniciar() {
        this.puntosVida = VIDA_INICIAL;
    }
}