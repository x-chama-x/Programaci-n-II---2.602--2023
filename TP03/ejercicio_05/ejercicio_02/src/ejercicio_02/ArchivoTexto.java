package ejercicio_02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ArchivoTexto extends Archivo {

    private String codificacion;
    private boolean cifrado;

    public ArchivoTexto(String codificacion, String nombre, double peso, String localizacion, boolean abierto) {
        super(nombre, peso, localizacion, abierto);
        this.codificacion = codificacion;
        this.cifrado=false;
    }


    public void cifrar() {
        if(cifrado==false){
            cifrado=true;
        }
    }

    public String getCodificacion() {
        return codificacion;
    }


    
    

    @Override
    public String toString() {
        return super.toString() + "ArchivoTexto{" + "codificacion=" + codificacion + ", cifrado=" + cifrado + '}';
    }


    
    

}