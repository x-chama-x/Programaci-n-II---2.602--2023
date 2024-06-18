package empresatransporte;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeCarga extends Vehiculo implements Transportable<Mercancia>, CapacidadVerificable<Mercancia> {

    private double capacidadCarga;
    private ArrayList<Mercancia> mercancias;

    public DeCarga(double capacidadCarga, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.mercancias = new ArrayList<>();
    }

    @Override
    public void mostrarManifiesto() {
        System.out.println("placa: " + getPlaca()); 
        System.out.println("unidades transportadas:" + getUnidadesTransportadas());
        System.out.println("peso total transportado: " + getPesoTotalTransportado());   
    }

    @Override // si la capacidad con la nueva mercaderia da negativa, es falso.
    public boolean tieneCapacidad(Mercancia m) {
        boolean validacion = true;
        if(getCapacidadCarga()- getPesoTotalTransportado() - m.getPeso() < 0){
            validacion = false;
        }
        return validacion;
    }

    @Override // si el vehiculo tiene capacidad para la mercancia a agregar, se agrega.
    public void asignarCarga(Mercancia m) {
        if (tieneCapacidad(m)== true){
            mercancias.add(m);
        } else{
            System.out.println("No hay capacidad suficiente para asignar a " + m);
        }
    }

    @Override
    public int getUnidadesTransportadas() {
        int cont = 0;
        for(Mercancia m: mercancias){
            cont++;
        }
        return cont;
    }
    
    public double getPesoTotalTransportado(){
        double peso = 0.0;
        for (Mercancia m: mercancias){
            peso = peso + m.getPeso();
        }
        return peso;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public boolean transportaMercaderiaPeligrosa(){
        boolean transporta=false;
        for(Mercancia m: mercancias){
            if(m.isEsPeligrosa()==true){
                transporta=true;
            }
        }
        return transporta;
    }
}