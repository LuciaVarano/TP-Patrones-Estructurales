package Facade;

public class Envio {

    // Lógica de coordinación de envío (ej. seleccionar transportista, generar guía)
    public void coordinarEnvio(String direccion) {
        System.out.println("Coordinando envío a: " + direccion);
    }

    public void confirmarEnvio() {
        System.out.println("Envío confirmado. Producto en camino.");
    }
}
