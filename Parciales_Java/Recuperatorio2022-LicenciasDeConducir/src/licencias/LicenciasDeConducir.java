package licencias;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class LicenciasDeConducir {

    private ArrayList<Examen> examenes;

    public LicenciasDeConducir() {
        this.examenes = new ArrayList<>();
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }
    
    public void agregarExamen(Examen e){
        examenes.add(e);
    }
    
    public Informe obtenerInforme() {
        Informe i = new Informe();
        // los setter se utilizan para establecer los valores calculados en el objeto Informe.
        i.setPromTiempExamAutoAprob(examenes);
        //System.out.println("Porcentaje: " + i.getPorcentExamReprob(examenes) + "%"); // funciona, se tiene 40.0% porque solo hay 2 reprobados de 5 examenes
        i.setPorcentExamReprob(examenes);
        //System.out.println("Promedio: " + i.getPromTiempExamAutoAprob(examenes)); // funciona, se tiene 82.5 (85+80/2)
        return i; // se retorna el objeto Informe i, con los datos calculados.
    }

}