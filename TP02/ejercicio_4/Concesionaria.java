package ejercicio_4;

import java.util.ArrayList;

class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;
    
    // CONSTRUCTOR
    public Concesionaria(String nombre) {
        this.nombre = nombre;
        listaVehiculos = new ArrayList<>();
    }
    
    //OTROS METODOS
    
    // Punto B y para el punto C
    public void mostrarVehiculos() {
        for (Vehiculo v : listaVehiculos){
            v.mostrar(v);
        }
    }

    
    // para el punto D
    public int obtenerCantidadVehiculos() {
        return listaVehiculos.size();
    }    
        
  
    // para el punto E 
    public Vehiculo ObtenerVehiculoPorPatente(String patente) {
        Vehiculo vEncontrado = null;
        int i = 0;
        while(i < this.listaVehiculos.size() && vEncontrado == null) {
            if( patente.equals(this.listaVehiculos.get(i).getPatente()) ) {
                vEncontrado = this.listaVehiculos.remove(i);
            }
            i++;
        }
        return vEncontrado;
    }
    
    
    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    //punto B
    public void mostrarVehiculo(Tipo tipo){
        for(Vehiculo v : listaVehiculos){
            if(tipo.equals(v.getTipo())){
                System.out.println(v);
            }
        }
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + '}';
    }
    
}
