
package ejercicio_2;

class Propiedad {
    private String domicilio;
    private double precio;
    private Tipo tipo;
    
    //CONSTRUCTOR
    public Propiedad(String domicilio, double precio, Tipo tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    
    //GETTERS/SETTERS
    public String getDomicilio() {
        return domicilio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    

    @Override
    public String toString() {
        return "Propiedad{" + "domicilio=" + domicilio + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
}
