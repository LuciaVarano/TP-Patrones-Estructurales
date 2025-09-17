package Proxy;

import java.util.Arrays;
import java.util.List;

public class ArchivoProxy implements Archivo {
    private String nombre;
    private ArchivoReal archivoReal;
    //Lista de usuarios permitidos
    private static final List<String> USUARIOS_AUTORIZADOS = Arrays.asList("admin", "lucia", "supervisor");

    public ArchivoProxy(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void abrir(String usuario) {
        if (USUARIOS_AUTORIZADOS.contains(usuario)) {
            // Inicializa el ArchivoReal solo si el usuario tiene permisos
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombre);
            }
            archivoReal.abrir(usuario);
        } else {
            System.out.println("¡Acceso denegado! El usuario '" + usuario + "' no tiene permisos para abrir el archivo: " + nombre);
        }
    }
}
