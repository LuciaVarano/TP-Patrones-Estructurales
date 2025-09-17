package Proxy;

public class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir(String usuario) {
        System.out.println("Usuario: '" + usuario + "' ha abierto el archivo: " + nombre);
        //Logica para leer el archivo
        System.out.println("Contenido del archivo '" + nombre);
    }


}
