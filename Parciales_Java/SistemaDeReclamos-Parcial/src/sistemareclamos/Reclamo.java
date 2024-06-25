package sistemareclamos;
import java.util.Random;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Reclamo {

    private int numero;
    private String DNI;
    private Infraccion infraccion;
    private static Random rand = new Random();

    public Reclamo(String DNI, Infraccion infraccion) {
        this.numero = generarNumeroReclamo();
        this.DNI = DNI;
        this.infraccion = infraccion;
    }

    public int generarNumeroReclamo() {
        return rand.nextInt(10000); // Genera un número aleatorio entre 0 y 9999
    }

    // obtener el importe de la infracción
    public double getImporte() {
        return infraccion.calcularImporte();
    }

    // saber si la infracción está caducada
    public boolean estaCaducada() {
        return infraccion.estaCaducada();
    }



}