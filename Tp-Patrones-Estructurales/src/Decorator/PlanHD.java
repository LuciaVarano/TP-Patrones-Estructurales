package Decorator;

public class PlanHD extends PlanDecorador{

    public PlanHD(Plan plan) {
        super(plan);
    }

    @Override
    public double costo() {
        return plan.costo() + 500.0;
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " con resolucion HD";
    }
}
