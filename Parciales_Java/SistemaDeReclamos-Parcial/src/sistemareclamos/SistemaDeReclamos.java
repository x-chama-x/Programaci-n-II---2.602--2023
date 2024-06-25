package sistemareclamos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class SistemaDeReclamos {

    private ArrayList<Reclamo> reclamos;

    public SistemaDeReclamos() {
        this.reclamos = new ArrayList<Reclamo>();
    }

    public void agregarReclamo(Reclamo r) {
        this.reclamos.add(r);
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (Reclamo r : reclamos) {
            total += r.getImporte();
        }
        return total;
    }

    public int contarReclamosCaducados() {
        int count = 0;
        for (Reclamo r : reclamos) {
            if (r.estaCaducada())  {
                count++;
            }
        }
        return count;
    }

}