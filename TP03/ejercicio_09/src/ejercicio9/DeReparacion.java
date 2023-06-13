package ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeReparacion extends Servicio {

    private static final double VALORHORA = 180;
    private int dificultad;

    public DeReparacion(int dificultad, double cantHoras) {
        super(cantHoras);
        setDificultad(dificultad);
    }

    private void setDificultad(int dificultad) {
        if(getDificultad() >5){
            this.dificultad = 5;
        }
        else if(getDificultad() < 1){
            this.dificultad = 1;
        }else{
            this.dificultad = dificultad;
        }
    }
    
    public double getValorHora() {
        return VALORHORA;
    }


    int getDificultad() {
        return dificultad;
    }
    
    @Override
    public double getPrecio() {
        double precio = super.getPrecio();
        if (dificultad >= 3) {
            precio = Matematica.sumarPorcentaje(precio, 25);
        } 
        return precio;
    }
    //se sobrescribe el método getPrecio() para calcular el precio del servicio de reparación.
    
// EXPLICACION 
    // La capacidad de sobrescribir un método en una clase hija se basa en el 
    // principio de herencia y polimorfismo en la programación orientada a objetos.

    // Cuando una clase hija hereda de una clase padre, adquiere todos los métodos y atributos de la clase padre. 
    // Sin embargo, en algunos casos, la clase hija puede querer proporcionar una implementación diferente 
    // para un método heredado. Esto se logra utilizando la técnica de sobrescritura de métodos.

}