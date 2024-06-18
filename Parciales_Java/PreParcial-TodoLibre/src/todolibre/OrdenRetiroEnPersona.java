package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class OrdenRetiroEnPersona extends OrdenDeCompra {

    private SucursalCorreo sucursalCorreo;

    public OrdenRetiroEnPersona(SucursalCorreo sucursalCorreo, int numero, double monto, Usuario comprador, Usuario vendedor) {
        super(numero, monto, comprador, vendedor);
        this.sucursalCorreo = sucursalCorreo;
    }

    @Override
    public Domicilio getDomicilioDestino() {
        return sucursalCorreo.getDomicilio();
    }

    @Override
    public int getComunaDestino() {
        return sucursalCorreo.getDomicilio().getComuna();
    }
}