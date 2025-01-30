package TextInvers;

import java.util.Scanner;

public class TextInvers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String invertit = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            invertit += input.charAt(i);
        }

        System.out.println(invertit);
    }
}
