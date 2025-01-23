package BubbleSort_;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort_ {
    // An optimized version of Bubble Sort
    static void bubbleSort(int scores[], String names[], int n){
        int i, j, temp;
        String temp2;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;


                    temp2 = names[j];
                    names[j] = names[j+1];
                    names[j + 1] = temp2;


                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nEquips = new String[n];
        int[] pEquips = new int[n];

        for (int i = 0; i < nEquips.length; i++) {
            String nEquip = sc.next();
            nEquips[i] = nEquip;
            int pEquip = sc.nextInt();
            pEquips[i] = pEquip;
        }

        bubbleSort(pEquips,nEquips,n);


            for (int i = n-1; i < n ; i--) {
                if (!(i==-1)) {
                System.out.print(nEquips[i] + " ");
                System.out.println(pEquips[i]);
                } else {
                    break;
                }
            }

    }
}
