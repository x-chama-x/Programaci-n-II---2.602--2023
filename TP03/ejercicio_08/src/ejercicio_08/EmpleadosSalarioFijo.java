package ejercicio_08;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EmpleadosSalarioFijo extends Empleado {

    private int anosEmpresa;

    public EmpleadosSalarioFijo(String DNI, String nombre, String apellido, int anoIngreso) {
        super(DNI, nombre, apellido, anoIngreso);
        this.anosEmpresa = 2023-anoIngreso; // supongo el año en el creo este programa
    }

    public double getSalario() {
        double sueldo=20000;
        if(anosEmpresa>2 && anosEmpresa<5){
            sueldo = sueldo + sueldo* 0.05;
        }else if(anosEmpresa>6 && anosEmpresa<10){
            sueldo = sueldo + sueldo* 0.10;
        }else if(anosEmpresa>10){
            sueldo=sueldo + sueldo* 0.15;
        }
        return sueldo;
    }
}