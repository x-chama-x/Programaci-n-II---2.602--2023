package empresatransporte;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DePasajeros extends Vehiculo implements Transportable<Pasajero>, CapacidadVerificable<Void> {

    private int CantAsientos;
    private ArrayList<Pasajero> pasajeros;

    public DePasajeros(int CantAsientos, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.CantAsientos = CantAsientos;
        this.pasajeros = new ArrayList<>();
    }

    public int getCantAsientos() {
        return CantAsientos;
    }

    @Override
    public void mostrarManifiesto() {
        System.out.println("placa: " + getPlaca()+ " pasajeros transportados: " 
        + getUnidadesTransportadas());
    }

    
    @Override // si la cantidad de asientos - las unidades transportadas es igual a cero, no hay más capacidad
    public boolean tieneCapacidad(Void t1) {
        boolean validacion = true;
        if(getCantAsientos()- getUnidadesTransportadas()==0){
            validacion = false;
        }
        return validacion;
    }

    @Override
    public void asignarCarga(Pasajero p) {
        if (tieneCapacidad(null)==true){
            pasajeros.add(p);
        } else{
            System.out.println("No hay capacidad suficiente para asiganar a " + p);
        }
    }

    @Override
    public int getUnidadesTransportadas() {
        int cont = 0;
        for (Pasajero p: pasajeros){
            cont++;
        }
        return cont;
    }

}