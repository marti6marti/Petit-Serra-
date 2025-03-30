package model.person;

public abstract class Persona {
    private String nom;
    private int tel;


    public Persona(String nom, int tel) {
        this.nom = nom;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }
    public int getTel() {
        return tel;
    }

    public abstract boolean potFerReserva();

}
