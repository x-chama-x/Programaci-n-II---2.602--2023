
package ejercicio_06;

import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
        ArrayList bicicletas = new ArrayList<>();
        bicicletas.add(new Bicicleta("Marca1", "Modelo1", 1500)); // este si
        bicicletas.add(new Bicicleta("Marca2", "Modelo2", 2500)); // este no
        bicicletas.add(new BicicletaElectrica("Marca3", "Modelo3", 1000, 140)); // este si
        bicicletas.add(new BicicletaElectrica("Marca4", "Modelo4", 3000, 300)); // este no
        
        // pruebo el metodo cantServiciosPosibles(ArrayList<Bicicleta> bicicletas)
         int serviciosPosibles = Taller.cantServiciosPosibles(bicicletas);
         System.out.println("Cantidad de servicios posibles: " + serviciosPosibles);
        // 2 servicios posibles 
            
    }
    
}
