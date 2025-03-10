package PT2_Abstractes.Transports;

public class Metro extends Transports{
    public double preuBilletInicial;

    public Metro(int id, double velocitat, double preuBilletInicial) {
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
