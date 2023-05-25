package ejercicio_02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoVideo extends ArchivoMultimedia {

    private String resolucion;
    private FormatoVideo formato;

    public ArchivoVideo(String resolucion, FormatoVideo formato, int duracion, boolean enReproduccion, String nombre, double peso, String localizacion, boolean abierto) {
        super(duracion, enReproduccion, nombre, peso, localizacion, abierto);
        this.resolucion = resolucion;
        this.formato = formato;
    }

    public String getResolucion() {
        return resolucion;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "ArchivoVideo{" + "resolucion=" + resolucion + ", formato=" + formato + '}';
        // Llama al método toString() de la superclase utilizando la palabra clave super para obtener la representación de cadena de los atributos heredados.
    }

    



}