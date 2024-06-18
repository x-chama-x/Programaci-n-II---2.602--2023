package licencias;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.cantidadPuertas = cantidadPuertas;
    }

}