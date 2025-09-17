package Bridge;

public class Alerta extends TipoNotificacion {

    public Alerta(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviarNotificacion() {
        canalEnvio.enviar("Alerta! Esto es una notificacion urgente.");
    }
}


