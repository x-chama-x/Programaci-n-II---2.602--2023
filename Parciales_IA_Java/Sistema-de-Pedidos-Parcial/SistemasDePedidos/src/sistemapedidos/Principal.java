package sistemapedidos;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        Producto p1 = new Producto("xiaomi redmi note 8 pro",300.0,1);
        Producto p2 = new Producto("televisor samsung led 56",1000.0,2);
        Producto p3 = new Producto("impresora HP serie C",700.0,3);
        
        Delivery d = new Delivery();
        
        // Crear un Pedido Express y agregar los 3 productos
        PedidoExpress pExp = new PedidoExpress();
        pExp.agregarProducto(p1); pExp.agregarProducto(p2); pExp.agregarProducto(p3);
        
        
        // c) Crear un Pedido Estandar y agregar los 3 productos
        PedidoEstandar pEst = new PedidoEstandar();
        pEst.agregarProducto(p1); pEst.agregarProducto(p2); pEst.agregarProducto(p3);
        
        // d) Mostrar el costo total de cada pedido
        System.out.println("Costo total del Pedido Express: $" + pExp.calcularCostoTotal()); // funciona $2500
        System.out.println("Costo total del Pedido Estandar: $" + pEst.calcularCostoTotal()); // funciona $2100
    }

}