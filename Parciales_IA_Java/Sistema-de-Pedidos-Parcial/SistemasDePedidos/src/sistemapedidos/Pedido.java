package sistemapedidos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Pedido implements CostoCalculable {

    private ArrayList<Producto> productos; 

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public double getSumaPrecioProductos(ArrayList<Producto> productos){
        double suma=0;
        for (Producto p: productos){
            suma=suma + p.getPrecio();
        }
        return suma;
    }
}