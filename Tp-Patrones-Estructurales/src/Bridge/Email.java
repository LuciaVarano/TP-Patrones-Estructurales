package Bridge;

public class Email implements CanalEnvio {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por EMAIL: " + mensaje);
    }
}
