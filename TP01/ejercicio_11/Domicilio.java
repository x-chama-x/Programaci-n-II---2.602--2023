package ejercicio_11;

public class Domicilio {
    private String calle;
    private int numero;
    private String barrio;

    public Domicilio(String calle, int numero, String barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", barrio=" + barrio + '}';
    }
      
}
