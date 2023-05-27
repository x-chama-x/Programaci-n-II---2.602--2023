package ejercicio_08;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class GrupoDeEmpleados {

    private ArrayList<Empleado> empleados;

    public GrupoDeEmpleados() {
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void mostrarSalarios(){
        for(Empleado p: empleados){
            System.out.println(p.getNombreCompleto()+ " $" + p.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int cant=0;
        Empleado mayor=empleados.get(0); // Toma el primer elemento de la lista como valor inicial
        for(Empleado p: empleados){
            if(p instanceof EmpleadosAComision){
                if(((EmpleadosAComision) p).getnClientes()>cant){
                    cant=((EmpleadosAComision) p).getnClientes();
                    mayor=p;
                }
            }
        }
        return mayor;
    }
}