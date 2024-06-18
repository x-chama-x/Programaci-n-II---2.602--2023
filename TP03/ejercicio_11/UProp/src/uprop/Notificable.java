package uprop;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public interface Notificable {

    public void notificarCambioPrecio(double double1, double double2, Inmueble inmueble);

    static String GENERAR_MENSAJE_COMUN(double double1, double double2, Inmueble inmueble) {
        return "el inmueble " + inmueble.toString() + " ha cambiado de precio de " + double1 + " a " + double2;
    }

}