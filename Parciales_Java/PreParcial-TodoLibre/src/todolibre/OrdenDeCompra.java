package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class OrdenDeCompra implements Entregables {

    private int numero;
    private double monto;
    private Usuario comprador;
    private Usuario vendedor;

    public OrdenDeCompra(int numero, double monto, Usuario comprador, Usuario vendedor) {
        this.numero = numero;
        this.monto = monto;
        this.comprador = comprador;
        this.vendedor = vendedor;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public Usuario getVendedor() {
        return vendedor;
    }
    
    @Override
    public Domicilio getDomicilioOrigen() {
        return vendedor.getDomicilio();
    }
    
    // acá no creo el método abstracto porque el origen es el mismo para cada tipo de orden
    public int getComunaOrigen(){
        return vendedor.getDomicilio().getComuna();
    }
    
    // creo un método abtsracto ya que el destino es distinto para cada tipo de orden
    public abstract int getComunaDestino();
}