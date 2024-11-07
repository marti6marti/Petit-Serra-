package Lista3;

import java.util.Scanner;

public class PositiusNegatius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngreso = sc.nextInt();
        int contadorPositivo = 0 ;
        int contadorNegativo= 0;

        while (numeroIngreso!=0){
            if (numeroIngreso>0){
                contadorPositivo ++;
            } else {
                contadorNegativo ++;
            }
            numeroIngreso = sc.nextInt();
        }

        if (contadorPositivo>contadorNegativo){
            System.out.println("POSITIUS");
        } else if (contadorPositivo==contadorNegativo) {
            System.out.println("IGUALS");
        } else {
            System.out.println("NEGATIUS");
        }
    }
}
