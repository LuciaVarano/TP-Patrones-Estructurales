package Flyweight;

import java.util.Random;

public class Juego {
    private static final String[] TIPOS = {"Roble", "Pino", "Abeto"};
    private static final String[] TEXTURAS = {"Rugosa", "Lisa", "Escamosa"};
    private static final String[] COLORES = {"Verde", "Marrón", "Amarillo"};

    public static void main(String[] args) {
        FabricaDeArboles fabrica = new FabricaDeArboles();
        Random random = new Random();

        // Simular 1 millón de árboles
        for (int i = 0; i < 1_000_000; i++) {
            String tipo = TIPOS[random.nextInt(TIPOS.length)];
            String textura = TEXTURAS[random.nextInt(TEXTURAS.length)];
            String color = COLORES[random.nextInt(COLORES.length)];
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);

            Arbol arbol = fabrica.obtenerArbol(tipo, textura, color);
            arbol.dibujar(x, y);
        }

        System.out.println("¡Se crearon 1 millón de árboles optimizando memoria!");
    }
}

