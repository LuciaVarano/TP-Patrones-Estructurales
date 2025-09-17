package Adapter;

//Simula el sistema existente. Solo trabaja con la interfaz
public class SistemaImpresion {
    private Impresora impresora;

    public SistemaImpresion(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimirDocumento(String documento) {
        impresora.imprimir(documento);
    }
}
