package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("\n--- Menú: " + nombre + " ---");
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar(); // Delegación recursiva
        }
    }
}

