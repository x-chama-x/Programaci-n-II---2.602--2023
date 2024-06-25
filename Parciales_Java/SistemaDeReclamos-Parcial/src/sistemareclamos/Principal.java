package sistemareclamos;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {

        // Crear un sistema de reclamos
        SistemaDeReclamos sistema = new SistemaDeReclamos();

        // Crear un reclamo con una infracción de exceso de velocidad
        ExcesoVelocidad excesoVelocidad = new ExcesoVelocidad(LocalDate.now());
        Reclamo reclamo = new Reclamo("1234567 ", excesoVelocidad);

        // Crear un reclamo con una infracción de mal estacionamiento
        MalEstacionamiento malEstacionamiento = new MalEstacionamiento(LocalDate.now());
        Reclamo reclamo2 = new Reclamo("7654321", malEstacionamiento);

        // Crear un reclamo de hace más de 1 año
        MalEstacionamiento MalEstacionamiento2 = new MalEstacionamiento(LocalDate.now().minusYears(2));
        Reclamo reclamo3 = new Reclamo("1234567", MalEstacionamiento2);

        // Agregar los reclamos al sistema
        sistema.agregarReclamo(reclamo);
        sistema.agregarReclamo(reclamo2);
        sistema.agregarReclamo(reclamo3);

        // probar metodos del sistema de reclamos
        System.out.println("Importe total de reclamos: " + sistema.calcularImporteTotal());
        System.out.println("Cantidad de reclamos caducados: " + sistema.contarReclamosCaducados()); // devuelve 1 solo, está bien
    }

}