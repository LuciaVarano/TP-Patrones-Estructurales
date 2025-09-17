package Facade;

public class Pago {
    // Lógica de procesamiento de pago (ej. validar tarjeta, confirmar transacción)
    public void procesarPago(double monto) {
        System.out.println("Procesando pago por: $" + monto);
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado. Transacción exitosa.");
    }
}
