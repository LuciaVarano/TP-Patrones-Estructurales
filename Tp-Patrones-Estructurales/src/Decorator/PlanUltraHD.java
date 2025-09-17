package Decorator;

public class PlanUltraHD extends PlanDecorador{

    public PlanUltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public double costo() {
        return plan.costo() + 1000.0;
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " con resolucion Ultra HD";
    }
}
