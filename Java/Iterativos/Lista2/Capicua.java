package Lista2;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int numeroInverso = 0;
        int nOperando = N;
        int cifra = 0;
        while (nOperando>0) {
            cifra = nOperando%10;
            numeroInverso = cifra + numeroInverso * 10;
            nOperando /= 10;
        }

        if (N==numeroInverso) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
