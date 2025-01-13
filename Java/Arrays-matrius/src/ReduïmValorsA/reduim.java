package ReduïmValorsA;

import java.util.Scanner;

public class reduim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espais = sc.nextInt();
        int[] array = new int[espais];

        for (int i = 0; i < espais; i++) {
            int valor = sc.nextInt();
            array[i]=valor;
        }

        int min = array[0];
        for (int i = 0; i < espais; i++) {
                if (array[i]<min) {
                    min=array[i];
                }
            }
        for (int i = 0; i < espais; i++) {
            System.out.print(array[i]- min + " ");
        }
    }
}
