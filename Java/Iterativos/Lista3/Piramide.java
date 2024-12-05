package Lista3;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int numberInput = input.nextInt();
            int countNumber = 1;
            String  charAste = "*";
            String spacingChar = " ";
            int countSpacingChar =numberInput/2;
            boolean validation = false;

            while (!validation){
                if (countNumber<=numberInput){
                    System.out.print(spacingChar.repeat(countSpacingChar));
                    System.out.println(charAste.repeat(countNumber));
                    countNumber+=2;
                    countSpacingChar-=1;

                } else {
                    validation = true;
                }

            }
    }
}
