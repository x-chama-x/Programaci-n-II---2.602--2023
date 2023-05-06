package ejercicio_14;
public class Principal {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera("nespresso");
        
        String msj;
        
        cafetera.encender();
        cafetera.recargarLeche(5);
        cafetera.calentar();
        msj = cafetera.servirCafe( TipoCafe.LATTE );        
        System.out.println(msj);
        msj = cafetera.servirCafe( TipoCafe.LATTE );        
        System.out.println(msj);
        msj = cafetera.servirCafe( TipoCafe.EXPRESSO );        
        System.out.println(msj);
        msj = cafetera.servirCafe( TipoCafe.LAGRIMA );        
        System.out.println(msj);
        
    } 
}
