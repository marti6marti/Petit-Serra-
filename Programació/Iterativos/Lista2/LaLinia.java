package Lista2;

import java.util.Scanner;

public class LaLinia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N>=0){
            for (int i = 0; i < N; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("N ha de ser NO negatiu");
        }
    }
}
