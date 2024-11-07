import java.util.Scanner;

public class NouCurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Alumno por aulas
        int N = sc.nextInt();
        //aulas por planta
        int A = sc.nextInt();
        //Plantas totales que tiene el instituo
        int P = sc.nextInt();
        //Matriculados total
        int M = sc.nextInt();

        int calcularTotalAlumnos = ((N * A) * P);
        if (calcularTotalAlumnos>0) {
            if (calcularTotalAlumnos > M) {
                int X = calcularTotalAlumnos - M;
                System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben " + X);
            } else {
                int X = M - calcularTotalAlumnos;
                System.out.println("Calen " + X + " places per tots els alumnes que s'han matriculat");
            }
        }else{
            System.out.println("Error dades introduides no valides");
        }
    }
}
