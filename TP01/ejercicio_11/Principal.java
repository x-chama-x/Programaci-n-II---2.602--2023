/*
Utilizando las clases generadas hasta ahora, codificá en Java la siguiente situación:

Una cuenta bancaria de tipo caja de ahorros le pertenece a Fulano Gomez, nacido
el 16/04/1990 y otra de tipo cuenta corriente le pertenece a Mengana Torres,
nacida el 23/11/1991. Ambos están casados y viven juntos en Av. Triunvirato
3174, Villa Ortúzar.

Supongamos que Fulano y Mengana se mudan a nuevo hogar: ¿Hay que cambiar el domicilio de
cada uno o basta con cambiar uno de los dos?
 */
package ejercicio_11;

import java.time.LocalDate;
public class Principal {


    public static void main(String[] args) {
        // Crear Personas
        Domicilio domP1 = new Domicilio("Av. Triunvirato",3174,"Villa Ortúzar");
        Domicilio domP2 = new Domicilio("Av. Triunvirato",3174,"Villa Ortúzar");
        Persona P1 = new Persona("Fulano","Gomez",LocalDate.of(1990, 04, 16),domP1);
        Persona P2 = new Persona("Mengana","Torres",LocalDate.of(1991, 11, 23),domP2);
        
        // Crear Cuentas Bancarias
        CuentaBancaria cbP1 = new CuentaBancaria(TipoCuenta.CUENTA_AHORRO,P1.getNombreCompleto(),LocalDate.now());
        CuentaBancaria cbP2 = new CuentaBancaria(TipoCuenta.CUENTA_CORRIENTE,P2.getNombreCompleto(),LocalDate.now());
        
        //mostrar Datos
        P1.mostrarEstado();
        cbP1.mostrarDatos();
        P2.mostrarEstado();
        cbP2.mostrarDatos();
    }  
}
