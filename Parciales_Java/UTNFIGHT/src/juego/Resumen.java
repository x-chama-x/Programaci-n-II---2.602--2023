package juego;

public class Resumen {
    
    private int victorias;
    private int empates;
    private int derrotas;

    public Resumen(int[] contadores) {
        this.victorias = contadores[0];
        this.empates = contadores[1];
        this.derrotas = contadores[2];
    }

    @Override
    public String toString() {
        return "Resumen{" + "victorias=" + victorias + ", empates=" + empates + ", derrotas=" + derrotas + '}';
    }
    
    
}