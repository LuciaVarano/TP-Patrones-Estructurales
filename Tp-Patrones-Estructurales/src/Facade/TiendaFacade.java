package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade() {
        this.carrito = new Carrito();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void comprarProducto(String producto, String direccion) {
        System.out.println("--- Iniciando proceso de compra ---");

        // Paso 1: Agregar producto al carrito
        carrito.agregarProducto(producto);
        carrito.mostrarCarrito();

        // Paso 2: Procesar pago
        double total = carrito.calcularTotal();
        pago.procesarPago(total);
        pago.confirmarPago();

        // Paso 3: Coordinar envío
        envio.coordinarEnvio(direccion);
        envio.confirmarEnvio();

        System.out.println("--- Compra finalizada con éxito ---");
    }
}
