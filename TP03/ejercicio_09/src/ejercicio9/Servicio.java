package ejercicio9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio implements Facturable {

    private double cantHoras;

    public Servicio(double cantHoras) {
        this.cantHoras = cantHoras;
    }

    public abstract double getValorHora();

    @Override
    public double facturar() {
        return Matematica.sumarPorcentaje(getPrecio(), IVA/2.0);
    }

    public double getPrecio() {
         return cantHoras * getValorHora();
    }

}