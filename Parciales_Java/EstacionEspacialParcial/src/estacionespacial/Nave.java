package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Nave implements Estacionable {

    private String planetaOrigen;
    private int cantMiembrosTripulacion;
    private boolean estacionada;

    public Nave(String planetaOrigen, int cantMiembrosTripulacion) {
        this.planetaOrigen = planetaOrigen;
        this.cantMiembrosTripulacion = cantMiembrosTripulacion;
        this.estacionada = false;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public int getCantMiembrosTripulacion() {
        return cantMiembrosTripulacion;
    }

    public boolean isEstacionada() {
        return estacionada;
    }

    public void setEstacionada(boolean estacionada) {
        this.estacionada = estacionada;
    }

    public void mostrarManifiesto() {
        System.out.println("Planeta de origen: " + getPlanetaOrigen());
        System.out.println("Cantidad de miembros de la tripulación: " + getCantMiembrosTripulacion());
    }

}