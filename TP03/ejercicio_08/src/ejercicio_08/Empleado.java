package ejercicio_08;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int anoIngreso;

    public abstract double getSalario(); // basicamente un getter abstracto

    public Empleado(String DNI, String nombre, String apellido, int anoIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anoIngreso = anoIngreso;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}