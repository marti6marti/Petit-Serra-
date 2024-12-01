package Ex10;

public class CercleTest {
    public static void main(String[] args) {

            Cercle cercle1 = new Cercle(5);
            Cercle cercle2 = new Cercle(3);


            System.out.println(cercle1);
            System.out.println(cercle2);


            if (cercle1.esMesGranQue(cercle2)) {
                System.out.println("El cercle 1 és més gran que el cercle 2.");
            } else {
                System.out.println("El cercle 2 és més gran que el cercle 1.");
            }
    }
}
