package licencias;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenMoto extends Examen {

    private ArrayList<Circuito> circuitoMoto;
    private Vehiculo vehiculo;

    public ExamenMoto(ArrayList<Circuito> CircuitoMoto, Vehiculo vehiculo, String fecha, Persona persona) {
        super(fecha, persona);
        this.circuitoMoto = CircuitoMoto;
        this.vehiculo = vehiculo;
    }
    
    public void agregarCircuito(Circuito c){
        circuitoMoto.add(c);
    }

    @Override
    public boolean seAprobo() {
        boolean aprobado;
        final int maxCilindrada = 150;
        if(vehiculo.getCilindrada()>maxCilindrada){
            aprobado=primerCriterio();
        }else{
            aprobado=segundoCriterio();
        }
        return aprobado;
    } // se divide en 2 criterios dependiendo de la cilindrada del motor

    private boolean primerCriterio() {
        boolean todoAprobado = true;
        for (Circuito c: circuitoMoto){
            if(c.seAprobo()==false){
                todoAprobado = false;
            }
        }
        return todoAprobado;
    } // todos los circuitos deben ser aprobados sin importar el tiempo
    
    private boolean segundoCriterio(){
        boolean todoAprobado = true;
        int cont = 0;
        for (Circuito c: circuitoMoto){
            if(c.seAprobo()==false && cont==0){
                todoAprobado = false;
                cont++;
            }
        }
        return todoAprobado;
    } // se puede tener hasta 1 solo circuito desaprobado
} 