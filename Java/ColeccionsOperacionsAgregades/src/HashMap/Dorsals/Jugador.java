package HashMap.Dorsals;

public class Jugador {
    private String nom;
    private int edat;
    private String posicio;

    public Jugador(String nom, int edat, String posicio) {
        this.nom = nom;
        this.edat = edat;
        this.posicio = posicio;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getPosicio() {
        return posicio;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", posicio='" + posicio + '\'' +
                '}';
    }
}
