
package ejercicio_2;
import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades;
    
    //CONSTRUCTOR
    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }
    // OTROS METODOS
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
    
    // PARA PUNTO C
    public void listarPropiedadesMasEconomicas(){
        ArrayList<Propiedad> propiedadesEconomicas = propiedadesMasEconomicas();
        for (Propiedad propiedad : propiedadesEconomicas) {
            System.out.println(propiedad);
        }
    }
    
    // punto B
    public double promedioDePrecio(){
        double suma=0,promedio;
        for(Propiedad propiedad : propiedades){
            suma+=propiedad.getPrecio();
        }
        promedio=suma/propiedades.size();
        // propiedades.size(); devuelve el número de elementos que hay en la lista de propiedades de la inmobiliaria.
        return promedio;
    }
    
    // punto C
    private ArrayList<Propiedad> propiedadesMasEconomicas(){  
        ArrayList<Propiedad> propiedadesEconomicas = new ArrayList<>();
        double promedio = promedioDePrecio();
        for(Propiedad propiedad : propiedades){
            if(propiedad.getPrecio()<promedio){
                propiedadesEconomicas.add(propiedad);
            }
        }
        return propiedadesEconomicas; 
    }
    
    // punto D
    public int cantidadDePropiedadesSegunTipo(Tipo tipo){
        int cant=0;
        for(Propiedad propiedad : propiedades){
            if(propiedad.getTipo()== tipo){
                cant++;
            }
        }
        return cant;
    }
    
    
    
    
}
