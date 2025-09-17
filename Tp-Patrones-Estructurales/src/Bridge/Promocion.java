package Bridge;

public class Promocion extends TipoNotificacion {

    public Promocion(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviarNotificacion() {
        canalEnvio.enviar("PROMOCION: Descuento del 50%");
    }
}
