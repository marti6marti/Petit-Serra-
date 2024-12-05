package Lista3;

import java.util.Scanner;

public class AparicioDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntrada = sc.nextInt();
        int digito = sc.nextInt();
        int cifra = 0;
        int contadorCifra= 0;
        while (numeroEntrada>0) {
            cifra = numeroEntrada%10;
            if (cifra == digito){
                contadorCifra++;
            }
            numeroEntrada/=10;
        }

        System.out.println(contadorCifra);
    }
}
