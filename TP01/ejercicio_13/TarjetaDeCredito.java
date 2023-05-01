package ejercicio_13;
class TarjetaDeCredito {
    //atributos "primitivos"
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    //atributos donde el tipo de dato es una clase
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }

    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
}