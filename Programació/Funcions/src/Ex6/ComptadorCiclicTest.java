package Ex6;

public class ComptadorCiclicTest {
    public static void main(String[] args) {
        ComptadorCiclic ComptadorCiclic = new ComptadorCiclic();


        System.out.println("Inici del comptador: " + ComptadorCiclic.getValor());

        for (int i = 0; i < 14; i++) {
            ComptadorCiclic.setincrementar();
            System.out.println("Comptador sumant 1: " + ComptadorCiclic.getValor());
        }

        ComptadorCiclic.setposarAZero();
        System.out.println("Comptador a zero: " + ComptadorCiclic.getValor());
    }
}
