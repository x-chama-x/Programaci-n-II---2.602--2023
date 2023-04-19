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
        Persona per1 = new Persona("Fulano","Gomez",25,false);
        Persona per2 = new Persona("Maria","Perez",28,false);
        Persona per3 = new Persona("Sultano","Rodriguez",33,true);
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
    } 
    
}
