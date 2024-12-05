import java.util.Scanner;

public class MajorEdat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edadNacimiento = sc.nextInt();

        int edadNum = 2022-edadNacimiento;

        if ( edadNum < 18) {
            System.out.println(nombre + " te " + edadNum + " anys i es menor d'edat.");
        } else {
            System.out.println(nombre + " te " + edadNum + " anys i es major d'edat.");
        }
    }
}
