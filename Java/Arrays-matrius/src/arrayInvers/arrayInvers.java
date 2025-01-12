package arrayInvers;
import java.util.Scanner;

public class arrayInvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espais = sc.nextInt();
        int[] array = new int[espais];

        for (int i = 0; i < espais; i++) {
            int valor = sc.nextInt();
            array[i]=valor;
        }

        for (int i = espais - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
