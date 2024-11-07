package Lista2;

import java.util.Scanner;

public class NombreAmics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int sumaNumero1= 0;
        int numero2 = sc.nextInt();
        int sumaNumero2= 0;

        for (int i = 1; i < numero1; i++) {
            if (numero1%i == 0) {
                sumaNumero1+=i;
            }
            if (numero2%i==0) {
                sumaNumero2+=i;
            }

        }

        if (sumaNumero1==numero2 && sumaNumero2==numero1 ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
