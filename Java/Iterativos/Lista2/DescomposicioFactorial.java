package Lista2;

import java.util.Scanner;

public class DescomposicioFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N > 0) {
            if (N % 2 == 0) {
                System.out.print("2 ");
                N /= 2;
            } else if (N % 3 == 0) {
                System.out.print("3 ");
                N /= 3;
            } else if (N % 5 == 0) {
                System.out.print("5 ");
                N /= 5;
            } else if (N % 7 == 0) {
                System.out.print("7 ");
                N /= 7;
            } else if (N % 11 == 0) {
                System.out.print("11 ");
                N /= 11;
            } else {
                break;
            }
        }
    }
}