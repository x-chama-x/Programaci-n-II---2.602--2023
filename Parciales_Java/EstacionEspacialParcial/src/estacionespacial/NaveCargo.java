package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCargo extends Nave {

    private Carga carga;

    public NaveCargo(Carga carga, String planetaOrigen, int cantMiembrosTripulacion) {
        super(planetaOrigen, cantMiembrosTripulacion);
        this.carga = carga;
    }


    @Override
    public void mostrarManifiesto() {
        super.mostrarManifiesto();
        System.out.println("Descripcion: " + carga);
    }

    public boolean puedeEstacionar() {
        return carga.getVolumen() < 100;
    }

}