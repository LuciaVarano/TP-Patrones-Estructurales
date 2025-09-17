package Facade;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<String> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        productos.add(producto);
        System.out.println("Producto agregado al carrito: " + producto);
    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito: " + productos);
    }

    public double calcularTotal() {
        // Simulamos un cálculo de total (en un caso real, cada producto tendría un precio)
        return productos.size() * 1000.0; // Ejemplo: $1000 por producto
    }
}

