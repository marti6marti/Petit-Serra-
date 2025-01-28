package SumaMatrius;

import java.util.Scanner;

public class SumaMatrius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //matriu 1
        int tamanyx1 = sc.nextInt();
        int tamanyy1 = sc.nextInt();
        int[][] matriu1 = new int[tamanyx1][tamanyy1];
        for (int i = 0; i < tamanyx1; i++) {
            for (int j = 0; j < tamanyy1; j++) {
                matriu1[i][j] = sc.nextInt();
            }
        }
        //matriu 2
        int tamanyx2 = sc.nextInt();
        int tamanyy2 = sc.nextInt();
        int[][] matriu2 = new int[tamanyx2][tamanyy2];
        for (int i = 0; i < tamanyx2; i++) {
            for (int j = 0; j < tamanyy2; j++) {
                matriu2[i][j] = sc.nextInt();
            }
        }
        //matriu1 + matriu2 = matriu 3
        int[][] matriu3 = new int[tamanyx1][tamanyy1];

        for (int i = 0; i < tamanyx1; i++) {
            for (int j = 0; j < tamanyx1; j++) {
                matriu3[i][j] = matriu1[i][j] + matriu2[i][j];
            }
        }
        //sout matriu3
        for (int i = 0; i < tamanyx1; i++) {
            for (int j = 0; j < tamanyy1; j++) {
                System.out.print(matriu3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
