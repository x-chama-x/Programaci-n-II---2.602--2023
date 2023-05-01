package ejercicio_13;
public class Principal {
    //PUNTO B
    public static void main(String[] args) {
        Posnet posnet = new Posnet(); // se genera un objeto posnet (para pedirle que efectue un pago)
        Persona p = new Persona("40545665","Pepe","Gomez","1112345678","pepe@fakemail.com"); // persona que será titular de la tarjeta de credito
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank","1234567890123456",15000,p,EntidadFinanciera.VISA);
        
        // mostrar la trajeta antes de efectuar pago
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        // mostrar la trajeta tras pagar
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t,10000,5);
        System.out.println(ticketGenerado); // verificar si ese ticket es un ticket o null (si el pago no se pudo procesar)
        
        // mostrar la trajeta despues del pago
        System.out.println("Tarjeta despues del pago"); // se comprueba la modificacion del valor del saldo
        System.out.println(t);
    }
}
