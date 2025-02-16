package Arrays;

import java.util.*;

public class fusio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//array 1

        int espai1 = sc.nextInt();
        int[] array1 = new int[espai1];

        for (int i = 0; i < espai1; i++) {
            int valor = sc.nextInt();
            array1[i]=valor;
        }
//array 2

        int espai2 = sc.nextInt();
        int[] array2 = new int[espai2];

        for (int i = 0; i < espai2; i++) {
            int valor = sc.nextInt();
            array2[i]=valor;
        }
//array 1+2 = array 3

        int sum = espai1 + espai2;
        int[] array3 = new int[sum];

        for (int i = 0; i < espai1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < espai2; i++) {
            array3[i+espai1] = array2[i];
        }

        Arrays.sort(array3);
        for (int i = 0; i < sum; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}