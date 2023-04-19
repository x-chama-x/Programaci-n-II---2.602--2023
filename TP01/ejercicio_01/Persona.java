package ejercicio_01;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public boolean tieneHijos;

   public Persona(String nombre,String apellido, int edad, boolean tieneHijos){
       this.nombre=nombre;
       this.apellido=apellido;
       this.edad=edad;
       this.tieneHijos=tieneHijos;
   } 
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean tieneHijos() {
        return tieneHijos;
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
    }
    

}