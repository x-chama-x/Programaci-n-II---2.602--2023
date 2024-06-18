package uprop;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Cliente implements Notificable {

    private String apellido;
    private String nombre;
    private String telefono;
    private String correo;

    public Cliente(String apellido, String nombre, String telefono, String correo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void notificarCambioPrecio(double double1, double double2, Inmueble inmueble) {
        String mensaje = Notificable.GENERAR_MENSAJE_COMUN(double1, double2, inmueble);
        System.out.println("He recibido un SMS en mi telefono " + telefono + " con el mensaje: " + mensaje);
    }

}