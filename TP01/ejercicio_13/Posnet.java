package ejercicio_13;
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    //atributos de clase --> estáticos
    // final --> son constantes
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas ){
        Ticket elTicket = null;
        // se analiza que los datos sean validos, si no son validos, devuelve null
        if(datosValidos(tarjeta,montoAAbonar,cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar*recargaoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe= tarjeta.nombreCompletoDeTitular();
                double montoPorCuota=montoFinal/cantCuotas;
                elTicket= new Ticket(nomApe,montoFinal,montoPorCuota);
            }
            
        }
        return elTicket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta,double monto,int cant){
        boolean esTarjetaValida = tarjeta != null; // una expresion booleana puede ser guardada de esta manera
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        return esTarjetaValida && esMontoValido && cantCuotasValidas ;
    }
    
    private double recargaoSegunCuotas(int cantCuotas){
        return (cantCuotas-1)*RECARGO_POR_CUOTA; 
    }
}
