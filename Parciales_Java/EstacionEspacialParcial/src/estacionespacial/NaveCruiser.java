package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCruiser extends Nave {

    private int cantPasajeros;

    public NaveCruiser(int cantPasajeros, String planetaOrigen, int cantMiembrosTripulacion) {
        super(planetaOrigen, cantMiembrosTripulacion);
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public void mostrarManifiesto() {
        super.mostrarManifiesto();
        System.out.println("Porcentaje de pasajeros: " + (cantPasajeros * 100 / (cantPasajeros + getCantMiembrosTripulacion())) + "%");
    }

    public boolean puedeEstacionar() {
        return cantPasajeros > 0;
    }

}