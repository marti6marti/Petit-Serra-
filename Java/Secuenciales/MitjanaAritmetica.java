import java.util.Scanner;

public class MitjanaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float num4 = input.nextFloat();
        float pon1 = input.nextFloat();
        float pon2 = input.nextFloat();
        float pon3 = input.nextFloat();
        float pon4 = input.nextFloat();
        float sol = (float) ((num1*(pon1/100)) + (num2*(pon2/100)) + (num3*(pon3/100)) + (num4*(pon4/100))) ;
        System.out.println(Math.round(sol));
    }

}
