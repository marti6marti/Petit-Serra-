package RepetitsArray;

import java.util.Scanner;

public class RepetitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vots = new int[20];
        int nombreVotants = sc.nextInt();


        for (int i = 0; i < nombreVotants; i++) {
            int partit = sc.nextInt();
            vots[partit - 1]++;
        }


        int partitMesVotat = 0;
        int maxVots = 0;

        for (int i = 0; i < 20; i++) {
            if (vots[i] > maxVots) {
                maxVots = vots[i];
                partitMesVotat = i + 1;
            }
        }
        System.out.println(partitMesVotat);
    }
}
