package Decorator;

public class DescargasOffline extends PlanDecorador {

    public DescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public double costo() {
        return plan.costo() + 700.0;
    }

   @Override
    public String descripcion() {
        return plan.descripcion() + " con Descargas Offline";
    }
}
