package vocalsCadena;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase(); //tot a minuscules

        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        for (int j = 0; j < text.length(); j++) {//caracters
            if (text.charAt(j) == 'a'){ //posició
                a = true;
            } else if (text.charAt(j) == 'e') {
                e = true;
            } else if (text.charAt(j) == 'i') {
                i = true;
            } else if (text.charAt(j) == 'o') {
                o = true;
            } else if (text.charAt(j) == 'u') {
                u = true;
            }
        }

        if ((a&&e&&i&&o&&u) == true){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}