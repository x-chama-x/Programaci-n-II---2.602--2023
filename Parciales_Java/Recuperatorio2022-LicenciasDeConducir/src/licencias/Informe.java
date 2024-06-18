package licencias;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Informe {

    private double porcentExamReprob;
    private double promTiempExamAutoAprob;

    // establezco los setters que tendran los valores de getters correspondientes
    // se trabaja en base a la lista de exámenes que se genera en la clase main
    
    public void setPorcentExamReprob(ArrayList<Examen> examenes) {
        this.porcentExamReprob = getPorcentExamReprob(examenes);
    }

    public void setPromTiempExamAutoAprob(ArrayList<Examen> examenes) {
        this.promTiempExamAutoAprob = getPromTiempExamAutoAprob(examenes);
    }
    
    // establezco los getters que serán los encargados de calcular los puntos A y B
    
    //punto A --> FUNCIONA
    public double getPorcentExamReprob(ArrayList<Examen> examenes) {
        int cont=0;
        for (Examen e: examenes){
            if(e.seAprobo()== false){
                cont ++;
            }
        }
        return cont*100/ examenes.size();
    }
    //punto B --> FUNCIONA
    public double getPromTiempExamAutoAprob(ArrayList<Examen> examenes) {
        double prom = 0;
        int count = 0;
        for (Examen e : examenes) {
            if (e instanceof ExamenAuto) {
                if(e.seAprobo()==true){
                    prom += ((ExamenAuto) e).getCircuitoAuto().getTiempo();
                    count++;                  
                }  
            }
        }
        return count > 0 ? prom / count : 0;
    }
}