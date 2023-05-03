package ejercicio_12;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) throws Exception {
        ImpresoraMonocromatica impresora= new ImpresoraMonocromatica();
        //veo el estado de la impresora
        impresora.estadoImpresora();
        //prendo impresora
        impresora.setEstaEncendida(true);
        //cargo papel
        impresora.recargarBandeja(35); // recargo hojas al tope
        //veo el estado de la impresora (post encendido + recarga)
        impresora.estadoImpresora();
        
        // verificar cant de tinta según cant de caracteres
        System.out.println("nivel de tinta que deberia usarse " + impresora.nivelDeTintaPara(100));

        // creo el documento a imprimir
        String titulo = "Messi Goat";
        String campo = "Messi es el mejor futbolista de todos los tiempos.";
        Documento doc1= new Documento(LocalDate.now(),titulo,campo);
        impresora.imprimir(doc1); 
        
        //veo el estado de la impresora (post impresion)
        impresora.estadoImpresora();
    }
}

