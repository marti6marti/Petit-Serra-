import java.util.Scanner;

public class MatriculaPoblenou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hisFamiliaNumerosa = sc.nextBoolean();
        boolean hisMatriculaHonor = sc.nextBoolean();
        boolean hisMonoparentalNormal = sc.nextBoolean();
        boolean hisMonoparentalEspecial = sc.nextBoolean();
        int edadAlumno = sc.nextInt();
        boolean hisMatriculaCompleta = sc.nextBoolean();
        int numeroUf = sc.nextInt();

        int precioBase = 440;

        if (!hisMatriculaCompleta) {
            precioBase = numeroUf * 25;
            if (precioBase > 440) {
                precioBase = 440;
            }
            System.out.println(precioBase);
            return;
        }

        if (edadAlumno>27  ) {
            precioBase = (int) (precioBase * 0.10);
            System.out.println(precioBase);

        } else if (hisMonoparentalEspecial) {
            precioBase = (int) (precioBase*0.20);
            System.out.println(precioBase);

        } else if (hisMatriculaHonor) {
            precioBase = precioBase-80;
            System.out.println(precioBase);

        } else if (hisFamiliaNumerosa || hisMonoparentalNormal) {
            precioBase= precioBase/2;
            System.out.println(precioBase);

        }
    }
}
