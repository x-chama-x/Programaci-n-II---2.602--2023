package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class OrdenPuertaAPuerta extends OrdenDeCompra {

    private boolean envioGratis;

    public OrdenPuertaAPuerta(boolean envioGratis, int numero, double monto, Usuario comprador, Usuario vendedor) {
        super(numero, monto, comprador, vendedor);
        this.envioGratis = envioGratis;
    }

    public boolean isEnvioGratis() {
        return envioGratis;
    }

    @Override
    public Domicilio getDomicilioDestino() {
        return getComprador().getDomicilio();
    }

    @Override
    public int getComunaDestino() {
        return getComprador().getDomicilio().getComuna();
    }
}