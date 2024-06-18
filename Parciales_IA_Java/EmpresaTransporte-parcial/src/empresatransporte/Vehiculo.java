package empresatransporte;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract void mostrarManifiesto();
    
    public abstract int getUnidadesTransportadas();

}