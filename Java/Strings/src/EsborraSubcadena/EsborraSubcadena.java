package EsborraSubcadena;

import java.util.Scanner;

public class EsborraSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String eliminar = sc.nextLine();

        int posicio = text.indexOf(eliminar);

        if (posicio != -1) {
            String resultat = text.substring(0, posicio) + text.substring(posicio + eliminar.length());
            System.out.println(resultat);
        } else {
            System.out.println(text);
        }
    }
}
