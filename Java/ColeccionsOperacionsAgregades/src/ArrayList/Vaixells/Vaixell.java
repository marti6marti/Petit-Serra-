package ArrayList.Vaixells;

public class Vaixell {
    private String nom;
    private Float preu;
    private int edat;

    public Vaixell(String nom, Float preu, int edat) {
        this.nom = nom;
        this.preu = preu;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPreu() {
        return preu;
    }

    public void setPreu(Float preu) {
        this.preu = preu;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Vaixell{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                ", edat=" + edat +
                '}';
    }
}
