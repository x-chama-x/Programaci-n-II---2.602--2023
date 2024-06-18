package sistemademenus;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ItemSubmenu extends ItemMenu {

    private Menu submenu;

    public ItemSubmenu(String descripcion, char caracter, Menu submenu) {
        super(descripcion, caracter);
        this.submenu = submenu;
    }

    @Override
    public void ejecutar() {
        submenu.ejecutar();
    }

}