package ActivitatsHerencia.PT2_Abstractes.Arees;

public class Laboratori extends Aula {
    private int encenedorsBunsen;

    public Laboratori(String codi, double superficie, boolean llumNatural, double consumElectric, int aforamentMaxim, boolean cadiresPala, int nombreOrdinadors, boolean connectorsXarxa, int encenedorsBunsen) {
        super(codi, superficie, llumNatural, consumElectric, aforamentMaxim, cadiresPala, nombreOrdinadors, connectorsXarxa);
        this.encenedorsBunsen = encenedorsBunsen;
    }
}