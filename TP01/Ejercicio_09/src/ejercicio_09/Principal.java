/*
Refactoreá la clase Persona del ejercicio 1), cambiando el año de nacimiento por su fecha de
nacimiento y agregando el atributo domicilio, que contenga calle, altura y barrio.
*/
package ejercicio_09;

public class Principal {

    public static void main(String[] args) {
        Domicilio dom = new Domicilio("Arcos",2702,"Belgrano");
        Persona p = new Persona("Francisco","Chiminelli",2001,dom);
        p.mostrarEstado();
    } 
}
