package ActivitatsHerencia.Pt3_Interfaces.LibrarySystem;

public abstract class Fitxa {
    public String codi;
    public String titol;
    public int anypublicat;

    public Fitxa(String codi, String titol, int anypublicat) {
        this.codi = codi;
        this.titol = titol;
        this.anypublicat = anypublicat;
    }

    public abstract String getCodi();

    public abstract int getAnypublicat();

    @Override
    public String toString() {
        return "Fitxa{" +
                "codi='" + codi + '\'' +
                ", titol='" + titol + '\'' +
                ", anypublicat=" + anypublicat +
                '}';
    }
}
