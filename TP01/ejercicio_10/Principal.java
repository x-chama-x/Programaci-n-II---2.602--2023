/*
Refactoreá la clase CuentaBancaria del ejercicio 3), agregando el atributo titular, que
representa a la persona titular de la cuenta, y el atributo fechaDeApertura.
 */
package ejercicio_10;

import java.time.LocalDate;
public class Principal {

    public static void main(String[] args) {
       
        //se crea una cuenta bancaria de tipo "Cuenta corriente", con titular "Francisco" y fecha de apertura la fecha actual.
        CuentaBancaria cb = new CuentaBancaria("Cuenta corriente","Francisco",LocalDate.now());
        cb.mostrarDatos();
       
    }   
}
