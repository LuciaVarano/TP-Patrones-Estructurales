package Bridge;

public class Recordatorio extends TipoNotificacion {

    public Recordatorio(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviarNotificacion() {
        canalEnvio.enviar("RECORDATORIO: Vuelo dia 19/02/2026 a las 8am :)");
    }
}
