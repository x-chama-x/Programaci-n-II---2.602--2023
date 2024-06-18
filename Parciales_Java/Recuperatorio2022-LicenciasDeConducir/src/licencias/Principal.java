package licencias;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // Creación de objetos de la clase Auto
        Auto auto1 = new Auto(4, "ABC123", "Toyota", 2000);
        Auto auto2 = new Auto(2, "DEF456", "Honda", 1500);

        // Creación de objetos de la clase Circuito para los exámenes de auto
        Circuito circuitoAuto1 = new Circuito(80, 1); // aprobado
        Circuito circuitoAuto2 = new Circuito(95, 0); // reprobado
        Circuito circuitoAuto3 = new Circuito(85, 2); // aprobado

        // Creación de objetos de la clase ExamenAuto
        ExamenAuto examenAuto1 = new ExamenAuto(circuitoAuto1, auto1, "2022-01-01", new Persona("11111111", "Juan", "Pérez"));
        
        
        ExamenAuto examenAuto2 = new ExamenAuto(circuitoAuto2, auto2, "2022-02-01", new Persona("22222222", "María", "Gómez"));
        
        ExamenAuto examenAuto3 = new ExamenAuto(circuitoAuto3, auto2, "2022-03-01", new Persona("22222222", "María", "Gómez"));

        // Creación de objeto de la clase LicenciasDeConducir
        LicenciasDeConducir licenciasDeConducir = new LicenciasDeConducir();

        // Agregar los exámenes de auto al objeto LicenciasDeConducir
        licenciasDeConducir.agregarExamen(examenAuto1);
        licenciasDeConducir.agregarExamen(examenAuto2);
        licenciasDeConducir.agregarExamen(examenAuto3);

        // Creación de objetos de la clase Moto
        Moto moto1 = new Moto(true, "GHI789", "Yamaha", 250);
        Moto moto2 = new Moto(false, "JKL012", "Suzuki", 125);

        // Creación de objetos de la clase Circuito para los exámenes de moto
        Circuito circuitoMoto1 = new Circuito(75, 0);
        Circuito circuitoMoto2 = new Circuito(90, 1);
        Circuito circuitoMoto3 = new Circuito(80, 2);
        Circuito circuitoMoto4 = new Circuito(85, 6);
        Circuito circuitoMoto5 = new Circuito(95, 0);

        // Creación de objeto de la clase ExamenMoto
        ExamenMoto examenMoto1 = new ExamenMoto(new ArrayList<>(), moto1, "2022-04-01", new Persona("33333333", "Carlos", "López"));

        // Agregar los circuitos de moto al objeto ExamenMoto
        examenMoto1.agregarCircuito(circuitoMoto1);
        examenMoto1.agregarCircuito(circuitoMoto2);
        examenMoto1.agregarCircuito(circuitoMoto3);

        // Creación de objeto de la clase ExamenMoto
        ExamenMoto examenMoto2 = new ExamenMoto(new ArrayList<>(), moto2, "2022-05-01", new Persona("44444444", "Laura", "Rodríguez"));

        // Agregar los circuitos de moto al objeto ExamenMoto
        examenMoto2.agregarCircuito(circuitoMoto4); // aprobada
        examenMoto2.agregarCircuito(circuitoMoto5); // reprobado

        // Agregar los exámenes de moto al objeto LicenciasDeConducir
        licenciasDeConducir.agregarExamen(examenMoto1);
        licenciasDeConducir.agregarExamen(examenMoto2);
        
        // Obtener el informe, se imprime directamente por ese método para comprobar resultados
        licenciasDeConducir.obtenerInforme();
        
    }

} 