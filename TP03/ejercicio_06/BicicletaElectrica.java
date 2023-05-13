
package ejercicio_06;

public class BicicletaElectrica extends Bicicleta { // herencia
 
    private double potencia;
    
    //CONSTRUCTOR
    public BicicletaElectrica( String marca, String modelo, double cantKM,double potencia) {
        super(marca, modelo, cantKM); // herencia
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }
    
    //OTROS METODOS
    public boolean SiPrestaServicio(){
        return getPotencia()<=250;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "potencia=" + potencia + '}';
    }
}
