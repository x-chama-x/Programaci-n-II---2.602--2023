
package ejercicio_4;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        // instancio la marca de automoviles
        Marca toyota = new Marca("Toyota");
        // instancio Concesionarias de Toyota
        Concesionaria t1 = new Concesionaria("Toyota Santa Rosa");
        Concesionaria t2 = new Concesionaria("Toyota Santa Fe");
        Concesionaria t3 = new Concesionaria("Toyota Aguas calientes");
        // agrego las Concesionarias a la Marca Toyota
        toyota.agregarConcesionaria(t1);
        toyota.agregarConcesionaria(t2);
        toyota.agregarConcesionaria(t3);
        // instancio vehiculos de Toyota
        // precio en dolares
        Vehiculo a1 = new Vehiculo("FJK-689",25000,Tipo.AUTO);
        Vehiculo a2 = new Vehiculo("LMP-777",30500,Tipo.CAMIONETA);
        Vehiculo a3 = new Vehiculo("QRS-555",18000,Tipo.AUTO);
        Vehiculo a4 = new Vehiculo("XYZ-123",40000,Tipo.UTILITARIO);
        Vehiculo a5 = new Vehiculo("GHT-987",27500,Tipo.UTILITARIO);
        Vehiculo a6 = new Vehiculo("MNO-246",22000,Tipo.CAMIONETA);
        
        // añado los vehiculos a la lista de vehiculos de t1
        t1.agregarVehiculo(a1);
        t1.agregarVehiculo(a2);
        t1.agregarVehiculo(a3);
        
        // añado los vehiculos a la lista de vehiculos de t2
        t2.agregarVehiculo(a4);
        // añado los vehiculos a la lista de vehiculos de t2
        t3.agregarVehiculo(a5);
        t3.agregarVehiculo(a6);
        
        // pruebo el metodo de mostrarVehiculo(Tipo tipo);
        t1.mostrarVehiculo(Tipo.AUTO);
        System.out.println("");
        // pruebo el metodo de mostrarVehiculos() de la clase Marca;
        toyota.mostrarVehiculos();
        System.out.println("");
        //pruebo el metodo obtenerConcesionariaMaxVeh()
        
        ArrayList<Concesionaria> concesionariasMaxVeh = toyota.obtenerConcesionariaMaxVeh();
        for(Concesionaria c : concesionariasMaxVeh){
            System.out.println(c);
        }
        // funciona ya que me muestra a la concesionaria t1 (Santa Rosa)
        
        // pruebo el metodo borrarVehiculo(String p)
        // borro el auto de patente FJK-689 de de t1
        System.out.println("");
        toyota.borrarVehiculo("FJK-689");
        
        // pruebo si se elimino correctamente de t1
        System.out.println("");
        toyota.mostrarVehiculos();
        System.out.println("");
        
        // pruebo el metodo cambiarVehiculoDeConcesionaria()
        // muevo Vehiculo{patente=LMP-777, precio=$30500.0}
        // de la Concesionaria{nombre=Toyota Santa Rosa}
        // a la Concesionaria{nombre=Toyota Santa Fe}
        toyota.cambiarVehiculoDeConcesionaria("LMP-777", t2);
        toyota.mostrarVehiculos();
        
    }
    
}
