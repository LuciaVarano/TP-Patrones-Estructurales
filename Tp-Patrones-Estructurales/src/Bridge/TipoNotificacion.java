package Bridge;

abstract public class TipoNotificacion {
    protected CanalEnvio canalEnvio;

    public TipoNotificacion(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    public abstract void enviarNotificacion();
}
