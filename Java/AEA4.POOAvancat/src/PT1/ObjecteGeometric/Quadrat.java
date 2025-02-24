package PT1.ObjecteGeometric;

public class Quadrat extends ObjecteGeometric{
    public double costat;

    public Quadrat(int coord_x, int coord_y, String color, double costat) {
        super(coord_x, coord_y, color);
        this.costat = costat;
    }



    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                "} " + super.toString();
    }
    public double perimetre(){
        return costat*costat;
    }

    public double area(){
        return 4*costat;
    }
}
