package ex1;

public class Cuina {
    private boolean esIndependent;
    private int nombreDeFogons;

    public Cuina(boolean esIndependent, int nombreDeFogons) {
        this.esIndependent = esIndependent;
        this.nombreDeFogons = nombreDeFogons;
    }

    public Cuina(){
        this.nombreDeFogons = 0;
        this.esIndependent = false;
    }

    public boolean isEsIndependent() {
        return esIndependent;
    }

    public void setEsIndependent(boolean esIndependent) {
        this.esIndependent = esIndependent;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }

    public void setNombreDeFogons(int nombreDeFogons) {
        this.nombreDeFogons = nombreDeFogons;
    }

    @Override
    public String toString() {
        return "Cuina{" +
                "esIndependent=" + esIndependent +
                ", nombreDeFogons=" + nombreDeFogons +
                '}';
    }
}
