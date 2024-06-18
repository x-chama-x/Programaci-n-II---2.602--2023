package sistemapedidos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PedidoEstandar extends Pedido {

    @Override
    public double calcularCostoTotal() {
        return calcularCostoEnvio() + getSumaPrecioProductos(getProductos());
    }

    private double calcularCostoEnvio() {
        int cantProductos = contadorDeProductos(getProductos());
        double costoEnvio =0.0;
        if (cantProductos<5){
            costoEnvio=100.0;
        }else if (cantProductos > 5 && cantProductos <= 10 ){
            costoEnvio=300.0;
        }
        return costoEnvio;
    }
    
    public int contadorDeProductos(ArrayList<Producto> productos){
        int cont=0;
        for(Producto p: productos){
            cont++;
        }
        return cont;
    }

}