package Lista3;

import java.util.Scanner;

public class MCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int nBefore=N;
        int mBefore=M;
        //MCD
        while (M!=0){
            int temporal = M;
            M = N % M;
            N = temporal;
        }

        int MCM = (nBefore * mBefore) / N;
        System.out.println(MCM);
    }
}
