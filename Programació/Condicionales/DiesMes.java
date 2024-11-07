import java.util.Scanner;

public class DiesMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio%100 != 0) || anio%400==0  && mes == 2){
            System.out.println(29);
        } else if (mes == 1){
            System.out.println(31);
        }  else if (mes == 2){
            System.out.println(28);
        }  else if (mes == 3){
            System.out.println(31);
        }  else if (mes == 4){
            System.out.println(30);
        }  else if (mes == 5){
            System.out.println(31);
        }  else if (mes == 6){
            System.out.println(30);
        }  else if (mes == 7){
            System.out.println(31);
        }  else if (mes == 8){
            System.out.println(31);
        }  else if (mes == 9){
            System.out.println(30);
        }  else if (mes == 10){
            System.out.println(31);
        }  else if (mes == 11){
            System.out.println(30);
        }  else if (mes == 12){
            System.out.println(31);
        }
    }
}
