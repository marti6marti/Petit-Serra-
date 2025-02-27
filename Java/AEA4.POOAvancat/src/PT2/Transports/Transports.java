package PT2.Transports;

public class Transports {
    public int id;
    public double velocitat;

    public Transports(int id, double velocitat) {
        this.id = id;
        this.velocitat = velocitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(double velocitat) {
        this.velocitat = velocitat;
    }
}
