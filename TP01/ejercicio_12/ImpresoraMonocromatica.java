package ejercicio_12;

public class ImpresoraMonocromatica {
    private boolean estaEncendida;
    private int bandeja;
    private int nivelTinta;

    //CONSTRUCTOR
    public ImpresoraMonocromatica() {
        this.estaEncendida=false;
        this.bandeja=0; // la bandeja empieza con 0 hojas
        this.nivelTinta=100;
    }    
    //GETTERS
    public boolean isEstaEncendida() {
        return estaEncendida;
    }
    public int getBandeja() {
    return bandeja;
    }
    //SETTERS
    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }
    public void recargarBandeja(int cant){
        if(bandeja<=35 && cant > 0 && cant <= 35){
           bandeja = bandeja + cant;
        }
    }
    // METODOS
    public void estadoImpresora(){
        System.out.println(toString());
    }
    
    //se consume 1 punto de tinta cada 50 caracteres
    public int nivelSegunCantCaracteres(int cantCaract){
        return cantCaract/50;
    }
    
    public void imprimir(Documento doc1) throws Exception {
        if(verificacion(doc1)==1){
            restarCaract(doc1);
            restarPapel(doc1);
            // Imprime la fecha
            System.out.print("\n"+doc1.getFecha() + "\t");
            // Imprime el título
            System.out.println(doc1.getTitulo());
            // Imprime el cuerpo
            System.out.println(doc1.getCuerpo());            
        }
    }
    
    private void restarCaract(Documento doc1){
        int cantCaract = doc1.getCuerpo().length();
        nivelTinta -= nivelSegunCantCaracteres(cantCaract);
    }
    
    private void restarPapel(Documento doc1){
        int cantCaract = doc1.getCuerpo().length();
        bandeja-=cantCaract/20;
    }
    
    private int verificacion(Documento doc1) throws Exception {
        int cantCaract = doc1.getCuerpo().length();
        if (estaEncendida == true) {
            if (nivelTinta >= nivelSegunCantCaracteres(cantCaract)) {
                if (bandeja > 0) {
                    return 1;
                } else {
                    throw new Exception("La bandeja de la impresora está vacía.");
                }
            } else {
                throw new Exception("El nivel de tinta no es suficiente para imprimir este documento.");
            }
        } else {
            throw new Exception("La impresora está apagada.");
        }
    }

    @Override
    public String toString() {
        return "ImpresoraMonocromatica{" + "estaEncendida=" + estaEncendida + ", bandeja=" + bandeja + ", nivelTinta=" + nivelTinta + '}';
    }
}
