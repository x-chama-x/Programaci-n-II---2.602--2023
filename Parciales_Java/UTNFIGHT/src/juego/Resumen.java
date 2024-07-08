package juego;

public class Resumen {

    private Jugador jugador;

    public Resumen(Jugador jugador) {
        this.jugador = jugador;
        setCantTriunfos();
        setCantDerrotas();
        setCantEmpates();
    }

    private void setCantTriunfos() {
        jugador.getCantTriunfos();
    }

    private void setCantDerrotas() {
        jugador.getCantDerrotas();
    }

    private void setCantEmpates() {
        jugador.getCantEmpates();
    }

    public void mostrarResumen() {
        System.out.println("El jugador " + jugador.getID() + " tiene " + jugador.getCantTriunfos() + " triunfos, " + jugador.getCantDerrotas() + " derrotas y " + jugador.getCantEmpates() + " empates.");
    }





}