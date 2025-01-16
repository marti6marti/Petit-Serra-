package Histograma_;

import java.util.Arrays;
import java.util.Scanner;

public class Histograma_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pesos = new int[20];
        for (int i = 0; i < 20; i++) {
            int pes = sc.nextInt();
            pesos[i] = pes;
        }
        Arrays.sort(pesos);

        for (int i = 0; i < 20; i++) {
            System.out.print(pesos[i] + " ");
        }



        int repetit = 0;
        for (int i = 0; i < 20; i++) {
            if (pesos[i] == pesos[i+1]) {
                repetit = repetit +1;
                // un array per reps i un array per els nums

            }
        }
    }
}
