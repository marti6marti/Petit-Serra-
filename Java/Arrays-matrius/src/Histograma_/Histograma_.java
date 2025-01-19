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

//        for (int i = 0; i < 20; i++) {
//            System.out.print(pesos[i] + " ");
//        }
//        System.out.println();

        int[] repetits = new int[20];
        int norepetit = 0;
        int[] valorsdelsrepetits = new int[20];

        for (int i = 0; i < 20; i++) {
            if (i == 0 || pesos[i] != pesos[i - 1]) {
                repetits[norepetit] = 1;
                valorsdelsrepetits[norepetit] = pesos[i];
                norepetit++;
            }else {
               repetits[norepetit -1]++;
            }
        }

//        for (int j = 0; j < norepetit; j++) {
//            System.out.print(repetits[j] + " ");
//        }

        for (int i = 0; i < repetits.length; i++) {
            if (!(repetits[i] == 0)) {
                System.out.print( valorsdelsrepetits[i] + " ");
                for (int j = 0; j < repetits[i]; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
