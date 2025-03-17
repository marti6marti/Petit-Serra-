package Pt3_Interfaces.CosGeometric;

public final class Cilindre extends Figura3D implements Calculs3D {
    private double radi;
    private double altura;

    public Cilindre(int idFigura, double radi, double altura) {
        super(idFigura);
        this.radi = radi;
        this.altura = altura;
    }

    @Override
    public double perimetre(){
        return 2*Math.PI*radi;
    }

    @Override
    public double area(){
        return (2*Math.PI*radi*radi) + perimetre()*altura ;
    }

    @Override
    public double volum() {
        return Math.PI*radi*radi*altura;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindre{" +
                "idFigura=" + idFigura +
                ", radi=" + radi +
                ", altura=" + altura +
                '}';
    }
}
