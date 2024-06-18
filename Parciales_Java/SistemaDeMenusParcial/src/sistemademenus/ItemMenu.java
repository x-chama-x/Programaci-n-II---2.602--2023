package sistemademenus;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class ItemMenu implements Mostrable, Ejecutable {

    private String descripcion;
    private char caracter;

    public ItemMenu(String descripcion, char caracter) {
        this.descripcion = descripcion;
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }

    @Override
    public void mostrar() {
        System.out.println(descripcion + " (" + caracter + ")");
    }
}