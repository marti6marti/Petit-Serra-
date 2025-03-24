package ActivitatsHerencia.PT2_Abstractes.Arees;

public class Despatx extends Espai {
    private int nombreTaules;
    private boolean maquinaCafe;

    public Despatx(String codi, double superficie, boolean llumNatural, double consumElectric, int nombreTaules, boolean maquinaCafe) {
        super(codi, superficie, llumNatural, consumElectric);
        this.nombreTaules = nombreTaules;
        this.maquinaCafe = maquinaCafe;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return 0;
    }
}
