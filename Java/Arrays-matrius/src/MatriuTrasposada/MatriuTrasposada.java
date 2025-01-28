package MatriuTrasposada;

import java.util.Scanner;

public class MatriuTrasposada {
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

        //matriu transposta
        int[][] matriuT = new int[tamanyy1][tamanyx1];
        for (int i = 0; i < tamanyy1; i++) {
            for (int j = 0; j < tamanyx1; j++) {
                matriuT[i][j] = matriu1[j][i];
            }
        }
        //sout matriu
        for (int i = 0; i < tamanyy1; i++) {
            for (int j = 0; j < tamanyx1; j++) {
                System.out.print(matriuT[i][j] + " ");
            }
            System.out.println();
        }
    }
}
