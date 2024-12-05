package Lista1;

import java.util.Scanner;

public class SumesMultiplicacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int result = 0;

        if (exponente==0){
            System.out.println(1);
            return;

        } else if (exponente>0) {
            for (int i = 1; i <= exponente; i++) {
                result = result+base;
            }
        }

        System.out.println(result);
    }
}
