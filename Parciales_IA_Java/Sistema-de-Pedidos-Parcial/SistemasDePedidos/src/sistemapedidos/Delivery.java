package sistemapedidos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Delivery {

    private ArrayList<Pedido> pedidos;

    public Delivery() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }
}