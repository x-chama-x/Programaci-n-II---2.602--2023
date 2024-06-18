package uprop;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Inmobiliaria implements Notificable {

    private String nombre;
    private String correo;
    private double porcentajeComisionPorVenta;
    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria(String nombre, String correo, double porcentajeComisionPorVenta) {
        this.nombre = nombre;
        this.correo = correo;
        this.porcentajeComisionPorVenta = porcentajeComisionPorVenta;
        this.inmuebles = new ArrayList<Inmueble>();
    }

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    @Override
    public void notificarCambioPrecio(double double1, double double2 , Inmueble inmueble) {
        String mensaje = Notificable.GENERAR_MENSAJE_COMUN(double1, double2, inmueble);
        System.out.println("Hemos recibido un mail a nuestra casilla " + correo + " con el mensaje: " + mensaje);
    }

}