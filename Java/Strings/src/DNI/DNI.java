package DNI;

import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dni = sc.nextInt();
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int residu = dni % 23;

        char lletra = lletres.charAt(residu);
        String nif = dni + String.valueOf(lletra);

        System.out.println(nif);
    }
}
