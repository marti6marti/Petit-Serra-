package Lista3;

import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wordInput= input.next();

        char[] wordChangeChar = wordInput.toUpperCase().toCharArray();

        String valueList1 = "AEIOULNRST";
        char[] valueCharList1 = valueList1.toCharArray();

        String valueList2 = "DG";
        char[] valueCharList2 = valueList2.toCharArray();

        String valueList3 = "BCMP";
        char[] valueCharList3 = valueList3.toCharArray();

        String valueList4 = "FHVWY";
        char[] valueCharList4 = valueList4.toCharArray();

        String valueList5 = "K";
        char[] valueCharList5 = valueList5.toCharArray();

        String valueList6 = "JX";
        char[] valueCharList6 = valueList6.toCharArray();

        String valueList7 = "QZ";
        char[] valueCharList7 = valueList7.toCharArray();

        int numberCount= 0;


        for (int i = 0; i < wordChangeChar.length; i++) {
            for (int j = 0; j < valueCharList1.length; j++) {
                if (valueCharList1[j]==wordChangeChar[i]) {
                    numberCount+=1;
                }
            }
            for (int j = 0; j <valueCharList2.length ; j++) {
                if (valueCharList2[j]==wordChangeChar[i]) {
                    numberCount+=2;
                }
            }
            for (int j = 0; j <valueCharList3.length ; j++) {
                if (valueCharList3[j]==wordChangeChar[i]) {
                    numberCount+=3;
                }
            }
            for (int j = 0; j <valueCharList4.length ; j++) {
                if (valueCharList4[j]==wordChangeChar[i]) {
                    numberCount+=4;
                }
            }
            for (int j = 0; j <valueCharList5.length ; j++) {
                if (valueCharList5[j]==wordChangeChar[i]) {
                    numberCount+=5;
                }
            }
            for (int j = 0; j <valueCharList6.length ; j++) {
                if (valueCharList6[j]==wordChangeChar[i]) {
                    numberCount+=8;
                }
            }
            for (int j = 0; j <valueCharList7.length ; j++) {
                if (valueCharList7[j]==wordChangeChar[i]) {
                    numberCount+=10;
                }
            }

        }
        System.out.println(numberCount);
    }
}
