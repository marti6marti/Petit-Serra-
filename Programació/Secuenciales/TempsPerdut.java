import java.util.Scanner;

public class TempsPerdut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segunRetar = input.nextInt();
        int segTotPerYear = segunRetar*165;
        int horaTot = segTotPerYear/3600;
        int minTot = segTotPerYear%3600/60;
        int segTot =  (segTotPerYear%3600) % 60;
        System.out.println(horaTot);
        System.out.println(minTot);
        System.out.println(segTot);
    }
}
