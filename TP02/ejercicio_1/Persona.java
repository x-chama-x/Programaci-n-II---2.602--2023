
package ejercicio_1;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona(String DNI, String nombre, String apellido, Domicilio domicilio) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    // para el punto G
    public String getBarrio(){
        return domicilio.getBarrio();
    }
    
    // para el punto F
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + '}';
    }


    
    
    
    
    
}


