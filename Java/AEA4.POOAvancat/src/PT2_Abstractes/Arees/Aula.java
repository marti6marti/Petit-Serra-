package PT2_Abstractes.Arees;

public class Aula extends Espai {
    protected int aforamentMaxim;
    protected boolean cadiresPala;
    protected int nombreOrdinadors;
    protected boolean connectorsXarxa;

    public Aula(String codi, double superficie, boolean llumNatural, double consumElectric, int aforamentMaxim, boolean cadiresPala, int nombreOrdinadors, boolean connectorsXarxa) {
        super(codi, superficie, llumNatural, consumElectric);
        this.aforamentMaxim = aforamentMaxim;
        this.cadiresPala = cadiresPala;
        this.nombreOrdinadors = nombreOrdinadors;
        this.connectorsXarxa = connectorsXarxa;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return superficie / aforamentMaxim;
    }
}

