package Ex7;

public class ComptadorCiclicDosDigitsTest {
    public static void main(String[] args) {
        ComptadorCiclicDosDigits ComptadorCiclicDosDigits = new ComptadorCiclicDosDigits();


        System.out.println("Inici del comptador: " + ComptadorCiclicDosDigits.obtenirValor());


        for (int i = 0; i < 33; i++) {
            ComptadorCiclicDosDigits.incrementar();
            System.out.println("Comptador sumant 1: " + ComptadorCiclicDosDigits.obtenirValor());
        }


        ComptadorCiclicDosDigits.setposarAZero();
        System.out.println("Comptador a zero: " + ComptadorCiclicDosDigits.obtenirValor());
    }
}
