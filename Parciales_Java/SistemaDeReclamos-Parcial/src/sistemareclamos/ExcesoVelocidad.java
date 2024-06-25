package sistemareclamos;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExcesoVelocidad extends Infraccion {

    public ExcesoVelocidad(LocalDate fecha) {
        super(fecha);
    }

    @Override
    public double calcularImporte() {
        final int UF = 100;
        return IMPORTE_UF * UF;
    }

    @Override
    public boolean estaCaducada() {
        return false; // por ahora no caducan
    }

}