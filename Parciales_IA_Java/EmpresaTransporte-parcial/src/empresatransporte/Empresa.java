package empresatransporte;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Empresa {

    private ArrayList<Vehiculo> vehiculos;

    public Empresa() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }

    
    private ArrayList obtenerListado() {
        ArrayList<Vehiculo> vehiculosConMercPeligrosa = new ArrayList<>();
        for(Vehiculo v: vehiculos){
            if(v instanceof DeCarga){
                if(((DeCarga) v).transportaMercaderiaPeligrosa()==true){
                    vehiculosConMercPeligrosa.add(v);
                }
            } 
        }
        return vehiculosConMercPeligrosa;
    }
    
    public void mostrarListado(){
        ArrayList<Vehiculo> vehiculosConMercPeligrosa = obtenerListado();
        System.out.println("Vehículos con mercancía peligrosa:");
        for (Vehiculo v: vehiculosConMercPeligrosa){
            System.out.println("Placa: " + v.getPlaca());
        }
    }

    public Informe obtenerInforme() {
        Informe informe = new Informe(vehiculos);
        return informe;
    }

}