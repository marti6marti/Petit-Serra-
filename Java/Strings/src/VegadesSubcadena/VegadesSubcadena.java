package VegadesSubcadena;

import java.util.Scanner;

public class VegadesSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String text2 = sc.nextLine();

        text = text.toLowerCase();
        text2 = text2.toLowerCase();

        int aparicions = 0;
        int posicio = text.indexOf(text2);

        while (posicio != -1) {
            aparicions++;
            posicio = text.indexOf(text2, posicio + 1);
        }

        System.out.println(aparicions);
    }
}
