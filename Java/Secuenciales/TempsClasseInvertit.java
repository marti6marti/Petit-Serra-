import java.util.Scanner;

public class TempsClasseInvertit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int calhora = s/3600;
        int calMin =  (s%3600) / 60 ;
        int calseg = (s%3600) % 60;
        System.out.println(calhora);
        System.out.println(calMin);
        System.out.println(calseg);

    }
}
