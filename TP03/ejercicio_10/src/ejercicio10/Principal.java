package ejercicio10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // Crear una instancia de Sophie
        Sophie sophie = new Sophie(); 
        
        // creo métodos para las fuentes de programacion
        Metodo m1 = new Metodo("metodo 1",1, 3, 2);
        Metodo m2 = new Metodo("metodo 2", 4, 5, 6);
        Metodo m3 = new Metodo("metodo 3", 7, 8, 9);
        Metodo m4 = new Metodo("metodo 4", 10, 20, 30);
        Metodo m5 = new Metodo("metodo 5", 100, 200, 300);
        Metodo m6 = new Metodo("metodo 6", 5, 10, 15);
        Metodo m7 = new Metodo("metodo 7", 2, 4, 6);
        Metodo m8 = new Metodo("metodo 8", 15, 25, 35);
        Metodo m9 = new Metodo("metodo 9", 8, 16, 24);
        Metodo m10 = new Metodo("metodo 10", 50, 75, 100);
        Metodo m11 = new Metodo("metodo 11", 12, 18, 24);
        Metodo m12 = new Metodo("metodo 12", 200, 300, 400);
        Metodo m13 = new Metodo("metodo 13", 5, 10, 15);
        Metodo m14 = new Metodo("metodo 14", 30, 40, 50);
        Metodo m15 = new Metodo("metodo 15", 7, 14, 21);
        Metodo m16 = new Metodo("metodo 16", 80, 160, 240);
        Metodo m17 = new Metodo("metodo 17", 3, 6, 9);
        Metodo m18 = new Metodo("metodo 18", 55, 110, 165);
        Metodo m19 = new Metodo("metodo 19", 9, 18, 27);
        Metodo m20 = new Metodo("metodo 20", 70, 140, 210);
        Metodo m21 = new Metodo("metodo 21", 25, 50, 75);
        Metodo m22 = new Metodo("metodo 22", 150, 225, 300);

             
        // Creo una instancia de Programa 1
        Programa p1 = new Programa("1", "Programa 1", "Responsable 1", true);
        // instancio un par de fuentes para p1
        DeMercado f1 = new DeMercado(200, "fuente1.html", "/path/ubicacion1");
        DeMercado f2 = new DeMercado(760, "fuente2.XML", "/path/ubicacion2");
        DeProgramacion f3 = new DeProgramacion("fuente3.c", "/path/ubicacion3");
        // agrego las fuentes al p1
        p1.agregarFuente(f1);p1.agregarFuente(f2);p1.agregarFuente(f3);
        //agrego metodos a f3
        f3.agregarMetodo(m1);
        f3.agregarMetodo(m2);f3.agregarMetodo(m3);
        f3.agregarMetodo(m4);f3.agregarMetodo(m5);f3.agregarMetodo(m6);
        
        // repito estos pasos un par de veces para otros programas
        
        // programa  2
        Programa p2 = new Programa("2", "Programa 2", "Responsable 2", false);
        DeMercado f4 = new DeMercado(230, "fuente4.XML", "/path/ubicacion4");
        DeProgramacion f5 = new DeProgramacion("fuente5.c", "/path/ubicacion5");
        DeProgramacion f6 = new DeProgramacion("fuente6.java", "/path/ubicacion6");
        DeMercado f7 = new DeMercado(456, "fuente7.XML", "/path/ubicacion7");
        p2.agregarFuente(f4);p2.agregarFuente(f5);p2.agregarFuente(f6);p2.agregarFuente(f7);
        f5.agregarMetodo(m7);f5.agregarMetodo(m8);f5.agregarMetodo(m9);
        f6.agregarMetodo(m10);f6.agregarMetodo(m11);f6.agregarMetodo(m12);
        
        // programa  3
        Programa p3 = new Programa("3", "Programa 3", "Responsable 3", true);
        DeProgramacion f8 = new DeProgramacion("fuente8.c", "/path/ubicacion8");
        DeMercado f9 = new DeMercado(300, "fuente9.html", "/path/ubicacion9");
        DeMercado f10 = new DeMercado(620, "fuente10.XML", "/path/ubicacion10");
        p3.agregarFuente(f8);p3.agregarFuente(f9);p3.agregarFuente(f10);
        f8.agregarMetodo(m13);f8.agregarMetodo(m14);f8.agregarMetodo(m15);
        f8.agregarMetodo(m16);
        
        // programa  4
        Programa p4 = new Programa("4", "Programa 4", "Responsable 4", false);
        DeProgramacion f11 = new DeProgramacion("fuente11.c", "/path/ubicacion11");
        DeProgramacion f12 = new DeProgramacion("fuente12.java", "/path/ubicacion12");
        p4.agregarFuente(f11);p4.agregarFuente(f12);
        f11.agregarMetodo(m17);f11.agregarMetodo(m18);
        f12.agregarMetodo(m19);f12.agregarMetodo(m20);f12.agregarMetodo(m21);
        f12.agregarMetodo(m22);
        
        
        // agrego los programas a la lista de programas
        sophie.agregarPrograma(p1); sophie.agregarPrograma(p2);
        sophie.agregarPrograma(p3); sophie.agregarPrograma(p4);
        

        // pruebo métodos
        //System.out.println(f3.indiceCalidad()); // funciona
        System.out.println(p1.indiceCalidad()); // funciona
        System.out.println(p2.indiceCalidad());
        System.out.println(p3.indiceCalidad());
        System.out.println(p4.indiceCalidad());
        ArrayList<Programa> programasPorDebajoDe = sophie.programasPorDebajoDe(1.0); // funciona
        for(Programa p: programasPorDebajoDe){
            System.out.println(p);
        }
        
        // ME FALTAN TERMINAR 2 PUNTOS MÁS
    }
}