package ejercicio_14;
class ModuloLeche {
    private int medidorLiquido; // cantidad de leche
    private Textura texturaLeche;
    public static final int MIN_CANT_LIQUIDO = 0;
    public static final int MAX_CANT_LIQUIDO = 5;

    //CONSTRUCTOR
    public ModuloLeche() {
        this.medidorLiquido=0; // modulo vacio == no tiene leche
        this.texturaLeche=Textura.LIQUIDA; // por default
    }
    
    //GETTERS/SETTERS
    public int getMedidorLiquido() {
        return medidorLiquido;
    }
    
    public void setMedidorLiquido(int medidorLiquido) {
        this.medidorLiquido = medidorLiquido;
    }

    public Textura getTexturaLeche() {
        return texturaLeche;
    }

    public void setTexturaLeche(Textura texturaLeche) {
        this.texturaLeche = texturaLeche;
    }
    
    public void agregarLeche(int puntosLeche){
        int aux = medidorLiquido + puntosLeche;
        if (aux > MAX_CANT_LIQUIDO) {
            this.medidorLiquido = MAX_CANT_LIQUIDO;
        } else {
            this.medidorLiquido = aux;
        }
    }
    
    
    public void setCantidadLeche(int puntosLeche){
        agregarLeche(puntosLeche);
    }
    
    public void descontarLeche(int puntosLeche){
        medidorLiquido -= puntosLeche;
    }
    
    public boolean tenesLecheSuficiente(int puntosLeche){
        return medidorLiquido >= puntosLeche;
    } 
}
