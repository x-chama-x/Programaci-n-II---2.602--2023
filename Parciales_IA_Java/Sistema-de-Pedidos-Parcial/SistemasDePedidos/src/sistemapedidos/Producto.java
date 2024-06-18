package sistemapedidos;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Producto {

    public String nombre;
    public double precio;
    public int cantidadPedida;

    public Producto(String nombre, double precio, int cantidadPedida) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadPedida = cantidadPedida;
    }

    public double getPrecio() {
        return precio;
    }

}