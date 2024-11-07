package Lista1;

import java.util.Scanner;

public class DesnivellCiclista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput ;
        int numberBefore = 0;
        int desnivelAcumulado= 0;
        boolean primeraIteracion = true;


        while ((numberInput=input.nextInt()) !=-1){
            if (!primeraIteracion) {
                if (numberInput>numberBefore){
                    desnivelAcumulado+=(numberInput-numberBefore);
                }
            } else {
                primeraIteracion = false;
            }
            numberBefore = numberInput;
        }
        if (desnivelAcumulado<=400) {
            System.out.println("ETAPA PLANA");
        } else {
            System.out.println("ETAPA MUNTANYA");
        }
    }
}
