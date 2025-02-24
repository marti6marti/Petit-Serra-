package PT1.Vehicles;

public class VehiclesGrans extends Vehicle{
    public int pma;

    public VehiclesGrans(String matricula, int diesLloguer, int pma) {
        super(matricula, diesLloguer);
        this.pma = pma;
    }

    @Override
    public double preu() {
        return (preuBase*diesLloguer) + (20*pma);
    }
}
