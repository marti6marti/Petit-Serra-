package Lista3;

import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        while (M!=0){
            int temporal = M;
            M = N % M;
            N = temporal;
        }
        System.out.println(N);
    }
}
