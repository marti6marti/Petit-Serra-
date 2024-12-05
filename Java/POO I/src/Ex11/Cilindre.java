package Ex11;

public class Cilindre {
    private double radi;
    private double altura;
    private Cercle base;


    public Cilindre(double radi, double altura) {
        this.radi = radi;
        this.altura = altura;
        this.base = new Cercle(radi);
    }

    public double getRadi() {
        return radi;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularAreaTotal() {
        double areaBase = base.calcularArea();
        double areaLateral = 2 * Math.PI * radi * altura;
        return 2 * areaBase + areaLateral;
    }


    public double calcularVolum() {
        return base.calcularArea() * altura;
    }


    public boolean esMesGranQue(Cilindre altre) {
        return this.calcularVolum() > altre.calcularVolum();
    }


    public String toString() {
        return "Cilindre amb radi: " + radi + ", altura: " + altura +
                ", Àrea Total: " + calcularAreaTotal() +
                ", Volum: " + calcularVolum();
    }
}