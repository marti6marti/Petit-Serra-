package Lista3;

import java.util.Scanner;

public class BanderaSantJordi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();

        for (int i = 0; i < numberInput; i++) {
            for (int j = 0; j < numberInput; j++) {
                if (i == numberInput/2){
                    System.out.print("- ");
                } else if (j == numberInput/2) {
                    System.out.print("| ");
                } else {
                    System.out.print("% ");
                }
            }
            System.out.println("");
        }
    }
}
