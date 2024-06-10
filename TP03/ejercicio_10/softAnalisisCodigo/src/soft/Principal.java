package soft;

public class Principal {

    public static void main(String[] args) {

        // Crear un objeto Metodo
        Metodo metodo1 = new Metodo("metodo1", 2, 10, 3);
        Metodo metodo2 = new Metodo("metodo2", 3, 15, 4);

        // Crear un objeto DeProgramacion y agregar los metodos
        DeProgramacion fp = new DeProgramacion("fp", "ubicacion1");
        fp.agregarMetodo(metodo1);
        fp.agregarMetodo(metodo2);

        // Crear un objeto Programa y agregar la fuente
        Programa prog1 = new Programa("ID1", "prog1", "responsable1", true);
        prog1.agregarFuente(fp);

        // Crear un objeto DeMercado
        DeMercado fm = new DeMercado("fm", "ubicacion2", 1000);
        prog1.agregarFuente(fm);

        // Crear un objeto Sophie
        Sophie sophie = new Sophie();
        sophie.agregarPrograma(prog1);

        // Probar los metodos indiceCalidad()
        System.out.println("Indice de calidad del programa: " + prog1.indiceCalidad()); // 3.8+0.45 / 2 = 2.125 --> lo hace bien
        //System.out.println("Indice de calidad del metodo1: " + metodo1.indiceCalidad()); // 4.417 --> lo hace bien
        //System.out.println("Indice de calidad del metodo2: " + metodo2.indiceCalidad()); // 3.183 --> lo hace bien
        System.out.println("Indice de calidad de la fuente de programacion: " + fp.indiceCalidad()); // 4.417 + 3.183 / 2 = 3.8 --> lo hace bien
        System.out.println("Indice de calidad de la fuente de mercado: " + fm.indiceCalidad()); // 450 / 1000 = 0.45 --> lo hace bien

        // Probar el metodo programasPorDebajoDe()
        System.out.println("Programas por debajo de 2.5: " + sophie.programasPorDebajoDe(2.5)); // [Programa{ID='ID1'}] --> lo hace bien

        // Probar el metodo mostrarDetalleDeMetodo()
        prog1.mostrarDetalleDeMetodo("metodo"); // "Metodo{nombre='metodo1', lineasCodigo=2, complejidadCiclomatica=10, cantidadDeMetodos=3}"

        // Probar el metodo listadoFuentesMayoresAlPromedio()
        System.out.println("Fuentes con indice de calidad mayor al promedio: " + prog1.listadoFuentesMayoresAlPromedio()); // [DeProgramacion{nombre='fp', ubicacion='ubicacion1'}] --> lo hace bien

    }

}