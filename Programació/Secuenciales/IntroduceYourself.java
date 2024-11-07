import java.util.Scanner;

public class IntroduceYourself {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String lastName = input.nextLine();
        String age = input.nextLine();
        String course = input.nextLine();
        System.out.println("Hola em dic " + name +" " + lastName + ", tinc " + age + " anys i realitzo el cicle formatiu de " + course);
    }
}
