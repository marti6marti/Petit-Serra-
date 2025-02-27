package PT2.Transports;

public class Bicicleta extends Transports{
    public int NumMarxes;

    public Bicicleta(int id, double velocitat, int numMarxes) {
        super(id, velocitat);
        NumMarxes = numMarxes;
    }

    public int getNumMarxes() {
        return NumMarxes;
    }

    public void setNumMarxes(int numMarxes) {
        NumMarxes = numMarxes;
    }
}
