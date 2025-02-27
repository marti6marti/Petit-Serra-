package PT2.Transports;

public class metro extends Transports{
    public double preuBilletInicial;
    public double km;

    public metro(int id, double velocitat, double preuBilletInicial, double km) {
        super(id, velocitat);
        this.preuBilletInicial = preuBilletInicial;
        this.km = km;
    }

    public double getPreuBilletInicial() {
        return preuBilletInicial;
    }

    public void setPreuBilletInicial(double preuBilletInicial) {
        this.preuBilletInicial = preuBilletInicial;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double preuBillet(){
        double copsCobrar = km/5;
        
    }
}
