package todolibre;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TodoLibre {

    private ArrayList<Usuario> usuarios;
    private ArrayList<OrdenDeCompra> ordenesCompra;

    public TodoLibre() {
        this.usuarios = new ArrayList<>();
        this.ordenesCompra = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario user){
       if(user!=null){
           usuarios.add(user);
       } 
    }
    
    public void agregarOrden(OrdenDeCompra o){
       if(o!=null){
           ordenesCompra.add(o);
       }
    }
    
    public double porcentajeMismaComuna() { 
        int cont = 0;
        double porcentaje=0;
        if (ordenesCompra.size()!=0){ // por si la lista esta vacia, ignorar.
            for(OrdenDeCompra o: ordenesCompra){
                if(o.getComunaDestino()== o.getComunaOrigen()){
                    cont++;
                }
            }
            porcentaje = cont * 100 / ordenesCompra.size();
        }
        return porcentaje;
    }

    public int cantidadEnvioGratis() {
        int cont = 0;
        for (OrdenDeCompra o: ordenesCompra){
            if (ordenesCompra.size()!=0){ // por si la lista esta vacia, ignorar.
                if (o instanceof OrdenPuertaAPuerta){
                    if(((OrdenPuertaAPuerta) o).isEnvioGratis()){
                        cont++;
                    }
                }    
            }
        }
        return cont;
    }
}