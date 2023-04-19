/*
1. Modelá la clase Persona, la cual posea como atributos nombre, apellido y año de nacimiento.
Luego, implementá métodos que permitan:

▪ Devolver el nombre completo de la persona.
▪ Mostrar su estado en la consola.
▪ Obtener su edad actual.
▪ Saber si es mayor que una edad dada.
▪ Cambiar su nombre.
▪ Cambiar su apellido.
▪ Cambiar su nombre y su apellido.

Finalmente, instanciá una persona en el método main y probá todos sus métodos.

*/
package ejercicio_01;

public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona();
        
        // El método hashCode() devuelve un int que representa la referencia del objeto
         System.out.println("Probando el objeto " + p.hashCode());
        
        p.nombre = "Francisco";
        p.apellido = "Chiminelli";
        p.anioDeNacimiento = 2001;
        
        p.mostrarEstado(); // muestro el estado actual
        
        // pruebo si es mayor a 21 años
        System.out.print("¿Es mayor de 21? ");        
        System.out.println(p.esMayorQue(21));
        
        // modifico el nombre y el apellido
        // muestro por pantalla el nuevo estado
        p.setNombre("Juan");
        p.setApellido("Lopez");
        p.mostrarEstado();
    } 
}
