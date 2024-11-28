package Ex5;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();

        triangle1.setSide1(3);
        triangle1.setSide2(4);
        triangle1.setSide3(5);

        triangle1.perimetre();
        triangle1.area();

    }
}
