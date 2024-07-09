package juego;

public class Principal {

    public static void main(String[] args) {

        UTNFIGHT juego = new UTNFIGHT();
        
        // crear jugadores
        juego.agregarJugador(new Jugador("01234", new Guerrero("Aquiles",100)));
        juego.agregarJugador(new Jugador("14231", new Arquero("Legolas", 20, 50)));
        juego.agregarJugador(new Jugador("53242", new Guerrero("Hector", 40)));
        juego.agregarJugador(new Jugador("55401", new Arquero("Robin Hood", 30, 20)));
        juego.agregarJugador(new Jugador("19662", new Guerrero("Gokú", 500)));
        
        juego.arrancarBatallas();
        juego.mostrarResumenDePartidas();

    }

}