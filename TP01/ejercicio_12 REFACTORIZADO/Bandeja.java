package ejercicio_12;

public class Bandeja {
    private int cantHojas;
    
    //CONSTRUCTOR

    public Bandeja(int cantHojas) {
        this.cantHojas = cantHojas;
    }
    
    //GETTERS y SETTERS

    public int getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }
    
    // OTROS METODOS
    public void restar(int cantCaract){
        int papelARestar = getCantHojas()-(cantCaract/20);
        setCantHojas(papelARestar);
    }
    
    public void recargar(int cant){
           if(getCantHojas()<=35 && cant > 0 && cant <= 35){
           setCantHojas((cant+getCantHojas()));
        }
    }
}



