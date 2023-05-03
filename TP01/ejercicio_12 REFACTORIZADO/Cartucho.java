
package ejercicio_12;

class Cartucho {
    private int nivelTinta;
    
    //CONSTRUCTOR
    public Cartucho(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
    
    //GETTERS y SETTERS

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
    
    // OTROS METODOS
    
    public void restar( int cantCaract){
        int tintaARestar = getNivelTinta()- chequeoPara(cantCaract);
        setNivelTinta(tintaARestar);
    }

    public int chequeoPara(int cantCaract) {
        return cantCaract/50;
    }
    
}
