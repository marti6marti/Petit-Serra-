package ActivitatsHerencia.PT1_Herència.Vehicles;

public class Cotxe extends Vehicle{
    public int plaça;

    public Cotxe(String matricula, int diesLloguer, int plaça) {
        super(matricula, diesLloguer);
        this.plaça = plaça;
    }

    @Override
    public double preu() {
        return (preuBase*diesLloguer)+(plaça*1.5*diesLloguer);
    }
}
