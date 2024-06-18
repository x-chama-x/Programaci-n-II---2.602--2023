package sistemapedidos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PedidoExpress extends Pedido {

    private final double COSTO_ENVIO_FIJO = 500;

    public PedidoExpress() {
    }

    @Override
    public double calcularCostoTotal() { 
        return COSTO_ENVIO_FIJO + getSumaPrecioProductos(getProductos());
    }

}