package ejercicio_12;

public class ImpresoraMonocromatica {
    private boolean estaEncendida;
    private Bandeja bandeja;
    private Cartucho cartucho;

    //CONSTRUCTOR
    public ImpresoraMonocromatica() {
        this.estaEncendida=false;
        this.bandeja = new Bandeja(0); // la bandeja empieza con 0 hojas
        this.cartucho = new Cartucho(100);
    }    
    //GETTERS
    public boolean isEstaEncendida() {
        return estaEncendida;
    }
    //SETTERS
    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }
    public void recargarBandeja(int cant){
        bandeja.recargar(cant); // TELL, DON'T ASK
    }
    // METODOS
    public void estadoImpresora(){
        System.out.println(toString());
    }
    
    //se consume 1 punto de tinta cada 50 caracteres
    public int nivelDeTintaPara(int cantCaract){
        return cartucho.chequeoPara(cantCaract);
    }
    
    public void imprimir(Documento doc1) throws Exception {
        if(verificacion(doc1)==1){
            restarTinta(doc1);
            restarPapel(doc1);
            // Imprime la fecha
            System.out.print("\n"+doc1.getFecha() + "\t");
            // Imprime el título
            System.out.println(doc1.getTitulo());
            // Imprime el cuerpo
            System.out.println(doc1.getCuerpo());            
        }
    }
    
    private void restarTinta(Documento doc1){
        int cantCaract = doc1.getCuerpo().length();
        cartucho.restar(cantCaract);
    }
    
    private void restarPapel(Documento doc1){
        int cantCaract = doc1.getCuerpo().length();
        bandeja.restar(cantCaract);
    }
    
    private int verificacion(Documento doc1) throws Exception {
        int cantCaract = doc1.getCuerpo().length();
        if (estaEncendida == true) {
            if (cartucho.getNivelTinta() >= nivelDeTintaPara(cantCaract)) {
                if (bandeja.getCantHojas() > 0) {
                    return 1;
                } else {
                    throw new RuntimeException("La bandeja de la impresora está vacía.");
                }
            } else {
                throw new RuntimeException("El nivel de tinta no es suficiente para imprimir este documento.");
            }
        } else {
            throw new RuntimeException("La impresora está apagada.");
        }
    }

    @Override
    public String toString() {
        return "ImpresoraMonocromatica{" + "estaEncendida=" + estaEncendida + ", bandeja=" + bandeja.getCantHojas() + ", nivelTinta=" + cartucho.getNivelTinta() + '}';
    }
}


