package parcial2022;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // Crear áreas de prueba
        ArrayList<Double> temperaturas1 = new ArrayList<>();
        temperaturas1.add(-15.0);
        temperaturas1.add(-10.0);
        temperaturas1.add(-11.0);
        AreaGelida area1 = new AreaGelida(95.0, 100, 200, temperaturas1);
        
        ArrayList<Double> temperaturas2 = new ArrayList<>();
        temperaturas2.add(5.0);
        temperaturas2.add(16.0);
        temperaturas2.add(7.0);
        AreaDeTundraPolar area2 = new AreaDeTundraPolar(IntensidadViento.FUERTE, 50, 150, 300, temperaturas2);
        
        // Crear punto de control ( se hizo despues porque habia que crear al menos 1 area segun su constructor)
        ArrayList<Area> areas = new ArrayList<>();
        areas.add(area1);
        areas.add(area2);
        PuntoDeControl p = new PuntoDeControl(areas);
        
        // Agregar más áreas al punto de control
        ArrayList<Double> temperaturas3 = new ArrayList<>();
        temperaturas3.add(10.0);
        temperaturas3.add(8.0);
        temperaturas3.add(15.0);
        AreaDeTundra area3 = new AreaDeTundra(30, 120, 250, temperaturas3);
        p.agregarArea(area3);
        
        // Calcular la cantidad de áreas en peligro
        int cantAreasEnPeligro = p.cantAreasEnPeligro();
        System.out.println("Cantidad de áreas en peligro: " + cantAreasEnPeligro);
        // funciona, las 3 áreas puestas estan en peligro
        
        // mostrar la maxima temperaura registrada entre todas las areas de tundra
        double maxTempAreaTundraYPolar = p.tempMaxEnAreas();
        System.out.println("maxima temperaura registrada entre todas las areas de tundra: " + maxTempAreaTundraYPolar);
        // funciona
    }
}