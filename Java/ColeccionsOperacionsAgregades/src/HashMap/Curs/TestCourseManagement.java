package HashMap.Curs;

import java.util.Scanner;

public class TestCourseManagement {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nGestió de Matrícula:");
            System.out.println("1. Inscriure un estudiant");
            System.out.println("2. Anul·lar matrícula d'un estudiant");
            System.out.println("3. Cercar un estudiant per ID");
            System.out.println("4. Llistar tots els estudiants");
            System.out.println("5. Sortir");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("ID Estudiant: ");
                    String id = sc.next();
                    System.out.print("Nom: ");
                    String name = sc.next();
                    System.out.print("Edat: ");
                    int age = sc.nextInt();
                    Student student = new Student(id, name, age);
                    manager.enrollStudent(student);
                    break;
                case 2:
                    System.out.print("Introdueix l'ID de l'estudiant a anul·lar: ");
                    String unenrollId = sc.next();
                    manager.unenrollStudent(unenrollId);
                    break;
                case 3:
                    System.out.print("Introdueix l'ID de l'estudiant per cercar: ");
                    String searchId = sc.next();
                    manager.findStudentById(searchId);
                    break;
                case 4:
                    manager.listAllStudents();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Sortint del programa...");
            }
        }
    }
}
