
package ejercicio_1;


public class Domicilio {
    private String calle;
    private int numero;
    private String barrio;
    
    //CONSTRUCTOR
    public Domicilio(String calle, int numero, String barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    // para el punto G
    public String getBarrio() {
        return barrio;
    }
    
    
    

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", barrio=" + barrio + '}';
    }
    
    
}
