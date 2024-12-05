package Lista2;

import java.util.Scanner;

public class Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean hisPrimo;

        if (N < 1) {
            System.out.println("FALSE");
        } else if (N == 2) {
            System.out.println("TRUE");
        }  else if (N == 1) {
            System.out.println("TRUE");
        } else {
            hisPrimo=true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0 ) {
                    hisPrimo = false;
                    break;
                }
            }
            if (hisPrimo) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }
}
