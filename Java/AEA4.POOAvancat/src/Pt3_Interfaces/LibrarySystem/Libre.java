package Pt3_Interfaces.LibrarySystem;

public class Libre extends Fitxa implements Prestable{
    public boolean prestat = false;

    public Libre(String codi, String titol, int anypublicat, boolean prestat) {
        super(codi, titol, anypublicat);
        this.prestat = prestat;
    }

    public boolean isPrestat() {
        return prestat;
    }

    @Override
    public String toString() {
        return "Libre{" +
                "prestat=" + prestat +
                "} " + super.toString();
    }

    @Override
    public void prestar() {
        prestat = true;
    }

    @Override
    public void tornar() {
        prestat = false;
    }

    @Override
    public boolean prestat() {
        return isPrestat();
    }
}
