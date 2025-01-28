package Pangrama_;

import java.util.Scanner;

public class Pangrama_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        String opcions = "abcdefghijklmnopqrstuvwxyz";
        String[] trobar = new String[opcions.length()];

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < opcions.length(); j++) {
                if (text.charAt(i) == opcions.charAt(j)) {
                    trobar[j] = String.valueOf(opcions.charAt(j));
                    break;
                }
            }
        }
        boolean esPangrama = true;
        for (String lletra : trobar) {
            if (lletra == null) {
                esPangrama = false;
                break;
            }
        }
        if (esPangrama) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
