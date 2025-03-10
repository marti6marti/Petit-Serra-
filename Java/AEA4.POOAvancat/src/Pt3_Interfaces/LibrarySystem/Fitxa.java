package Pt3_Interfaces.LibrarySystem;

import java.util.Date;

public abstract class Fitxa {
    public String codi;
    public String titol;
    public int anypublicat;

    public Fitxa(String codi, String titol, int anypublicat) {
        this.codi = codi;
        this.titol = titol;
        this.anypublicat = anypublicat;
    }

    public String getCodi() {
        return codi;
    }

    public int getAnypublicat() {
        return anypublicat;
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "codi='" + codi + '\'' +
                ", titol='" + titol + '\'' +
                ", anypublicat=" + anypublicat +
                '}';
    }
}
