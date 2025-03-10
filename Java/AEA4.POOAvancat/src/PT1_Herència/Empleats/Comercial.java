package PT1_Herència.Empleats;

public class Comercial extends Empleat{
    public double comisio;

    public Comercial(String nom, String cognom, int edat, double salari, double comisio) {
        super(nom, cognom, edat, salari);
        this.comisio = comisio;
    }

    public double getComisio() {
        return comisio;
    }

    public void setComisio(double comisio) {
        this.comisio = comisio;
    }
}
