package Lista3;

import java.util.Scanner;

public class Consecutius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput ;
        int numberBefore = 0;
        String thereAreBothNumbers="";

        while ((numberInput=input.nextInt()) !=0){
            if (numberInput==numberBefore){
                thereAreBothNumbers = "TRUE";
                break;
            } else {
                thereAreBothNumbers = "FALSE";
            }
            numberBefore = numberInput;
        }

        System.out.println(thereAreBothNumbers);
    }
}
