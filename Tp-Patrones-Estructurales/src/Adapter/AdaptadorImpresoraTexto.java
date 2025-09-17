package Adapter;

public class AdaptadorImpresoraTexto implements Impresora {
    private ImpresoraTexto impresoraTexto;

    public AdaptadorImpresoraTexto() {
        this.impresoraTexto = new ImpresoraTexto();
    }

    @Override
    public void imprimir(String documento) {
        //Traduce la llamada de imprimir() a imprimirTextoPlano()
        impresoraTexto.imprimirTextoPlano(documento);
    }
}
