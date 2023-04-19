
package ejercicio_01;

import java.time.LocalDate;

public class Persona {
    public String nombre;
    public String apellido;
    public int anioDeNacimiento;
    
    public String getNombreCompleto (){
        return nombre + " " + apellido;
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
    
    public void mostrarEstado(){
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Edad: " + getEdadActual());
    }

    public void setNombre(String nombre) {
        if(nombre != null){
           this.nombre = nombre; 
        }
    }

    public void setApellido(String apellido) {
        if(apellido != null){
            this.apellido = apellido;
        }
    }
    
    public void setNombreyApellido(String nombre,String apellido) {
        if(nombre != null && apellido != null){
        this.nombre = nombre;
        this.apellido = apellido;
        }
    }
}