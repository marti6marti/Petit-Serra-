package MatriuSimetrica;

import java.util.Scanner;

public class MatriuSimetrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //matriu 1
        int tamanyx1 = sc.nextInt();
        int[][] matriu1 = new int[tamanyx1][tamanyx1];
        for (int i = 0; i < tamanyx1; i++) {
            for (int j = 0; j < tamanyx1; j++) {
                matriu1[i][j] = sc.nextInt();
            }
        }


        String resultat = ".";
        for (int i = 0; i < tamanyx1; i++) {
            for (int j = 0; j < tamanyx1; j++) {
                if (matriu1[i][j] == matriu1[j][i]){
                    resultat = "TRUE";
                } else {
                    resultat = "FALSE";
                    System.out.println(resultat);
                    break;
                }
            }
            if (resultat == "FALSE"){
                break;
            }
        }
        if (resultat == "TRUE") {
            System.out.println(resultat);
        }

    }
}
