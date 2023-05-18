
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
            System.out.println(c);
            int i = 0;
            ArrayList<Vehiculo> listaVehiculos = c.getListaVehiculos(); // para poder usar el size()
            while(i<listaVehiculos.size()){
                Vehiculo v = listaVehiculos.get(i);
                System.out.println(v);
                i++;
            } 
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
    void cambiarVehiculoDeConcesionaria(String p,Concesionaria x){
        boolean salir = false;
        for(int j = 0; j < listaConcesionarias.size(); j++){
            Concesionaria c = listaConcesionarias.get(j);
            ArrayList<Vehiculo> listaVehiculos = c.getListaVehiculos();
            int i = 0;
            while(i<listaVehiculos.size()){
                Vehiculo v = listaVehiculos.get(i);
                if(p.equals(listaVehiculos.get(i).getPatente())){
                    borrarVehiculo(p);
                    x.agregarVehiculo(v);
                    System.out.println("El vehículo con patente " + p + " fue movido de la concesionaria " + c + " a la concesionaria " + x);
                    i=listaVehiculos.size();
                    j=listaConcesionarias.size();
                }
                i++;
            } 
        }    
    }
    
    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }
     
}
