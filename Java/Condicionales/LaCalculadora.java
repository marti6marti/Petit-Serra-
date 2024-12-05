import java.util.Scanner;
public class LaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char caracter = sc.next().charAt(0);

        switch (caracter) {
            case '-':
                System.out.println(number1 - number2);
                break;
            case '+':
                System.out.println(number1 + number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("L'operacio no es valida");
        }
    }
}