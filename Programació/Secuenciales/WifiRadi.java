import java.util.Scanner;

public class WifiRadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float areaTotal  = input.nextFloat();
        float result = (float) (Math.sqrt(areaTotal/Math.PI));
        System.out.println(Math.round(result));
    }
}
