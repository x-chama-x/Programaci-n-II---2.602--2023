package ejercicio_02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoAudio extends ArchivoMultimedia {

    private String artista;
    private String album;
    private FormatoAudio formato;

    public ArchivoAudio(String artista, String album, FormatoAudio formato, int duracion, boolean enReproduccion, String nombre, double peso, String localizacion, boolean abierto) {
        super(duracion, enReproduccion, nombre, peso, localizacion, abierto);
        this.artista = artista;
        this.album = album;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() + "ArchivoAudio{" + "artista=" + artista + ", album=" + album + ", formato=" + formato + '}';
    }
    
    



}