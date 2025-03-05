package PT2.Transports;

public class metro extends Transports{
    public double preuBilletInicial;

    public metro(int id, double velocitat, double preuBilletInicial) {
        super(id, velocitat);
        this.preuBilletInicial = preuBilletInicial;
    }

    public double getPreuBilletInicial() {
        return preuBilletInicial;
    }

    public void setPreuBilletInicial(double preuBilletInicial) {
        this.preuBilletInicial = preuBilletInicial;
    }

    @Override
    public double factura(double KmRecorre) {
        double copsCobrar = KmRecorre/5;
        return preuBilletInicial + copsCobrar;
    }

}
