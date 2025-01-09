package arrayInvers;

import java.lang.reflect.Array;
import java.util.Scanner;

public class arrayInvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espais = sc.nextInt();
        int[] arrayEstatic = new int[espais];

        for (int i = 0; i < espais; i++) {
            int valor = sc.nextInt();
            arrayEstatic[i]=valor;
        }

        for(int i=espais; i>arrayEstatic.length; i--) {
            System.out.print(arrayEstatic[i]);
        }
    }


}
