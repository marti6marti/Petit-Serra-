import java.util.Scanner;

public class NouCursV2 {
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

        int capacidadTotalAlumnos = ((N * A) * P);
        if (N>0 && A>0 && P>0 && M>0) {
            int alumnosSobrantes = M%capacidadTotalAlumnos;
            if ( M > capacidadTotalAlumnos) {
                int X = alumnosSobrantes/(N*A);
                if (alumnosSobrantes%(N*A) != 0) {
                    X+=1;
                }
                System.out.println("Calen "+ X +" plantes per acollir tots els alumnes matriculats");
            } else {
                int X = (capacidadTotalAlumnos-M)/(N*A);
                System.out.println("A l'institut sobren "+X+" plantes");
            }
        }
        else{
            System.out.println("Error dades introduides no valides");
        }
    }
}
