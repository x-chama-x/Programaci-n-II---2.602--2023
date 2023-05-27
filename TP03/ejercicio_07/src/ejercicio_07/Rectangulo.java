package ejercicio_07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        // El área de un rectángulo se calcula multiplicando la base por la altura
        double area = base * altura;
        return area;
    }

    @Override
    public double perimetro() {
        // El perímetro de un rectángulo se calcula sumando los lados de la base y la altura, y luego multiplicando por 2
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

}