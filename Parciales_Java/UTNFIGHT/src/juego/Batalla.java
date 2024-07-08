package juego;

import java.util.ArrayList;

public class Batalla {
    private ArrayList<Jugador> participantes;

    public Batalla() {
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Jugador j) {
        participantes.add(j);
    }

    public boolean iniciarBatalla(){
        boolean sePudoBatallar = false;
        Personaje p1 = participantes.get(0).getPersonajeFavorito();
        Personaje p2 = participantes.get(1).getPersonajeFavorito();
        while (ambosPersonajesVivos(p1, p2)) {
            realizarTurno(p1, p2);
            if (ambosPersonajesVivos(p1, p2)) {
                realizarTurno(p2, p1);
            }
        }
        Resultado resultado = determinarResultado(p1, p2);
        actualizarPartidas(participantes.get(0), participantes.get(1), resultado);
        reiniciarPuntosVida(participantes);
        sePudoBatallar = true;
        return sePudoBatallar;
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
        } else if (p2.getPuntosVida() <= 0) {
            resultado = Resultado.VICTORIA;
        }
        return resultado;
    }

    private void actualizarPartidas(Jugador j1, Jugador j2, Resultado resultado){
        Partida p1 = new Partida(j2, resultado);
        Partida p2 = new Partida(j1, invertirResultado(resultado));
        j1.añadirPartida(p1);
        j2.añadirPartida(p2);
    }

    private Resultado invertirResultado(Resultado resultado){
        Resultado retorno = null;
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
            j.getPersonajeFavorito().setPuntosVida(100);
        }
    }
}
