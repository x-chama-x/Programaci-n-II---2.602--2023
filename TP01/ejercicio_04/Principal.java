/*
Modelá la clase Fecha, la cual posea como atributos el día, el mes y el año. Luego, implementá
métodos que permitan:
▪ Obtener la fecha como cadena, en formato "dd/mm/aaaa".
▪ Saber si es Navidad.
▪ Sumar un mes.
Finalmente, instanciá una fecha en el método main y probá todos sus métodos.
 */
package ejercicio_04;

public class Principal {

    public static void main(String[] args) {
        Fecha date1 = new Fecha(21,8,2023);
        Fecha date2 = new Fecha(11,2,1986);
        Fecha date3 = new Fecha(4,12,1973);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println("¿Es Navidad?: " + date2.esNavidad()); 
        
        Boolean natal = date2.esNavidad(); 
        System.out.println("¿Es Navidad?: " + natal); 
        
        date3.sumarMes();
        System.out.println(date3);
    }
}
