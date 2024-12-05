package Lista1;

import java.util.Scanner;

public class ControlTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <N ; i++) {
            int numerosIntroducidos = sc.nextInt();

            if (max<numerosIntroducidos){
                max = numerosIntroducidos;
            }

            if (min>numerosIntroducidos){
                min = numerosIntroducidos;
            }

        }

        System.out.println(max);
        System.out.println(min);
    }
}
