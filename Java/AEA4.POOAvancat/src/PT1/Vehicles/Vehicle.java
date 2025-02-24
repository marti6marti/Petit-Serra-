package PT1.Vehicles;

public abstract class Vehicle {
    public String matricula;
    public int preuBase = 10;
    public int diesLloguer;

    public Vehicle(String matricula, int diesLloguer) {
        this.matricula = matricula;
        this.preuBase = preuBase;
        this.diesLloguer = diesLloguer;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract double preu();
}

