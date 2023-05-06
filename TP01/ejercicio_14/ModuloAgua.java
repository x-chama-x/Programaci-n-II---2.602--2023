package ejercicio_14;
public class ModuloAgua {
    private int medidorTemp;
    private boolean mantenimiento;
    private static final int TEMP_MIN_PARA_HACER_CAFE = 70;

    //CONSTRUCTOR 
    public ModuloAgua() {
        this.medidorTemp=20; // el medidor esta en temp ambiente
        this.mantenimiento=false; // el modulo empieza sin necesidad de mantenimiento
    }    
    
    //GETTERS/SETTERS
    public double getMedidorTemp() {
        return medidorTemp;
    }

    public void setMedidorTemp(int medidorTemp) {
        this.medidorTemp = medidorTemp;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }
    
    public void calentarAgua(){
        setMedidorTemp(TEMP_MIN_PARA_HACER_CAFE);
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    public boolean estaEnCondiciones() {
        return !isMantenimiento() && this.medidorTemp >= TEMP_MIN_PARA_HACER_CAFE;
    }
    
}
