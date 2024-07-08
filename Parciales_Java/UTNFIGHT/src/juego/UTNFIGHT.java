package juego;

import java.util.ArrayList;

public class UTNFIGHT {

    private ArrayList<Jugador> jugadores;

    public UTNFIGHT() {
        jugadores = new ArrayList<>();
    }

    private Resumen getResumenDePartidas(String ID) {
        Jugador jugador = buscarJugadorPorID(ID);
        Resumen resumen = new Resumen(jugador);
        return resumen;
    }

    public void mostrarResumenDePartidas() {
        for (Jugador jugador : jugadores) {
            Resumen resumen = getResumenDePartidas(jugador.getID());
            resumen.mostrarResumen();
        }
    }

    private Jugador buscarJugadorPorID(String ID) {
        Jugador retorno = null;
        int i = 0;
        while (i < jugadores.size()) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getID().equals(ID)) {
                retorno = jugador;
                i = jugadores.size();
            } else {
                i++;
            }
        }
        return retorno;
    }

    public boolean batallar(String ID1, String ID2){
        boolean sePudoBatallar = false;
        Jugador j1 = buscarJugadorPorID(ID1);
        Jugador j2 = buscarJugadorPorID(ID2);

        if (sonJugadoresValidos(j1, j2)) {
            Batalla b = new Batalla();
            b.agregarParticipante(j1);
            b.agregarParticipante(j2);
            sePudoBatallar = b.iniciarBatalla();
        }
        return sePudoBatallar;
    }

    private boolean sonJugadoresValidos(Jugador jugador1, Jugador jugador2) {
        return jugador1 != null && jugador2 != null;
    }

    public void informarQueSePudoBatallar(boolean sePudoBatallar, String ID1, String ID2){
        if(sePudoBatallar){
            System.out.println("Se pudo batallar entre los jugadores con ID: " + ID1 + " y " + ID2);
        }else{
            System.out.println("No se pudo batallar entre los jugadores con ID: " + ID1 + " y " + ID2);
        }
    }

    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

}