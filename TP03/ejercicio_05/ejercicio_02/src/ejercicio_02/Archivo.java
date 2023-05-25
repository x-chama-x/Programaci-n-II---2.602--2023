package ejercicio_02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Archivo {

    private String nombre;
    private double peso;
    private String localizacion;
    private boolean abierto;

    public Archivo(String nombre, double peso, String localizacion, boolean abierto) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.abierto = abierto;
    }

    
    public void abrir() {
        if(abierto==false){
            abierto = true;
        }
    }

    public void cerrar() {
        if(abierto==true){
            abierto = false;
        }
    }

    public void mover(String string1) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", abierto=" + abierto + '}';
    }
    
    

}