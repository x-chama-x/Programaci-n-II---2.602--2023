package ejercicio_07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Circunferencia extends Figura {

    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        // El área de una circunferencia se calcula utilizando la fórmula: π * radio al cuadrado
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double perimetro() {
        // El perímetro de una circunferencia se calcula utilizando la fórmula: 2 * π * radio
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}