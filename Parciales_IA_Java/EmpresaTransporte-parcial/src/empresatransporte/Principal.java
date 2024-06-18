package empresatransporte;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // Crear instancias de mercancías 
        Mercancia m1 = new Mercancia("Producto 1", 100.0, false);
        Mercancia m2 = new Mercancia("Producto 2", 200.0, false);
        Mercancia m3 = new Mercancia("Producto 3", 150.0, false);
        Mercancia m4 = new Mercancia("Producto 4", 300.0, true);
        Mercancia m5 = new Mercancia("Producto 5", 250.0, false);
        Mercancia m6 = new Mercancia("Producto 6", 120.0, false);
        Mercancia m7 = new Mercancia("Producto 7", 180.0, true);
        Mercancia m8 = new Mercancia("Producto 8", 220.0, false);
        Mercancia m9 = new Mercancia("Producto 9", 270.0, false);
        Mercancia m10 = new Mercancia("Producto 10", 190.0, false);
        

        // Crear instancias de pasajeros
        Pasajero p1 = new Pasajero("John Doe", "123456789", false);
        Pasajero p2 = new Pasajero("Jane Smith", "987654321", true);
        Pasajero p3 = new Pasajero("Alice Johnson", "456789123", false);

        // Crear instancias de vehículos
        DeCarga v1 = new DeCarga(600.0, "ABC123", "Marca1", "Modelo1");
        DeCarga v2 = new DeCarga(3000.0, "DEF456", "Marca2", "Modelo2");
        DePasajeros v3 = new DePasajeros(2, "GHI789", "Marca3", "Modelo3");
        DePasajeros v4 = new DePasajeros(30, "JKL012", "Marca4", "Modelo4");
        
        // Asignar mercancías a vehículos de carga
        v1.asignarCarga(m1); v1.asignarCarga(m2); v1.asignarCarga(m3);v1.asignarCarga(m4);
        v2.asignarCarga(m5);v2.asignarCarga(m6);v2.asignarCarga(m7);v2.asignarCarga(m8);
        
        // Asignar pasajeros a vehiculos de pasajeros
        v3.asignarCarga(p1);
        v3.asignarCarga(p2);
        v3.asignarCarga(p3); // no lo asigna ya que solo tiene capacidad de 2 pasajeros
        
        // Crear una instancia de Empresa
        Empresa e = new Empresa();
        e.agregarVehiculo(v1);e.agregarVehiculo(v2);e.agregarVehiculo(v3);e.agregarVehiculo(v4);
        
        // probar métodos
        
        //v1.mostrarManifiesto(); // funciona, muestra que v1 transporta 3 mercancias con un peso total de 450
        
        //v3.mostrarManifiesto(); // funciona, muestra 2 pasajeros que es hasta lo que puede transportar v3
        
        //e.mostrarListado(); // funciona (muestra solo el de la placa DEF456 que es el único vehiculo con mercadería peligrosa
        
        System.out.println(e.obtenerInforme()); 
        // funciona, muestra el total de personas trasladadas (2) y el peso total transportado (1220)
    }

}