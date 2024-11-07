package Lista1;

import java.util.Scanner;

public class CopiesAutomatiques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int numero = sc.nextInt();
        for (int i = 0; i<numero; i++) {
            System.out.println(texto);
        }
    }
}
