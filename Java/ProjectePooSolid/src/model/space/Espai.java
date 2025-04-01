package model.space;

public class Espai {
    private String Nom;
    private double metrosQ;

    public Espai(String nom, double metrosQ) {
        Nom = nom;
        this.metrosQ = metrosQ;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public double getMetrosQ() {
        return metrosQ;
    }

    public void setMetrosQ(int metrosQ) {
        this.metrosQ = metrosQ;
    }

    @Override
    public String toString() {
        return "Espai{" +
                "Nom='" + Nom + '\'' +
                ", metrosQ=" + metrosQ +
                '}';
    }
}
