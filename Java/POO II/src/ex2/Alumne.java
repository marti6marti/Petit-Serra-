package ex2;

public class Alumne {
    private String nom;
    private String cognom;
    private int edat;
    private int dni;

    public Alumne(String nom, String cognom, int edat, int dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.dni = dni;
    }
    public Alumne() {
        this.nom = "desconegut";
        this.cognom = "desconegut";
        this.edat = 0;
        this.dni = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", dni=" + dni +
                '}';
    }
}
