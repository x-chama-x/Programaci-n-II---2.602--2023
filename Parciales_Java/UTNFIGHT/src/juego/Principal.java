package juego;

public class Principal {

    public static void main(String[] args) {

        UTNFIGHT juego = new UTNFIGHT();

        // crear personajes
        Personaje p1 = new Guerrero("Aquiles",100);
        Personaje p2 = new Arquero("Legolas", 20, 50);
        Personaje p3 = new Guerrero("Hector", 40);
        Personaje p4 = new Arquero("Robin Hood", 30, 500);

        // crear jugadores
        Jugador j1 = new Jugador("01234", p1);
        Jugador j2 = new Jugador("14231", p2);
        Jugador j3 = new Jugador("53242", p3);
        Jugador j4 = new Jugador("55401", p4);

        // añadir jugadores al juego
        juego.añadirJugador(j1);
        juego.añadirJugador(j2);
        juego.añadirJugador(j3);
        juego.añadirJugador(j4);

        // iniciar batalla entre j1 y j2
        juego.informarQueSePudoBatallar(juego.batallar("01234", "14231"), "01234", "14231");

        // iniciar batalla entre j1 y j3
        juego.informarQueSePudoBatallar(juego.batallar("01234", "53242"), "14231", "53242");

        // iniciar batalla entre j1 y j4
        juego.informarQueSePudoBatallar(juego.batallar("01234", "55401"), "01234", "55401");

        // obtener resumen de partidas de todos los jugadores
        juego.mostrarResumenDePartidas();

    }

}