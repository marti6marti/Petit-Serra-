package Pt3_Interfaces.LibrarySystem;

public class Revista extends Fitxa{
    public int nombre;

    public Revista(String codi, String titol, int anypublicat, int nombre) {
        super(codi, titol, anypublicat);
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "nombre=" + nombre +
                "} " + super.toString();
    }
}
