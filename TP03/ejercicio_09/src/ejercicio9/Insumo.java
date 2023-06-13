package ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo implements Facturable {

    private String nombre;
    private double porcentGan;
    private double precioLista;
    private Tipo tipo;

    public Insumo(String string1, Tipo tipo2, double double3, double double4) {
        // Constructor a resolver...
    }

    public double facturar() {
        double monto = Matematica.sumarPorcentaje(precioLista, porcentGan);     
        return Matematica.sumarPorcentaje(monto, IVA);
    }

}