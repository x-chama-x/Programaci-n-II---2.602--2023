package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoAtraque {

    private Nave nave;

    public PuntoAtraque() {
        this.nave = null; // Inicialmente no hay ninguna nave estacionada
    }


    public void estacionarNave(Nave n) { // sería como un setter
        if (!n.puedeEstacionar()) {
            System.out.println("La nave de " + n.getPlanetaOrigen() + " no se puede estacionar");
        } else if (n.isEstacionada()) {
                System.out.println("La nave ya está estacionada");

        } else {
            this.nave = n;
            n.setEstacionada(true);
        }
    }

    public boolean hayNave() {
        return nave != null;
    }


    public Nave getNave() {
        return nave;
    }
}