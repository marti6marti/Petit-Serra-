package ex7;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Habitacio habitacio1 = new Habitacio(1,"suite");
        Habitacio habitacio2 = new Habitacio(2,"Individual");
        Habitacio habitacio3 = new Habitacio(3,"simple");
        Servei servei1 = new Servei("wifi");

        hotel1.getHabitacions().add(habitacio1);
        hotel1.getHabitacions().add(habitacio2);
        hotel1.getHabitacions().add(habitacio3);

        habitacio1.getServeis().add(servei1);

        System.out.println(hotel1.getHabitacions());
        System.out.println(habitacio1.serveisisponibles());

        hotel1.novaReserva(LocalDate.of(2024,1,5),LocalDate.of(2024,1,10));


    }
}

