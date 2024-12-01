package Ex11;

public class Cercle {
    private double radi;


    public Cercle(double radi) {
        this.radi = radi;
    }


    public double getRadi() {
        return radi;
    }


    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }


    public boolean esMesGranQue(Cercle altre) {
        return this.calcularArea() > altre.calcularArea();
    }


    public String toString() {
        return "Cercle amb radi: " + radi + ", Perímetre: " + calcularPerimetre() + ", Àrea: " + calcularArea();
    }
}