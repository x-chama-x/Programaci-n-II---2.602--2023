package empresatransporte;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Informe {

    private int totalPasajerosTransportados;
    private double totalToneladasMercancia;

    public Informe(ArrayList<Vehiculo> vehiculos) {
        setTotalPasajerosTransportados(vehiculos);
        setTotalToneladasMercancia(vehiculos);
    }
   
    
    private void setTotalPasajerosTransportados(ArrayList<Vehiculo> vehiculos) {
        this.totalPasajerosTransportados=getTotalPasajerosTransportados(vehiculos);
    }

    private void setTotalToneladasMercancia(ArrayList<Vehiculo> vehiculos) {
        this.totalToneladasMercancia=getTotalToneladasMercancia(vehiculos);
    }
    
    
    private int getTotalPasajerosTransportados(ArrayList<Vehiculo> vehiculos){
        int totalPasajeros = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof DePasajeros) {
                totalPasajeros += ((DePasajeros) v).getUnidadesTransportadas();
            }
        } return totalPasajeros; 
    }

    private double getTotalToneladasMercancia(ArrayList<Vehiculo> vehiculos) {
        double totalToneladas = 0.0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof DeCarga) {
                totalToneladas += ((DeCarga) v).getPesoTotalTransportado();
            }
        }
        return totalToneladas;
    }
    

    @Override
    public String toString() {
        return "Informe{" + "totalPasajerosTransportados=" + totalPasajerosTransportados + ", totalToneladasMercancia=" + totalToneladasMercancia + '}';
    }

}