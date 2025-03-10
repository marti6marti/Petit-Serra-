package PT1_Herència.Vehicles;

public class Camions extends VehiclesGrans {

    public Camions(String matricula, int diesLloguer, int pma) {
        super(matricula, diesLloguer, pma);
    }

    public double preu(){
        return super.preu()+40;
    }

}
