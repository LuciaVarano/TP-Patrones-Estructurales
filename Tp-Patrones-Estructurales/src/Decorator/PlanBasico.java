package Decorator;

public class PlanBasico implements Plan {

    @Override
    public double costo() {
        return 1000.0;
    }

    @Override
    public String descripcion() {
        return "Usted tiene el Plan Basico";
    }
}
