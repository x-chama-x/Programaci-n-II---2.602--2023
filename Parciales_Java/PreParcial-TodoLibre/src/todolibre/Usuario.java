package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Usuario {

    private String ID;
    private String nombre;
    private String apellido;
    private String mail;
    private Domicilio domicilio;

    public Usuario(String ID, String nombre, String apellido, String mail, Domicilio domicilio) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}