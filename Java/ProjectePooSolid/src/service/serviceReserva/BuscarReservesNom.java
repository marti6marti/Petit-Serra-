package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;

import java.util.Scanner;

public class BuscarReservesNom implements SearchReservesNom {
    Scanner scanner = new Scanner(System.in);

    public void buscarReservesNom(Institut ins){
        System.out.println("Introdueix el nom de la persona per buscar les seves reserves: ");
        String nomPersona = scanner.next();

        boolean trobat = false;
        for (Reserva reserva : ins.getReserves()) {
            if (reserva.getPersona().getNom().equalsIgnoreCase(nomPersona)) {
                System.out.println(reserva);
                trobat = true;
            }
        }

        if (!trobat) {
            System.out.println("No hi ha reserves amb aquest nom: " + nomPersona);
        }
    }
}
