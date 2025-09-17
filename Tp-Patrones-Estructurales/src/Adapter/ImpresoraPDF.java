package Adapter;

public class ImpresoraPDF implements Impresora{
    // Clase existente que imprime PDF
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo documento PDF: " + documento);
    }
}
