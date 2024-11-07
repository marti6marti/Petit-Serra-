package Lista1;

import java.util.Scanner;

public class RecorregutDescendent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        if (numero1>numero2 && numero1>0){
            while (numero1>=numero2){
                System.out.println(numero1);
                numero1--;
            }

        } else{
            System.out.println("Error al introducir");
        }
    }
}
