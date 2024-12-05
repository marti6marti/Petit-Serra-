package Lista2;

import java.util.Scanner;

public class ElQuadratBuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalAsteriscos = N*N;

        if (N>=0){
            for (int i = 1; i <= totalAsteriscos; ++i) {
                if (i < N) {
                    System.out.print("*");
                } else if (i%N == 0 ) {
                    System.out.println("*");
                } else if (i%N == 1 ) {
                    System.out.print("*");
                } else if (totalAsteriscos-N < i ) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        } else {
            System.out.println("N ha de ser NO negatiu");
        }
    }
}
