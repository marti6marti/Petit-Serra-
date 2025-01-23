package SenseEspais;

import java.util.Scanner;

public class SenseEspais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        text.replace(" ","");
        System.out.println(text);



    }
}
