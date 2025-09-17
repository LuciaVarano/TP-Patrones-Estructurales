import Adapter.*;
import Bridge.*;
import Decorator.*;
import Facade.TiendaFacade;
import Proxy.Archivo;
import Proxy.ArchivoProxy;
import Composite.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("➡\uFE0F EJERCICIO 1 - PATRON ADAPTER");

        //Impresión en PDF
        Impresora impresoraPDF = new ImpresoraPDF();
        SistemaImpresion sistemaPDF = new SistemaImpresion(impresoraPDF);
        sistemaPDF.imprimirDocumento("documento1.pdf");

        // Impresión en texto (usando el adaptador)
        Impresora impresoraTexto = new AdaptadorImpresoraTexto();
        SistemaImpresion sistemaTexto = new SistemaImpresion(impresoraTexto);
        sistemaTexto.imprimirDocumento("documento2.txt");

        System.out.println("\n➡\uFE0F EJERCICIO 2 - PATRON BRIDGE");

        //Creamos una alerta que se envia a traves de SMS
        TipoNotificacion alerta = new Alerta(new SMS());

        //Creamos un recordatorio que se envia a traves de Email
        TipoNotificacion recordatorio = new Recordatorio(new Email());

        //Creamos una promocion que se envia a traves de Email
        TipoNotificacion promocion = new Alerta(new Email());

        alerta.enviarNotificacion();
        recordatorio.enviarNotificacion();
        promocion.enviarNotificacion();

        System.out.println("\n➡\uFE0F EJERCICIO 3 - PATRON DECORATOR");

        //Creamos un plan basico
        Plan planBasico = new PlanBasico();
        System.out.println(planBasico.descripcion() + "\n - Costo: $" + planBasico.costo());

        //Creamos un plan basico con Ultra HD
        Plan planBasicoUltraHD = new PlanUltraHD(planBasico);
        System.out.println("\n" + planBasicoUltraHD.descripcion() + "\n - Costo: $" + planBasicoUltraHD.costo());

        //Creamos un plan basico con descargas offlina y HD
        Plan Offline = new DescargasOffline(planBasico);
        Plan OfflineHD = new PlanHD(Offline);
        System.out.println("\n" + OfflineHD.descripcion() + "\n - Costo: $" + OfflineHD.costo());

        System.out.println("\n➡\uFE0F EJERCICIO 4 - PATRON FACADE");

        TiendaFacade compra1 = new TiendaFacade();
        compra1.comprarProducto("Notebook HP", "Av. San Martin 1234");

        System.out.println("\n➡\uFE0F EJERCICIO 5 - PATRON FLYWEIGHT");
        System.out.println("Este patrón tiene su propio main");

        System.out.println("\n➡\uFE0F EJERCICIO 6 - PATRON PROXY");
        //Creamos un archivo que solo un usuario que definimos puede abrirlo
        Archivo archivo1 = new ArchivoProxy("Este es un archivo confidencial, solo Lucia puede abrirlo");
        archivo1.abrir("lucia");

        System.out.printf("\n");

        //Creamos un archivo que no puede abrir un usuario
        Archivo archivo2 = new ArchivoProxy("Este archivo solo el admin lo puede abrir");
        archivo2.abrir("Juan");

        System.out.println("\n➡\uFE0F EJERCICIO 7 - PATRON COMPOSITE");

        // Crear platos individuales
        Plato ensalada = new Plato("Ensalada César", 8.50);
        Plato pasta = new Plato("Pasta Alfredo", 12.00);
        Plato postre = new Plato("Tiramisú", 6.00);

        // Crear un submenú (para bebidas)
        Menu menuBebidas = new Menu("Bebidas");
        menuBebidas.agregarElemento(new Plato("Agua", 1.50));
        menuBebidas.agregarElemento(new Plato("Refresco", 2.50));
        menuBebidas.agregarElemento(new Plato("Vino", 5.00));

        // Crear menú principal
        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregarElemento(ensalada);
        menuPrincipal.agregarElemento(pasta);
        menuPrincipal.agregarElemento(menuBebidas); // Añadir submenú
        menuPrincipal.agregarElemento(postre);

        // Mostrar todo el menú (incluyendo submenú)
        menuPrincipal.mostrar();

    }
}