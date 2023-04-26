package ejercicio_09;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int anioDeNacimiento;
    private Domicilio domicilio;
    
    
    // CONSTRUCTOR
    public Persona(String nombre, String apellido, int anioDeNacimiento, Domicilio dom) {
        setNombre(nombre);
        setApellido(apellido);
        setAnioDeNacimiento(anioDeNacimiento);
        setDomicilio(dom);
    }
    
    public void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3) {
           this.nombre = nombre; 
        }
    }
    
    public void setApellido(String apellido) {
        if(apellido != null && apellido.length() >= 2) {
           this.apellido = apellido; 
        }
    }    
    
    public void setAnioDeNacimiento(int anioDeNacimiento) {
        if (anioDeNacimiento > 0) {
            this.anioDeNacimiento = anioDeNacimiento;
        }
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public String getNombreCompleto (){
        return nombre + " " + apellido;
    }
    
    public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido) {
        setNombre(nuevoNombre);
        setApellido(nuevoApellido);        
    }    
    
    public int getEdadActual() {
        // Hubo que importar la clase 'LocalDate'
        int anioActual = LocalDate.now().getYear();
        int edad = anioActual - anioDeNacimiento;
        return edad;
    }

    public boolean esMayorQue(int unaEdad){
        return getEdadActual() >= unaEdad;
    }
    
    public void mostrarEstado () {
        System.out.println( toString() );
    }
    
    public void setNombreyApellido(String nombre,String apellido) {
        if(nombre != null && apellido != null){
        this.nombre = nombre;
        this.apellido = apellido;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", anioDeNacimiento=" + anioDeNacimiento + ", domicilio=" + domicilio + '}';
    }
    
}


