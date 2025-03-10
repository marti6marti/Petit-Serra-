package PT1_Herència.ObjecteGeometric;

public class ObjecteGeometric {
    public int coord_x;
    public int coord_y;
    public String color;

    public ObjecteGeometric(int coord_x, int coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }
}
