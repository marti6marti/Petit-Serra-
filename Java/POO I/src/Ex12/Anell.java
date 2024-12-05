package Ex12;

public class Anell {
    private String model;
    private double diamentrePasDit;
    private double diamentreSeccio;

    private static final double COST_FABRICACIO = 40.0;
    private static final double PREU_OR = 10.0;
    private static final double MARGE_BENEFICI = 2.10;
    private static final double PES_ESPECIFIC_OR = 19.3;

    public Anell(String model, double diamentrePasDit, double diamentreSeccio) {
        this.model = model;
        this.diamentrePasDit = diamentrePasDit;
        this.diamentreSeccio = diamentreSeccio;
    }

    public double calcularPes() {
        double R = diamentrePasDit / 2;
        double r = diamentreSeccio / 2;
        double volum = 2 * Math.PI * Math.PI * R * Math.pow(r, 2);
        return volum * PES_ESPECIFIC_OR;
    }

    public double calcularPreuOr() {
        double pes = calcularPes();
        return pes * PREU_OR;
    }

    public double calcularPreuVenda() {
        double preuOr = calcularPreuOr();
        double costTotal = COST_FABRICACIO + preuOr;
        return costTotal * MARGE_BENEFICI;
    }


    public String toString() {
        return "Anell Model: " + model +
                "\nDiàmetre de pas de dit: " + diamentrePasDit + " mm" +
                "\nDiàmetre de la secció: " + diamentreSeccio + " mm" +
                "\nPes: " + calcularPes() + " g" +
                "\nPreu de l'or: " + calcularPreuOr() + " €" +
                "\nPreu de venda: " + calcularPreuVenda() + " €";
    }
}
