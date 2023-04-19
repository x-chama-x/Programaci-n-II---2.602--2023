/*
Desarrollar la clase Empleado, cuyos atributos sean su DNI, nombre, apellido, salario base,
estado civil (soltero, casado, divorciado o viudo) y cantidad de hijos.
Se sabe que todos los empleados cobran el salario base más un plus del 3% de éste 
por cada hijo, con un tope de hasta 10%. Del salario resultante debe descontarse 
un 4% en caso de que el estado civil sea soltero.
Desarrollar el método obtenerSalarioFinal() que retorne 
el valor del salario del empleado
según las reglas enunciadas.
 */
package ejercicio_02;

public class Principal {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(1234,"Francisco","Chiminelli",50,"soltero",10);
        System.out.println(empleado);
        System.out.println("salario final: " + empleado.obtenerSalarioFinal());
    } 
}
