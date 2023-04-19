package ejercicio_02;

public class Empleado {
    private int DNI;
    private String nombre,apellido;
    private double salarioBase;
    private String estadoCivil;
    private int cantHijos;

    public Empleado(int DNI, String nombre, String apellido, double salarioBase, String estadoCivil, int cantHijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        this.cantHijos = cantHijos;
    }
    
    public double plusHijo(){
        double plusHijo = cantHijos*0.03; // 3% por cada hijo
        if(plusHijo>0.1){
            plusHijo=0.1; // tope del 10%
        }
        return plusHijo;
    }
    
    public double obtenerSalarioFinal(){

        double salarioFinal=salarioBase+plusHijo();
        
        if(estadoCivil.equals("soltero")){
            salarioFinal = salarioBase - (salarioBase * 0.04); // descuento del 4%
        }
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadoCivil=" + estadoCivil + ", cantHijos=" + cantHijos + '}';
    }    
}
