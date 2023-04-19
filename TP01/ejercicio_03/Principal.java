/*
3. Modelá la clase CuentaBancaria, la cual posea como atributos la clave bancaria uniforme (CBU),
el tipo (caja de ahorro o cuenta corriente) y el saldo (inicialmente en 0). Luego, implementá métodos que permitan:
    - Obtener el saldo actual.
    - Depositar dinero en la cuenta (actualizando el saldo).
    - Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en saldo negativo si  es cuenta corriente.
    - Obtener los últimos 3 dígitos del CBU.
 */
package ejercicio_03;

public class Principal {

    public static void main(String[] args) {
       CuentaBancaria cb = new CuentaBancaria("Cuenta corriente");
       System.out.println("saldo anterior: $" + cb.getSaldoActual()); 
       cb.depositar(500);
       System.out.println("saldo actual: $" + cb.getSaldoActual());
       cb.extraer(600);
       System.out.println("saldo despues de la extraccion: $" + cb.getSaldoActual());
       cb.getUltimosCBU(3);
       
    }   
}
