package juego;
public class Arquero extends Personaje {

    private int cantFlechas;
    private double potenciaArco;

    public Arquero(String nombre, int cantFlechas, double potenciaArco) {
        super(nombre);
        this.cantFlechas = cantFlechas;
        this.potenciaArco = potenciaArco;
    }

    public double ataque() {
        double valorAtaque = 0;
        if (cantFlechas > 0) {
            valorAtaque = potenciaArco;
            cantFlechas--;
        }
        return valorAtaque;
    }
}