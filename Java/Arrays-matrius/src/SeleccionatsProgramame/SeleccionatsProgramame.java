package SeleccionatsProgramame;
import java.util.Scanner;

public class SeleccionatsProgramame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Nalumnes = sc.nextInt();

        String[] noms = new String[Nalumnes];
        Float[] notes = new Float[Nalumnes];

        for (int i = 0; i < Nalumnes; i++) {
            String nom = sc.next();
            noms[i]= nom;
            Float nota = sc.nextFloat();
            notes[i]= nota;
        }

        float suma = 0;
        for (int i = 0; i < Nalumnes; i++) {
            suma += notes[i];
        }
        float mitjana = suma / Nalumnes;

        for (int i = 0; i < Nalumnes; i++) {
            if (notes[i] >= mitjana) {
                System.out.println(noms[i]);
            }
        }
    }
}
