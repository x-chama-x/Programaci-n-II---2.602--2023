
package ejercicio_4;

import java.util.ArrayList;

public class Marca {
    private String nombre;
    private ArrayList<Concesionaria> listaConcesionarias;
    
    //CONSTRUCTOR
    public Marca(String nombre) {
        this.nombre = nombre;
        listaConcesionarias = new ArrayList<>();
    }
    
    // OTROS METODOS
    public void agregarConcesionaria(Concesionaria c){
        listaConcesionarias.add(c);
    }
    //punto C REFACTORIZADO
    public void mostrarVehiculos(){
        for (Concesionaria c : listaConcesionarias){
            c.mostrarVehiculos();
        }
    }
    
    // punto D --> Modularicé, pero quiza se pueda modularizar más aún...
    public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh() {
        ArrayList<Concesionaria> concesionariasMaxVeh = new ArrayList<>();
        int maxVehiculos = obtenerMaximaCantidadVehiculos();
        for (Concesionaria c : listaConcesionarias) {
            int cantidadVehiculos = c.obtenerCantidadVehiculos();
            if (cantidadVehiculos == maxVehiculos) {
                concesionariasMaxVeh.add(c);
            }
        }
        return concesionariasMaxVeh;
    }

    private int obtenerMaximaCantidadVehiculos() {
        int maxVehiculos = 0;
        for (Concesionaria c : listaConcesionarias) {
            int cantidadVehiculos = c.obtenerCantidadVehiculos();
            if (cantidadVehiculos > maxVehiculos) {
                maxVehiculos = cantidadVehiculos;
            }
        }
        return maxVehiculos;
    }

    //punto E 
    public void borrarVehiculo(String p) {
        Vehiculo vBorrar = eliminarVehiculoPorPatente(p);
        if(vBorrar != null){
            System.out.println("patente eliminada");
        }else{
            System.out.println("no se encontro la patente" + p);
        }
    }    
    
    // Para punto E y F
    private Vehiculo eliminarVehiculoPorPatente(String patente) {
        Vehiculo vEncontrado = null;
        int i = 0;
        while(i < this.listaConcesionarias.size() && vEncontrado == null) {
            Concesionaria cActual = this.listaConcesionarias.get(i);
            vEncontrado = cActual.ObtenerVehiculoPorPatente(patente);
            i++;
        }
        return vEncontrado;
    }


    
    // punto F 
    public void cambiarVehiculoDeConcesionaria(String p,Concesionaria x){
        Vehiculo vEncontrado = eliminarVehiculoPorPatente(p);
        if (vEncontrado != null) {
            x.agregarVehiculo( vEncontrado );
        }
    }


    
    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }


     
}