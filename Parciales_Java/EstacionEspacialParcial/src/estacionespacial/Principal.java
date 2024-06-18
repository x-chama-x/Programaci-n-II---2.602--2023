package estacionespacial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // crear la estacion espacial con 5 puntos de atraque libres
        EstacionEspacial e = new EstacionEspacial();
        for (int i = 0; i < 5; i++) {
            e.agregarPtoAtraque(new PuntoAtraque());
        }
        // crear naves
        NaveCargo nc1 = new NaveCargo(new Carga("Baterias recargables", 120), "Neptuno", 21); // no puede estacionarse
        NaveCargo nc2 = new NaveCargo(new Carga("Sustancias cósmicas", 90), "Marte", 15); // puede estacionarse
        NaveCruiser ncr1 = new NaveCruiser(0, "Mercurio", 8); // no puede estacionarse
        NaveCruiser ncr2 = new NaveCruiser(12, "Urano", 48); // puede estacionarse

        // estacionar naves
        e.estacionarNave(nc1);
        e.estacionarNave(nc2);
        e.estacionarNave(ncr1);
        e.estacionarNave(ncr2);

        // mostrar manifiestos
        e.mostrarManifiestos();

    }

}