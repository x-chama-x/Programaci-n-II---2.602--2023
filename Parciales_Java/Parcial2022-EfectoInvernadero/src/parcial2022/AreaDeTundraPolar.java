package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class AreaDeTundraPolar extends AreaDeTundra {

    private IntensidadViento intensidad;

    public AreaDeTundraPolar(IntensidadViento intensidad, int mmLlovidos, int extension, int elevacion, ArrayList<Double> tempMedias) {
        super(mmLlovidos, extension, elevacion, tempMedias);
        this.intensidad = intensidad;
    }

    public IntensidadViento getIntensidad() {
        return intensidad;
    }

    @Override
    public boolean enPeligro() {
        final int tempMin = 8;
        return (criterioPeligroTundra() || getTemperaturaMaximaRegistrada()>tempMin) && getIntensidad().equals(IntensidadViento.FUERTE);
    } // funciona

}