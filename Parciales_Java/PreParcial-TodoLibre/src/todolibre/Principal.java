package todolibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        TodoLibre tl = new TodoLibre();
        
        Domicilio d1 = new Domicilio("Obligado",1700,13);
        Domicilio d2 = new Domicilio("Saavedra",2345,13);
        Domicilio d3 = new Domicilio("Ortugazar",5612,23);
        Domicilio d4 = new Domicilio("Calle Mayor", 789, 10);
        Domicilio d5 = new Domicilio("Avenida Libertad", 246, 15);
        Domicilio d6 = new Domicilio("Calle Principal", 135, 20);
        Domicilio d7 = new Domicilio("Avenida Central", 567, 8);
        Domicilio d8 = new Domicilio("Calle Secundaria", 987, 12);
        
        Usuario u1 = new Usuario("719284","Francisco","Chiminelli", "franciscofchiminelli@hotmail.com",d1);
        Usuario u2 = new Usuario("123456", "Juan", "Pérez", "juanperez@example.com", d2);
        Usuario u3 = new Usuario("987654", "María", "González", "mariagonzalez@example.com", d3);
        Usuario u4 = new Usuario("567890", "Luis", "Gómez", "luisgomez@example.com", d4);
        Usuario u5 = new Usuario("246813", "Ana", "Sánchez", "anasanchez@example.com", d5);
        Usuario u6 = new Usuario("135792", "Pedro", "Rodríguez", "pedrorodriguez@example.com", d6);
        Usuario u7 = new Usuario("314159", "Laura", "López", "lauralopez@example.com", d7);
        Usuario u8 = new Usuario("271828", "Sofía", "Martínez", "sofiamartinez@example.com", d8);
        
        OrdenPuertaAPuerta o1 = new OrdenPuertaAPuerta(false,1,548,u1,u2);
        OrdenPuertaAPuerta o2 = new OrdenPuertaAPuerta(true,1,548,u2,u3);
        
        tl.agregarOrden(o1);
        tl.agregarOrden(o2);
        
        // se prueba el método porcentajeMismaComuna() (punto A)
        // si tira 50%, funciona
        System.out.println("el porcentaje es: " + tl.porcentajeMismaComuna() + "%");
        
        // se prueba el método cantidadEnvioGratis() (punto B)
        // cantidad 1 = funciona
        System.out.println("cantidad de envios gratis: " + tl.cantidadEnvioGratis());
        
    }

}