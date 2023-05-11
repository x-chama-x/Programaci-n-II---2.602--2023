
package ejercicio_1;


public class Principal {

    public static void main(String[] args) {
        
        // genero los domicilios
        Domicilio d1 = new Domicilio("Thames", 123, "Malvinas Argentinas");
        Domicilio d2 = new Domicilio("Avenida Corrientes", 456, "Buenos Aires");
        Domicilio d3 = new Domicilio("Calle San Martín", 789, "Córdoba");
        Domicilio d4 = new Domicilio("Avenida Libertador", 1010, "Capital Federal");
        Domicilio d5 = new Domicilio("Calle 9 de Julio", 1111, "Rosario");
        Domicilio d6 = new Domicilio("Calle Mitre", 2222, "Mendoza");
        Domicilio d7 = new Domicilio("Avenida Santa Fe", 3333, "Salta");
        Domicilio d8 = new Domicilio("Calle Sarmiento", 4444, "Salta");

        // genero las personas
        Persona p1 = new Persona("83918512", "Lio", "Messi", d1);
        Persona p2 = new Persona("83918512", "Cristiano", "Ronaldo", d2);
        Persona p3 = new Persona("75934268", "Pedro", "Sánchez", d3);
        Persona p4 = new Persona("83657412", "Ana", "López", d4);
        Persona p5 = new Persona("98473823", "Luis", "García", d5);
        Persona p6 = new Persona("83746281", "Lucía", "Martínez", d6);
        Persona p7 = new Persona("94837562", "Jorge", "Fernández", d7);
        Persona p8 = new Persona("83569724", "Carla", "Pérez", d8);

        // genero la agenda
        Agenda agenda = new Agenda();
        
        // listo a las personas de la agenda (no hay nada)
        agenda.listarPersonas();
        System.out.println("");
        
        // agrego a 2 personas a la agenda con el mismo DNI
        // veo el estado (true/false)
        System.out.println(agenda.agregarPersona(p1));
        System.out.println(agenda.agregarPersona(p2)); // no lo va a agregar porque tiene = DNI que p1
        System.out.println("");
        
        
        
        // agrego a las demas personas a la agenda        
        agenda.agregarPersona(p3);
        agenda.agregarPersona(p4);
        agenda.agregarPersona(p5);
        agenda.agregarPersona(p6);
        agenda.agregarPersona(p7);
        agenda.agregarPersona(p8);
        
        // listo a las personas de la agenda
        System.out.println("personas agendadas:");
        agenda.listarPersonas();
        
        
        // pruebo funcion devolverUltimo
        System.out.println("");
        System.out.println(agenda.devolverUltimo() + "\n");
        
        // pruebo funcion buscarPersona
        System.out.println("");
        System.out.println(agenda.buscarPersona("98473823"));
        
        // pruebo funcion removerPersona
        // borro a Messi
        System.out.println("");
        System.out.println(agenda.removerPersona("83918512"));
        
        // veo si no esta mas en la lista
        System.out.println("");
        agenda.listarPersonas();
        
        //pruebo funcion modificarDomicilio
        // le cambio el domicilio a Luis Garcia
        System.out.println("");
        Domicilio d9 = new Domicilio("Paris",1030,"San German");
        agenda.modificarDomicilio("98473823", d9);
        // pruebo si se le cambio el domicilio
        System.out.println("");
        agenda.listarPersonas();
        
        //pruebo funcion obtenerPorBarrio
        // busco personas del barrio Salta
        System.out.println("");
        System.out.println(agenda.obtenerPorBarrio("Salta"));
        
        // pruebo funcion vaciar()
        agenda.vaciar();
        agenda.listarPersonas();
    }
    
}
