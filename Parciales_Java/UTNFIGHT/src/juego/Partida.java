package juego;

public class Partida {

    private Jugador adversario;
    private Resultado resultado;

    public Partida(Jugador adversario, Resultado resultado) {
        this.adversario = adversario;
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

}