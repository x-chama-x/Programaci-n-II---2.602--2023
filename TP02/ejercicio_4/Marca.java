
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
    //punto C
    public void mostrarVehiculos(){
        for (Concesionaria c : listaConcesionarias){
            c.mostrarVehiculos();
        }
    }
    
    // punto D 
    public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh(){
        ArrayList<Concesionaria> concesionariasMaxVeh = new ArrayList<>();
        int maxVehiculos = 0;
        for (Concesionaria c : listaConcesionarias){
            int cantidadVehiculos = c.getListaVehiculos().size();
            if(cantidadVehiculos>maxVehiculos){
                concesionariasMaxVeh.clear(); // borro la lista 
                concesionariasMaxVeh.add(c);
                maxVehiculos = cantidadVehiculos;
            }
            else if(cantidadVehiculos==maxVehiculos)
                concesionariasMaxVeh.add(c); 
        }  
        return concesionariasMaxVeh;
    }
    
    // punto E 
    public void borrarVehiculo(String p){
        for(Concesionaria c : listaConcesionarias){
            ArrayList<Vehiculo> listaVehiculos = c.getListaVehiculos();
            int i = 0;
            while(i<listaVehiculos.size()){
                Vehiculo v = listaVehiculos.get(i);
                if(p.equals(listaVehiculos.get(i).getPatente())){
                    listaVehiculos.remove(i);
                    System.out.println("se borro el auto con patente: " + p + " correctamente" );
                }
                i++;
            } 
        }
    }
    
    // punto F 
    public void cambiarVehiculoDeConcesionaria(String p,Concesionaria x){
        Vehiculo vEncontrado = eliminarVehiculoPorPatente(p);
        if (vEncontrado != null) {
            x.agregarVehiculo( vEncontrado );
        }
    }

    private Vehiculo eliminarVehiculoPorPatente(String patente) {
        Vehiculo vEncontrado = null;
        int i = 0;
        while(i < this.listaConcesionarias.size() && vEncontrado == null) {
            Concesionaria cActual = this.listaConcesionarias.get(i);
            vEncontrado = cActual.eliminarVehiculoPorPatente(patente);
            i++;
        }
        return vEncontrado;
    }
    
    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }
     
}
