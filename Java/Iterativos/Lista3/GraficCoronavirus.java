package Lista3;

import java.util.Scanner;

public class GraficCoronavirus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();
        int MG = 0;
        int GR = 0;
        int NO = 0;
        int LL = 0;
        int ML = 0;
        String caracter = "#";

        while (numberInput != -1){
            if (numberInput>=200){
                MG++;
            } else if (numberInput>=150) {
                GR++;
            } else if (numberInput>=100) {
                NO++;
            } else if (numberInput>=50) {
                LL++;
            } else if (numberInput>=0) {
                ML++;
            }
            numberInput = input.nextInt();
        }
        System.out.println("MG: " + caracter.repeat(MG));
        System.out.println("GR: " + caracter.repeat(GR));
        System.out.println("NO: " + caracter.repeat(NO));
        System.out.println("LL: " + caracter.repeat(LL));
        System.out.println("ML: " + caracter.repeat(ML));
    }
}
