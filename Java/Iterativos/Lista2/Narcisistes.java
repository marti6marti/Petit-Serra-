package Lista2;

import java.util.Scanner;

public class Narcisistes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumTotal= 0;
        String hisNarcisista;

        for (int i = 1; i <=N ; i++) {
            if (i == N/100 ){
                int a = (int) Math.pow(i,3);
                sumTotal+=a;
            } else if (i == (N%100)/10) {
                int b = (int) Math.pow(i,3);
                sumTotal+=b;
            } else if (i == (N%100)%10) {
                int c = (int) Math.pow(i,3);
                sumTotal+=c;
            }
        }
        if (sumTotal == N) {
            hisNarcisista="TRUE";
            System.out.println(hisNarcisista);
        } else {
            hisNarcisista="FALSE";
            System.out.println(hisNarcisista);
        }
    }
}
