package ActivitatsHerencia.Pt3_Interfaces.LibrarySystem;

public class Revista extends Fitxa{
    public int nombre;

    public Revista(String codi, String titol, int anypublicat, int nombre) {
        super(codi, titol, anypublicat);
        this.nombre = nombre;
    }


    @Override
    public String getCodi() {
        return codi;
    }

    @Override
    public int getAnypublicat() {
        return anypublicat;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre=" + nombre +
                "} " + super.toString();
    }
}
