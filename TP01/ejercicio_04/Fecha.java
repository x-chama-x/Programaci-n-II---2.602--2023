package ejercicio_04;

public class Fecha {
    private int dia,mes,anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    private int getDia() {
        return dia;
    }

    private int getMes() {
        return mes;
    }
    
    public boolean esNavidad (){
        return getDia()==25 && getMes()==12;
    }
    
    public void setMes(int mes) {
        //valido mes
        if(mes >=1 && mes <=12){
            this.mes = mes;
        }
        else{
            System.out.println("Nro. de MES inválido para una fecha");
        }    
    }
    
    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;     
        }              
    }
    
    public void sumarMes(){
        if(getMes()<=11){
            setMes(mes+1);
        }
        else{
            setMes(1);
            setAnio(anio+1);
        }
    }
}
