package ActivitatsHerencia.PT1_Herència.Vehicles;

public class Microbus extends Vehicle{
    public int plaça;

    public Microbus(String matricula, int diesLloguer, int plaça) {
        super(matricula, diesLloguer);
        this.plaça = plaça;
    }

    @Override
    public double preu() {
        return (preuBase*diesLloguer)+(plaça*2);
    }
}
