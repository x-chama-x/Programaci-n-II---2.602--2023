package ejercicio_08;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EmpleadosAComision extends Empleado {
    private int nClientes;
    private double monto;

    public EmpleadosAComision(int nClientes, double monto, String DNI, String nombre, String apellido, int anoIngreso) {
        super(DNI, nombre, apellido, anoIngreso);
        this.nClientes = nClientes;
        this.monto = monto;
    }

    public int getnClientes() {
        return nClientes;
    }

    @Override
    public double getSalario() {
        double sueldo=nClientes*monto;
        if(sueldo<20000.0){
            sueldo=20000;
            return sueldo;
        }else{
            return sueldo;
        }
    }
    
}