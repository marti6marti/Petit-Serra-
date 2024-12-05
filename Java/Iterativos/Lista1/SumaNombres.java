package Lista1;
import java.util.Scanner;

public class SumaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumaTotal= 0;
        for (int i = 0; i <N ; i++) {
            int numerosIntroducidos = sc.nextInt();
            sumaTotal+=numerosIntroducidos;
        }
        System.out.println(sumaTotal);
    }
}
