package Ciutats;

import java.util.Objects;

public class Ciutat {
    public String nom;

    public Ciutat(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciutat ciutat = (Ciutat) o;
        return Objects.equals(nom, ciutat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }

    @Override
    public String toString() {
        return "Ciutat{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
