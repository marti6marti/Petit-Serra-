package HashSet.SCRUM;

public class Tasca {
    private String nom;
    private String descripcio;

    public Tasca(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
    }

    public String getNom() {
        return nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return "Tasca{" +
                "nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                '}';
    }
}
