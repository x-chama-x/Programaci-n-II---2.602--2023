package ejercicio_11;

import java.util.Random;
import java.time.LocalDate;

public class CuentaBancaria {
    private String CBU;
    private double saldo;
    private String titular;
    private TipoCuenta tipoCuenta;
    private final LocalDate fechaDeApertura;
    

//CONSTRUCTOR
    public CuentaBancaria(TipoCuenta tipo, String titular, LocalDate fecha) {
            this.CBU=generarCBU();
            this.saldo=0;
            this.tipoCuenta=tipo;
            this.titular = titular;
            this.fechaDeApertura = fecha;
        }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    private String generarCBU() {
        Random r = new Random();
        String elCbu = "";
        for (int i = 0; i < 22; i++) {
            elCbu += r.nextInt(10);
        }
        return elCbu;        
    }
    public double getSaldoActual() {
        return saldo;
    }    

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void establecerCBU(String nuevoCBU){
        if(nuevoCBU!=null){
            CBU=nuevoCBU;
        }        
    }
    public void depositar(double monto){
        if(monto > 0){
            saldo = saldo + monto; // saldo += monto
        }
    }
    
    private boolean saldoDisponible(double monto){
        return saldo >= monto;
    }
    
    public void extraer(double monto){
        if(saldoDisponible(monto)||tipoCuenta.equals("Cuenta corriente")){
            saldo = saldo - monto; //saldo -= monto
        }       
    }
    public void getUltimosCBU(int cuantos){
        String ultimos = CBU.substring(CBU.length() - cuantos);
        System.out.println("Últimos " + cuantos + " dígitos del CBU: " + ultimos);
    }
    
    public void mostrarDatos(){
        System.out.println(toString());
    }
    

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + ", titular=" + titular + ", fechaDeApertura=" + fechaDeApertura + '}';
    }
    
}
