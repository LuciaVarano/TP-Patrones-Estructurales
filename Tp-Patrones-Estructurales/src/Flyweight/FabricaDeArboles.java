package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private final Map<String, Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol(String tipo, String textura, String color) {
        String clave = tipo + "_" + textura + "_" + color;
        arboles.putIfAbsent(clave, new ArbolConcreto(tipo, textura, color));
        return arboles.get(clave);
    }
}
