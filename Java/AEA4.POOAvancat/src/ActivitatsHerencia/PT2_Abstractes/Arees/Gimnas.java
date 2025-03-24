package ActivitatsHerencia.PT2_Abstractes.Arees;

public class Gimnas extends Espai {
    private boolean dutxes;
    private int nombreGrades;

    public Gimnas(String codi, double superficie, boolean llumNatural, double consumElectric, boolean dutxes, int nombreGrades) {
        super(codi, superficie, llumNatural, consumElectric);
        this.dutxes = dutxes;
        this.nombreGrades = nombreGrades;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return (superficie + nombreGrades) / 100;
    }
}
