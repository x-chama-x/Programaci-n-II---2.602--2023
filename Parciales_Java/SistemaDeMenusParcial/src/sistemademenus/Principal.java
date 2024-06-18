package sistemademenus;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {


        // Crear un menú
        Menu m = new Menu("-- Menú principal --", new ItemSalida());

        // Crear un items de menú de acción
        ItemMenu i1 = new ItemAccion("- Nuevo", '1');
        ItemMenu i2 = new ItemAccion("- Abrir", '2');
        ItemMenu i3 = new ItemAccion("- Guardar", '3');
        // Crear un submenu de menú y un item de menú de submenu
        Menu m2 = new Menu("Menú de modo", new ItemSalida());
        ItemMenu i7 = new ItemSubmenu("- Modo >", '4', m2);

        // Agregar items al menú
        m.agregarItem(i1); m.agregarItem(i2);
        m.agregarItem(i3); m.agregarItem(i7);


        // Crear un items de menú de acción para el submenu
        ItemMenu i4 = new ItemAccion("- Claro", '1');
        ItemMenu i5 = new ItemAccion("- Oscuro", '2');
        // Crear un submenu del submenu y un item de menú de submenu
        Menu m3 = new Menu("Otro", new ItemSalida());
        ItemMenu i6 = new ItemSubmenu("- Otro >", '3', m3);

        // Agregar items al submenu
        m2.agregarItem(i4); m2.agregarItem(i5);
        m2.agregarItem(i6);

        // Agregar items al submenu del submenu
        m3.agregarItem(new ItemAccion("- Desde archivo...", '1'));
        m3.agregarItem(new ItemAccion("- Desde URL...", '2'));

        // ejecutar el menú principal
        m.ejecutar();

    }

}