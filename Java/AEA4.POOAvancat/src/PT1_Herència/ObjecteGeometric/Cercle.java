package PT1_Herència.ObjecteGeometric;

public class Cercle extends ObjecteGeometric{
    private int radi;

    public Cercle(int coord_x, int coord_y, String color, int radi) {
        super(coord_x, coord_y, color);
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                "} " + super.toString();
    }

    public double perimetre(){
        return (2 * Math.PI * radi);
    }

    public double area(){
        return Math.PI * Math.pow(radi, 2);
    }
}
