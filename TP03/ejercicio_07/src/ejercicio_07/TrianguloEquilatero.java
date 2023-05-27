package ejercicio_07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TrianguloEquilatero extends Figura {

    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        // Fórmula del área de un triángulo equilátero: (raíz cuadrada de 3 / 4) * lado al cuadrado
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        return area;
    }

    @Override
    public double perimetro() {
        // El perímetro de un triángulo equilátero es simplemente la suma de los tres lados
        double perimetro = 3 * lado;
        return perimetro;
    }
    
    

}