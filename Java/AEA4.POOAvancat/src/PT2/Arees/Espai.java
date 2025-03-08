package PT2.Arees;

public abstract class Espai {
    protected String codi;
    protected double superficie;
    protected boolean llumNatural;
    protected double consumElectric;

    public Espai(String codi, double superficie, boolean llumNatural, double consumElectric) {
        this.codi = codi;
        this.superficie = superficie;
        this.llumNatural = llumNatural;
        this.consumElectric = consumElectric;
    }

    public double calcularConsumTotal() {
        return superficie * consumElectric;
    }

    public abstract double calcularEspaiPerEstudiant();
}
