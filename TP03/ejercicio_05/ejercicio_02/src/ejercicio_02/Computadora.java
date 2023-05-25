package ejercicio_02;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Computadora {

    private ArrayList<Archivo> archivos;

    public Computadora() {
        archivos = new ArrayList<>();
    }
    
    // otros metodos
    public void agregarArchivo(Archivo a){
        if(a!=null){
            archivos.add(a);
        }
    }
    
    public void mostrarArchivos(){
        for(Archivo a: archivos){
            System.out.println(a);
        }
    }
    

    public void cerrarTodos() {
        for (Archivo a: archivos){
            a.cerrar();
        }
    }

    public int cantArchivosDeTexto() {
        int i=0;
        for(Archivo a: archivos){
            if(a instanceof ArchivoTexto){
                i++;
            }
        }
        return i;
    }
    // el operador instanceof se utiliza para verificar si un objeto es una instancia

    public void cifrarArchivos() {
        for(Archivo a: archivos){
            if(a instanceof ArchivoTexto){
                if(((ArchivoTexto) a).getCodificacion().equals("UTF-8")){
                   ((ArchivoTexto) a).cifrar(); //nose xq aparece así 
                }
            }
        }
    }

    public double duracionPromedio() {
        double duracion=0.0;
        int cantArchivos=0;
        for(Archivo a: archivos){
            if (a instanceof ArchivoMultimedia){
                cantArchivos++;
                duracion=duracion+((ArchivoMultimedia) a).getDuracion();
            }
        }
        duracion=duracion/cantArchivos;
        return duracion;
    }

    public ArrayList<Archivo> videosFullHD() {
        ArrayList<Archivo> fullHD = new ArrayList<>(); 
        for(Archivo a: archivos){
            if (a instanceof ArchivoVideo){
                if(((ArchivoVideo) a).getResolucion().equals("1920x1080")){
                    fullHD.add(a);
                }
            }
        }
        return fullHD;
    }

    @Override
    public String toString() {
        return "Computadora{" + "archivos=" + archivos + '}';
    }
    
    

}