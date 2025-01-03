import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaTest {
    public static void main(String[] args) {
        Institut poblenou = new Institut("Poblenou");

        Espai biblioteca = new Espai("Biblioteca",10);
        Espai aulaReunions = new Espai("Aula de reunions",2.5);
        Espai menjador = new Espai("Menjador",15);

        poblenou.addEspai(biblioteca);
        poblenou.addEspai(aulaReunions);
        poblenou.addEspai(menjador);

        Alumne alumne1 = new Alumne("Martí", 123456789, "2º ESO");
        Profesor profesor1 = new Profesor("Joan", 987654321, "Matemàticas");
        PersonaExterna visitant1 = new PersonaExterna("Miquel", 567890123);
        poblenou.addPersona(alumne1);
        poblenou.addPersona(profesor1);
        poblenou.addPersona(visitant1);

        Reserva reserva1 = new Reserva(alumne1, biblioteca,LocalDateTime.of(2025, 1, 9, 15, 0),LocalDateTime.of(2025, 1, 9, 17, 0));
        Reserva reserva2 = new Reserva(profesor1, menjador,LocalDateTime.of(2025, 1, 10, 9, 0), LocalDateTime.of(2025, 1, 10, 10, 0));
        poblenou.addReserva(reserva1);
        poblenou.addReserva(reserva2);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("\nMenú del Instituto:");
            System.out.println("1. Espais disponibles");
            System.out.println("2. Añadir espacio");
            System.out.println("3. Hacer una reserva");
            System.out.println("4. Mostrar todas las reservas");
            System.out.println("5. Mostrar espacios disponibles");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("hola");
                    break;
            }
        }

    }
}
