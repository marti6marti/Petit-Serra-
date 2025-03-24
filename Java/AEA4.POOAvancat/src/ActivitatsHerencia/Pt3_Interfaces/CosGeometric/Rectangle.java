package ActivitatsHerencia.Pt3_Interfaces.CosGeometric;

public final class Rectangle extends Figura2D implements Calculs2D {
    private double base;
    private double altura;

    public Rectangle(int idFigura, double base, double altura) {
        super(idFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetre(){return 4* base;}

    @Override
    public double area(){
        return base * altura;
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
        return "Rectangle{" +
                "idFigura=" + idFigura +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}