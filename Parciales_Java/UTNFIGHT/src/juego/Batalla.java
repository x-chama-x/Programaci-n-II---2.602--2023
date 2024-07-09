package juego;

import java.util.ArrayList;

public class Batalla {
    private ArrayList<Jugador> participantes;
    private int ronda;

    public Batalla(Jugador j1, Jugador j2) {
        this.participantes = new ArrayList<>();
        agregarParticipante(j1);
        agregarParticipante(j2);
        this.ronda = 0;
    }

    public void agregarParticipante(Jugador j) {
        participantes.add(j);
    }
    

    public void iniciar(){
        Jugador jAtacante = participantes.get(0);
        Jugador jDefensor = participantes.get(1);

        jDefensor.defensa(jAtacante.ataque());
        
        while (jDefensor.getPersonajeFavorito().estaVivo()) {
            
            Jugador aux = jAtacante;
            jAtacante = jDefensor;
            jDefensor = aux;

            jDefensor.defensa(jAtacante.ataque());

        }
        System.out.println("Gano " + jAtacante + " y perdio " + jDefensor);
        reiniciarPuntosVida(participantes);
        actualizarPartidas(jAtacante, jDefensor);
    }

    private boolean ambosPersonajesVivos(Personaje p1, Personaje p2){
        return p1.getPuntosVida() > 0 && p2.getPuntosVida() > 0;
    }

    private void realizarTurno(Personaje atacante, Personaje defensor){
        double ataque = atacante.ataque();
        defensor.defensa(ataque);
    }

    private Resultado determinarResultado(Personaje p1, Personaje p2){
        Resultado resultado = null;
        if (p1.getPuntosVida() <= 0 && p2.getPuntosVida() <= 0) {
            resultado = Resultado.EMPATE;
        } else if (p1.getPuntosVida() <= 0) {
            resultado = Resultado.DERROTA;
        } else {
            resultado = Resultado.VICTORIA;
        }
        return resultado;
    }

    private void actualizarPartidas(Jugador jGanador, Jugador jPerdedor){
        jGanador.añadirPartida( new Partida(jPerdedor, Resultado.VICTORIA) );
        jPerdedor.añadirPartida( new Partida(jGanador, Resultado.DERROTA) );
    }

    private Resultado invertirResultado(Resultado resultado){
        Resultado retorno;
        if (resultado == Resultado.VICTORIA) {
            retorno = Resultado.DERROTA;
        } else if (resultado == Resultado.DERROTA) {
            retorno = Resultado.VICTORIA;
        } else {
            retorno = Resultado.EMPATE;
        }
        return retorno;
    }

    private void reiniciarPuntosVida(ArrayList<Jugador> participantes){
        for (Jugador j : participantes) {
            j.getPersonajeFavorito().reiniciar();
        }
    }
}
