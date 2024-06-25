package sistemareclamos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class MalEstacionamiento extends Infraccion {

    public MalEstacionamiento(LocalDate fecha) {
        super(fecha);
    }

    public double calcularImporte() {
        final int UF = 20;
        final int IMPORTE_FIJO = 300;
        return IMPORTE_UF * UF + IMPORTE_FIJO;
    }

    public boolean estaCaducada() {
        return getFecha().plus(365, ChronoUnit.DAYS).isBefore(LocalDate.now()); // caduca en 1 año
    }

}