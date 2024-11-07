package Lista2;

import java.util.Scanner;

public class ElQuadratPle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalAsteriscos = N*N;

        if (N>=0){
            for (int i = 1; i <= totalAsteriscos; i++) {
                System.out.print("*");
                if (i%N == 0){
                    System.out.println("");
                }
            }
        } else {
            System.out.println("N ha de ser NO negatiu");
        }
    }
}
