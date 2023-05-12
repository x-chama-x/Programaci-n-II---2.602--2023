
package ejercicio_2;


public class Principal {

    public static void main(String[] args) {
        
        // instancio la Inmobiliaria
        Inmobiliaria i = new Inmobiliaria();

        //creo algunas propiedades
        Propiedad p1 = new Propiedad("Arcos",50.500,Tipo.DEPTO);
        Propiedad p2 = new Propiedad("Juramento", 350000.00, Tipo.CASA);
        Propiedad p3 = new Propiedad("Cabildo", 250000.00, Tipo.PH);
        Propiedad p4 = new Propiedad("Monroe", 95000.00, Tipo.DEPTO);
        Propiedad p5 = new Propiedad("Blanco Encalada", 220000.00, Tipo.CASA);
        
        // agrego las propiedades a la lista de objetos
        i.agregarPropiedad(p1);
        i.agregarPropiedad(p2);
        i.agregarPropiedad(p3);
        i.agregarPropiedad(p4);
        i.agregarPropiedad(p5);
        
        // pruebo metodo promedioDePrecio() (tiene q dar 183010.20)
        System.out.println(i.promedioDePrecio());
        
        // pruebo metodo propiedadesMasEconomicas()
        i.listarPropiedadesMasEconomicas();
        
        // pruebo metodo cantidadDePropiedadesSegunTipo(Tipo tipo)
        System.out.println(i.cantidadDePropiedadesSegunTipo(Tipo.PH));
    }
}
