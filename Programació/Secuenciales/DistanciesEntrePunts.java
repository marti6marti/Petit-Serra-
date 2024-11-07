import java.util.Scanner;

public class DistanciesEntrePunts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int d1 = input.nextInt();
        int d2 = input.nextInt();

        float a = (float) Math.sqrt(Math.pow(a1,2) + Math.pow(a2,2));
        float b = (float) Math.sqrt(Math.pow((b1-a1),2) + Math.pow((b2-a2),2));
        float c = (float) Math.sqrt(Math.pow((c1-b1),2) + Math.pow((c2-b2),2));
        float d = (float) Math.sqrt(Math.pow((d1-c1),2) + Math.pow((d2-c2),2));
        float e = (float) Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));

        int result = Math.round(a+b+c+d+e);

        System.out.println(result);
    }
}
