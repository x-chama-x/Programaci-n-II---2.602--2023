package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaGelida extends Area {

    private double porcentCongelado;

    public AreaGelida(double porcentCongelado, int extension, int elevacion, ArrayList<Double> tempMedias) {
        super(extension, elevacion, tempMedias);
        this.porcentCongelado = porcentCongelado;
    }

    @Override
    public boolean enPeligro() {
        final int tempMax = -10;
        final int porcentMin = 90;
        return getTempPromedio() < tempMax && porcentCongelado > porcentMin;
    } //funciona
}