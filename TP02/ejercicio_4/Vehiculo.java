
package ejercicio_4;


class Vehiculo {
    private String patente;
    private double precio;
    private Tipo tipo;
    
    // CONSTRUCTOR
    public Vehiculo(String patente, double precio, Tipo tipo) {
        this.patente = patente;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getPatente() {
        return patente;
    }
    
    // para el punto B y C
    public void mostrar(Vehiculo v) {
        System.out.println(v);
    }    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", precio=$" + precio + '}';
    }

}