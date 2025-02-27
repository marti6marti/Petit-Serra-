package PT2.Transports;

public class Cotxes extends Transports {
public String tipusGasolina;
public double preuLitre;
public double consumLperKM;

    public Cotxes(int id, double velocitat, String tipusGasolina, double preuLitre, double consumLperKM) {
        super(id, velocitat);
        this.tipusGasolina = tipusGasolina;
        this.preuLitre = preuLitre;
        this.consumLperKM = consumLperKM;
    }

    public String getTipusGasolina() {
        return tipusGasolina;
    }

    public void setTipusGasolina(String tipusGasolina) {
        this.tipusGasolina = tipusGasolina;
    }

    public double getPreuLitre() {
        return preuLitre;
    }

    public void setPreuLitre(double preuLitre) {
        this.preuLitre = preuLitre;
    }

    public double getConsumLperKM() {
        return consumLperKM;
    }

    public void setConsumLperKM(double consumLperKM) {
        this.consumLperKM = consumLperKM;
    }
}
