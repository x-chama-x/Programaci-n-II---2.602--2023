package ejercicio_14;
public class Cafetera {
    private String marca;
    private boolean encendida;
    private TipoCafe tipoCafe;
    private ModuloAgua moduloAgua;
    private ModuloLeche moduloLeche;
    
    private final int tempAguaCaliente = 75;

    //CONSTRUCTOR
    public Cafetera(String marca) {
        this.marca = marca;
        setEncendida(false); // la maquina comienza apagada
        this.moduloAgua = new ModuloAgua();
        this.moduloLeche = new ModuloLeche();
    }

    //GETTERS/SETTERS
    
    private void setEncendida(boolean Encendida) { 
        this.encendida = Encendida;
    }
    
    //ESTADO DE LA CAFETERA (ON/OFF)
    public void encender(){
        this.encendida = !this.encendida;
    }
    
    public String servirCafe(TipoCafe tc) {
       String mensaje;
       if (this.encendida) {
           if ( moduloLeche.tenesLecheSuficiente(tc.getCantLeche()) ) {
               if ( moduloAgua.estaEnCondiciones() ) {
                   moduloLeche.setTexturaLeche(tc.getTextura());
                   moduloLeche.descontarLeche(tc.getCantLeche());             
                   mensaje = "El café %s se ha servido correctamente";
               } else {
                    mensaje = "Módulo de agua no está en condiciones para hacer un %s";
               }               
           } else {
               mensaje = "No hay leche suficiente para hacer un %s";
           }
       }
       else {
           mensaje = "La maquina esta apagada";
       }
       // System.out.printf(mensaje, tc.name());
       return String.format(mensaje, tc.name());
   }
    
    public void recargarLeche(int cant) {
        moduloLeche.agregarLeche(cant);
    }
    
    public void calentar() {
        moduloAgua.calentarAgua();
    }     
}
