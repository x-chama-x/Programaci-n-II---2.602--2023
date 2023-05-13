
package ejercicio_06;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double cantKM;
    
    //CONSTRUCTOR
    public Bicicleta(String marca, String modelo, double cantKM) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantKM = cantKM;
    }

    public double getCantKM() {
        return cantKM;
    }
    
    public boolean SiPrestaServicio(){
        return getCantKM()<2000;
    }
    
    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", modelo=" + modelo + ", cantKM=" + cantKM + '}';
    }
    
}
