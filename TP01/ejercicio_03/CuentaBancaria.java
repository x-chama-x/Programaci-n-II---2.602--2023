package ejercicio_03;

import java.util.Random;

public class CuentaBancaria {
    private String CBU;
    private double saldo;
    private String tipoCuenta;
    

//CONSTRUCTOR
    public CuentaBancaria(String tipo) {
            this.CBU=generarCBU();
            this.saldo=0;
            this.tipoCuenta=tipo;
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

    public void setTipo(String tipo) {
        if(tipo != null){
           this.tipoCuenta = tipo; 
        } 
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
}
