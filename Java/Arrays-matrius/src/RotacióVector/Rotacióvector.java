package RotacióVector;

import java.util.Scanner;

public class Rotacióvector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posisions = sc.nextInt();
        String direccio = sc.next();

        int espai1 = sc.nextInt();
        int[] array1 = new int[espai1];

        for (int i = 0; i < espai1; i++) {
            int valor = sc.nextInt();
            array1[i]=valor;
        }

        int[] array2 = new int[espai1];

        if (direccio.equals("e")){
            for (int i = 0; i < espai1; i++) {
                array2[i] = array1[(posisions +i)%espai1];
            }
            for (int i = 0; i < espai1; i++) {
                System.out.print(array2[i] + " ");
            }
        }else {
            for (int i = 0; i < espai1; i++) {
                array2[i] = array1[(posisions +i)%espai1];
            }
            for (int i = 0; i < espai1; i++) {
                System.out.print(array2[i] + " ");
            }
        }


    }
}
