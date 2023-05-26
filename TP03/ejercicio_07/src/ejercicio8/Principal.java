package ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // crear instancias de cada figura concreta
        Circunferencia circulo = new Circunferencia(5,"rojo");
        Rectangulo rectangulo = new Rectangulo(3, 4,"verde");
        TrianguloEquilatero triangulo = new TrianguloEquilatero(6,"azul");
        
        // llamar a los métodos area() y perimetro() de cada figura concreta
//        System.out.println(circulo.area());
//        System.out.println(circulo.perimetro());
//        System.out.println(rectangulo.area());
//        System.out.println(rectangulo.perimetro());
//        System.out.println(triangulo.area());
//        System.out.println(triangulo.perimetro());
        
        // creo una instancia de GrupoDeFiguras y agregar las figuras a la lista
        GrupoDeFiguras grupo = new GrupoDeFiguras();
        grupo.agregarFigura(circulo);
        grupo.agregarFigura(rectangulo);
        grupo.agregarFigura(triangulo);
        
        
        // pruebo el método mostrarInfoDeFiguras() de la clase GrupoDeFiguras
        grupo.mostrarInfoDeFiguras();
    }
    
    

}