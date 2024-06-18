package sistemademenus;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Mostrable, Ejecutable{

    private String titulo;
    private ItemSalida itemSalir;
    private ArrayList<ItemMenu> items;

    public Menu(String titulo, ItemSalida itemSalir) {
        this.titulo = titulo;
        this.itemSalir = itemSalir;
        this.items = new ArrayList<ItemMenu>();
    }

    public void agregarItem(ItemMenu i) {
        if (!(i instanceof ItemSalida)) {
            items.add(i);
        }
    }

    @Override
    public void ejecutar() {
        char opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != itemSalir.getCaracter()); // muestra todos los menus hasta que se elija la opcion de salir
    }

    private void mostrarMenu() {
        mostrar();
        System.out.print("Ingrese la opcion deseada: ");
    }

    private char leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.next().charAt(0);
    }

    private ItemMenu buscarItemPorCaracter(char opcion) {
        ItemMenu item = null;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCaracter() == opcion) {
                item = items.get(i);
                i = items.size();
            }
        }
        return item;
    }

    private void ejecutarOpcion(char opcion) {
        ItemMenu item = buscarItemPorCaracter(opcion);
        if (item != null) {
            item.ejecutar();
        } else if (itemSalir.getCaracter() == opcion) {
            itemSalir.ejecutar();
        } else {
            System.out.println("Opcion incorrecta");
        }
    }

    @Override
    public void mostrar() {
        System.out.println(titulo);
        for (int i = 0; i < items.size(); i++) {
            items.get(i).mostrar();
        }
        itemSalir.mostrar();
    }

}