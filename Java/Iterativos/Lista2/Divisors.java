package Lista2;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N>0) {
            for (int i = 1; i <= N; i++) {
                if (N%i==0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Escribe un numero mayor a 0");
        }
    }
}
