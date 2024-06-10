package soft;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Metodo implements Calificable {

    private String nombre;
    private int cantParametros;
    private int cantInstrucciones;
    private int cantRamFlujo;

    public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamFlujo) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantInstrucciones = cantInstrucciones;
        this.cantRamFlujo = cantRamFlujo;
    }


    @Override
    public double indiceCalidad() {
        return ((double) 5 / (cantParametros + 1) + (double) 20 / cantInstrucciones + (double) 3 / (cantRamFlujo + 1));
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Metodo{" +
                "nombre='" + nombre + '\'' +
                ", lineasCodigo=" + cantParametros +
                ", complejidadCiclomatica=" + cantInstrucciones +
                ", cantidadDeMetodos=" + cantRamFlujo +
                '}';
    }

}