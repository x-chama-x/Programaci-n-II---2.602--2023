package ejercicio_11;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Domicilio domicilio;
    
    
    // CONSTRUCTOR
    public Persona(String nombre, String apellido, LocalDate fecha, Domicilio dom) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fecha;
        this.domicilio=dom;
    }
    
    public String getNombreCompleto (){
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado () {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", domicilio=" + domicilio + '}';
    }
}


