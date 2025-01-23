package TotesLesVocals;

import java.util.Scanner;

public class TotesLesVocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) == 'a'){
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






//        String caractersABuscar = "aeiou";
//        boolean totesVocals = true;
//        for (int i = 0; i < caractersABuscar.length(); i++) {
//            if(text.indexOf(caractersABuscar.charAt(i)) == -1) {
//                totesVocals = false;
//                System.out.println("FALSE");
//                break;
//            }
//        }
//
//        if(totesVocals)System.out.println("TRUE");

//        String textA ="hola sdfsdf sdf sdf sdf sdfs dfsdfsd hola";
//        String textABuscar= "hola";
//        int pos = 0;
//        while (textA.indexOf(textABuscar, pos) != -1) {
//            System.out.println(textA.indexOf(textABuscar, pos));
//            pos = textA.indexOf(textABuscar, pos) + textABuscar.length();
//        }
//
//



    }
}
