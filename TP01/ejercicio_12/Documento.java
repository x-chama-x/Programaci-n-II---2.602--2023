package ejercicio_12;

import java.time.LocalDate;

public class Documento {
    private LocalDate fecha;
    private String titulo;
    private String cuerpo;
    
    
    //CONSTRUCTOR
    public Documento(LocalDate fecha, String titulo, String cuerpo) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}

