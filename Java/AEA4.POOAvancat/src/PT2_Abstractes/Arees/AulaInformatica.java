package PT2_Abstractes.Arees;

public class AulaInformatica extends Aula {
    private int nombreImpressores;

    public AulaInformatica(String codi, double superficie, boolean llumNatural, double consumElectric, int aforamentMaxim, boolean cadiresPala, int nombreOrdinadors, boolean connectorsXarxa, int nombreImpressores) {
        super(codi, superficie, llumNatural, consumElectric, aforamentMaxim, cadiresPala, nombreOrdinadors, connectorsXarxa);
        this.nombreImpressores = nombreImpressores;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return (superficie - nombreImpressores) / aforamentMaxim;
    }
}
