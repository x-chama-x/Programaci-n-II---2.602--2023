package ejercicio_08;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // instancio empleados a comision
        EmpleadosAComision e1 = new EmpleadosAComision(100,500,"43546765","Alberto","Saretti",2005); //n clientes, monto por cliente, atributos heredados
        EmpleadosAComision e2 = new EmpleadosAComision(100,150,"43567812","Carlos","Aguirre",2001);
        // instancio empleados a Salario Fijo
        EmpleadosSalarioFijo e3 = new EmpleadosSalarioFijo("43567812","Carlos","Aguirre",2001);
        EmpleadosSalarioFijo e4 = new EmpleadosSalarioFijo("43456213","Samid","Lopez",2022);
        
        // añado empleados a la lista de empleados
        GrupoDeEmpleados grupo = new GrupoDeEmpleados();
        grupo.agregarEmpleado(e1);
        grupo.agregarEmpleado(e2);
        grupo.agregarEmpleado(e3);
        grupo.agregarEmpleado(e4);
        
        //pruebo metodo mostrarSalarios()
        grupo.mostrarSalarios();
        
        //pruebo metodo empleadoConMasClientes()
        System.out.println(grupo.empleadoConMasClientes());
    }
}