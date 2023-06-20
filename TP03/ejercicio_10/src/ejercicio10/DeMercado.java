package ejercicio10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class DeMercado extends Fuente {

    private double tamanioArchivo;

    public DeMercado(double tamanioArchivo, String nombre, String ubicacion) {
        super(nombre, ubicacion);
        this.tamanioArchivo = tamanioArchivo;
    }
    
    @Override
    public double indiceCalidad() {
        return 450/tamanioArchivo;
    }
    
   
    @Override
    public String toString() {
        return "DeMercado{" + "tamanioArchivo=" + tamanioArchivo + '}';
    }
    
    

}