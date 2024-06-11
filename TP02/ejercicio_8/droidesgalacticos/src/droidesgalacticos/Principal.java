package droidesgalacticos;

public class Principal {

    public static void main(String[] args) {

        // Crear piezas
        Pieza p1 = new Pieza("bateria de litio");
        Pieza p2 = new Pieza("sensor de proximidad");
        Pieza p3 = new Pieza("antena de comunicacion");

        // Crear droides
        Droide d1 = new Droide("D1", false); // Droide en funcionamiento
        Droide d2 = new Droide("D2", true); // Droide fuera de servicio
        Droide d3 = new Droide("D3", true); // Droide fuera de servicio


        // Añadir piezas al droide en funcionamiento
        d1.añadirPiezaOperativa(p1);
        d1.añaadirPiezaNoOperativa(p2); // Pieza no operativa que sera reemplazada
        d1.añadirPiezaOperativa(p3);

        // añaadir piezas a los droides fuera de servicio
        d2.añadirPiezaOperativa(p1);
        d2.añadirPiezaOperativa(p2);
        d3.añadirPiezaOperativa(p1);
        d3.añadirPiezaOperativa(p2);

        // Registrar droides fuera de servicio
        d1.registrarDroide(d2);
        d1.registrarDroide(d3);

        // Listar piezas del droide en funcionamiento
        //d1.listarPiezas();

        // Autoreparar droide
        EstadoReparacion estadoReparacion = d1.autorepararse();
        System.out.println("Estado de reparacion: " + estadoReparacion); // completamente operativo, funciona
    }
}