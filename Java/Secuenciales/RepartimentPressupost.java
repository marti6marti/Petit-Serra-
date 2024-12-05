import java.util.Scanner;

public class RepartimentPressupost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int impresora = input.nextInt();
        int ordenador = input.nextInt();
        int portatils = input.nextInt();
        int discDuro = input.nextInt();
        int matOfimatico = input.nextInt();

        final int PRE_IMP = 500;
        final int PRE_ORD = 400;
        final int PRE_POR = 700;
        final int PRE_DISC = 50;
        final int PRE_MAT_OFI = 300;

        int result = (impresora*PRE_IMP) + (ordenador*PRE_ORD) + (portatils*PRE_POR) + (discDuro*PRE_DISC) +         (matOfimatico*PRE_MAT_OFI);
        System.out.println(result);
    }
}
