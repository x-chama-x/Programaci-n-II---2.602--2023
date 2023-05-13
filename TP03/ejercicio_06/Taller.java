
package ejercicio_06;

import java.util.ArrayList;

public class Taller {
    // no es necesario un constructor para esta clase, ya que solo contiene un metodo
    public static int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas){
        int cont=0;
        for(Bicicleta bicicleta : bicicletas){
            if(bicicleta.SiPrestaServicio()){
                cont++;
            }
        }
        return cont;
    }
}


