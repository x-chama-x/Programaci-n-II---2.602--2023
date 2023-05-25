package ejercicio_02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoMultimedia extends Archivo {

    private int duracion;
    private boolean enReproduccion;

    public ArchivoMultimedia(int duracion, boolean enReproduccion, String nombre, double peso, String localizacion, boolean abierto) {
        super(nombre, peso, localizacion, abierto);
        this.duracion = duracion;
        this.enReproduccion = enReproduccion;
    }

    public int getDuracion() {
        return duracion;
    }
    
    

    public void reproducir() {
        throw new UnsupportedOperationException("Método no implementado");
    }

    public void parar() {
        throw new UnsupportedOperationException("Método no implementado");
    }

}