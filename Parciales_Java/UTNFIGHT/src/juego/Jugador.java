package juego;

import java.util.ArrayList;

public class Jugador {

    private String ID;
    private Personaje personajeFavorito;
    private ArrayList<Partida> partidasJugadas;

    public Jugador(String ID, Personaje personajeFavorito) {
        this.ID = ID;
        this.personajeFavorito = personajeFavorito;
        this.partidasJugadas = new ArrayList<Partida>();
    }

    public String getID() {
        return ID;
    }

    private int getCantidadPorResultado(Resultado resultadoBuscado) {
        int contador = 0;
        for (Partida partida : partidasJugadas) {
            if (partida.getResultado() == resultadoBuscado) {
                contador++;
            }
        }
        return contador;
    }

    public int getCantTriunfos() {
        return getCantidadPorResultado(Resultado.VICTORIA);
    }

    public int getCantDerrotas() {
        return getCantidadPorResultado(Resultado.DERROTA);
    }

    public int getCantEmpates() {
        return getCantidadPorResultado(Resultado.EMPATE);
    }

    // obtener el personaje favorito
    public Personaje getPersonajeFavorito() {
        return personajeFavorito;
    }

    public void añadirPartida(Partida partida) {
        partidasJugadas.add(partida);
    }
}