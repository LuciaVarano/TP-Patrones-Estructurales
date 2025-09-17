package Decorator;

abstract public class PlanDecorador implements Plan {
    protected Plan plan;

    public PlanDecorador(Plan plan) {
        this.plan = plan;
    }

    @Override
    public double costo() {
        return plan.costo();
    }

    @Override
    public String descripcion() {
        return plan.descripcion();
    }
}
