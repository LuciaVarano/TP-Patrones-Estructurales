package Flyweight;

public class ArbolConcreto implements Arbol {
    private final String tipo;  // Ej: "Roble", "Pino", "Abeto"
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.printf(
                "Dibujando %s (textura: %s, color: %s) en (%d, %d)%n",
                tipo, textura, color, x, y
        );
    }
}
