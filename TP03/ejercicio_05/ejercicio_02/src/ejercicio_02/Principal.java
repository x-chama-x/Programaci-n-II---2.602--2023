package ejercicio_02;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Computadora c = new Computadora();
        // creo archivos de video
        ArchivoVideo v1 = new ArchivoVideo("1920x1080",FormatoVideo.MP4,300,true,"minecraft saga 1",550.60,"c:<downloads",false);
        ArchivoVideo v2 = new ArchivoVideo("640x480",FormatoVideo.MKV,700,false,"minecraft saga 2",1600.80,"c:<downloads",true);
        ArchivoVideo v3 = new ArchivoVideo("1920x1080",FormatoVideo.FLV,100,false,"minecraft saga 3",200.78,"c:<downloads",true);
        // creo archivos de Audio
        ArchivoAudio a1 = new ArchivoAudio("Artista1", "Album1", FormatoAudio.MP3, 180, false, "Cancion1", 5.4, "/ruta/cancion1.mp3", true);
        ArchivoAudio a2 = new ArchivoAudio("Artista2", "Album2", FormatoAudio.WAV, 240, true, "Cancion2", 8.2, "/ruta/cancion2.wav", false);
        ArchivoAudio a3 = new ArchivoAudio("Artista3", "Album3", FormatoAudio.AAC, 300, true, "Cancion3", 12.1, "/ruta/cancion3.flac", true);
        // creo archivos de texto
        ArchivoTexto at1 = new ArchivoTexto("UTF-8", "Documento1.txt", 2.3, "/ruta/documento1.txt", true);
        ArchivoTexto at2 = new ArchivoTexto("ISO-8859-1", "Documento2.txt", 1.8, "/ruta/documento2.txt", false);
        ArchivoTexto at3 = new ArchivoTexto("UTF-16", "Documento3.txt", 4.5, "/ruta/documento3.txt", true);
        
        // agrego archivos a la lista
        c.agregarArchivo(v1);
        c.agregarArchivo(v2);
        c.agregarArchivo(v3);
        c.agregarArchivo(a1);
        c.agregarArchivo(a2);
        c.agregarArchivo(a3);
        c.agregarArchivo(at1);
        c.agregarArchivo(at2);
        c.agregarArchivo(at3);
        
        // muestro archivos
        c.mostrarArchivos();
        
        // cierro todos los archivos
        System.out.println("");
        c.cerrarTodos();
        c.mostrarArchivos();
        
        //muestro cantidad de archivos de texto existentes
        System.out.println("");
        System.out.println(c.cantArchivosDeTexto());
        
        // pruebo funcion cifrarArchivos()
        c.cifrarArchivos();
        System.out.println("");
        c.mostrarArchivos();
        
        // pruebo funcion duracionPromedio()
        System.out.println("");
        System.out.println(c.duracionPromedio());
        
        // pruebo funcion videosFullHD()
        System.out.println("");
        ArrayList<Archivo> fullHD = c.videosFullHD();
        for(Archivo a: fullHD){
            System.out.println(a);
        }
    }

}