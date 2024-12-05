package Lista2;
import java.util.Scanner;
public class LaCreu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N%2 != 0 && N>0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i==j) {
                        System.out.print("* ");
                    } else if (i+j == N-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("N ha de ser imparell i positiu");
        }
    }
}
