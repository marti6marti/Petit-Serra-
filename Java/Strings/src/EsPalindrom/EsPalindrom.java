package EsPalindrom;
import java.util.Scanner;

public class EsPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean EsPalindrom = true;
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                EsPalindrom = false;
                break;
            }
        }

        if (EsPalindrom) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
