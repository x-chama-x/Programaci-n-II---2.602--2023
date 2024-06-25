package sistemareclamos;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Infraccion implements Calculable {

    private LocalDate fecha;
    public static double IMPORTE_UF = 60.5;

    public Infraccion(LocalDate fecha) {
        this.fecha = fecha;
    }

    public abstract boolean estaCaducada();

    public LocalDate getFecha() {
        return fecha;
    }

}