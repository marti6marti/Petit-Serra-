package Pt3_Interfaces.CosGeometric;

public final class Piramide extends Figura3D {
    private double base;
    private double altura;

    public Piramide(int idFigura, double base, double altura) {
        super(idFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetre() {
        return 4*base;
    }

    @Override
    public double area() {
        return base*base + 2*base*altura;
    }

    @Override
    public double volum() {
        return base*base*altura/3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "idFigura=" + idFigura +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
