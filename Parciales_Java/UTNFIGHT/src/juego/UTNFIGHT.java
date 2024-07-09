package juego;

import java.util.ArrayList;

public class UTNFIGHT {

    private ArrayList<Jugador> jugadores;

    public UTNFIGHT() {
        jugadores = new ArrayList<>();
    }

    public void mostrarResumenDePartidas() {
        for (Jugador jugador : jugadores) {
            
            System.out.println( jugador.getID() + ": " + jugador.getResumenDePartidas() );
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

    public boolean batallar(String ID1, String ID2) {
        boolean sePudoBatallar = false;
        Jugador j1 = buscarJugadorPorID(ID1);
        if (j1 != null) {
            Jugador j2 = buscarJugadorPorID(ID2); // Solo buscar a j2 si j1 fue encontrado
            if (sonJugadoresValidos(j1, j2)) {
                sePudoBatallar = batallar(j1, j2);
            }
        }
        return sePudoBatallar;
    }
    
    public boolean batallar(Jugador j1, Jugador j2) {
        Batalla b = new Batalla(j1, j2);
        b.iniciar();
        return true;
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

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void arrancarBatallas() {        
        for (int i = 0; i < jugadores.size() - 1; i++) {
            Jugador actual = jugadores.get(i);
            for (int j = i+1; j < jugadores.size(); j++) {
                Jugador rival = jugadores.get(j);
                batallar(actual, rival);
            }            
        }
    }

}