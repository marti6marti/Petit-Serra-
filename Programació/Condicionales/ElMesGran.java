import java.util.Scanner;

public class ElMesGran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();

        if ((nota1>=0 && nota2>=0 && nota3>=0) && (nota1<=10 && nota2<=10 && nota3<=10)) {
            if (nota1>nota2 && nota1>nota3) {
                System.out.println(nota1);
            } else if (nota2>nota1 && nota2>nota3) {
                System.out.println(nota2);
            } else{
                System.out.println(nota3);
            }
        } else {
            System.out.println("Error en el rang de les notes");
        }
    }
}
