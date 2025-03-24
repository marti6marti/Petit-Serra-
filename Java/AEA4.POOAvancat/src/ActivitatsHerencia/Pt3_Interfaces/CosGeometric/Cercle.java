package ActivitatsHerencia.Pt3_Interfaces.CosGeometric;

public final class Cercle extends Figura2D {
    private double radi;

    public Cercle(int idFigura, double radi) {
        super(idFigura);
        this.radi = radi;
    }

    @Override
    public double perimetre(){
        return 2*Math.PI*radi;
    }

    @Override
    public double area(){
        return Math.PI*radi*radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "idFigura=" + idFigura +
                ", radi=" + radi +
                '}';
    }
}
