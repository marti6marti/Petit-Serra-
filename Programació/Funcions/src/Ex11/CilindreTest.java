package Ex11;

public class CilindreTest {
        public static void main(String[] args) {
            Cilindre cilindre1 = new Cilindre(5, 10);
            Cilindre cilindre2 = new Cilindre(3, 15);


            System.out.println(cilindre1);
            System.out.println(cilindre2);


            if (cilindre1.esMesGranQue(cilindre2)) {
                System.out.println("El cilindre 1 és més gran que el cilindre 2.");
            } else {
                System.out.println("El cilindre 2 és més gran que el cilindre 1.");
            }
        }
}
