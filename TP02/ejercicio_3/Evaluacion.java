
package ejercicio_3;


class Evaluacion {
    private int nota;
    private Tipo tipo;
    
    //CONSTRUCTOR
    public Evaluacion(int nota, Tipo tipo) {
        this.nota = nota;
        this.tipo = tipo;
    }

    public int getNota() {
        return nota;
    }
    
    
    
    
    // OTROS METODOS

    @Override
    public String toString() {
        return "Evaluacion{" + "nota=" + nota + ", tipo=" + tipo + '}';
    }
    
    
}
