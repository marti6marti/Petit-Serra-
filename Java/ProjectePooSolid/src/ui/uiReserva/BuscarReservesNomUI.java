package ui.uiReserva;

import model.booking.Reserva;
import model.institute.Institut;
import service.serviceReserva.BuscarReservesNom;
import service.serviceReserva.SearchReservesNom;

import java.util.List;
import java.util.Scanner;

public class BuscarReservesNomUI implements SearchReservesNom {
    private Scanner scanner = new Scanner(System.in);
    private BuscarReservesNom buscarReservesNom = new BuscarReservesNom();

    public void buscarReservesNom(Institut ins) {
        System.out.println("Introdueix el nom de la persona per buscar les seves reserves: ");
        String nomPersona = scanner.next();

        List<Reserva> reservesTrobades = buscarReservesNom.buscarReservesPerNom(ins, nomPersona);

        if (reservesTrobades.isEmpty()) {
            System.out.println("No hi ha reserves amb aquest nom: " + nomPersona);
        } else {
            System.out.println("\nReserves trobades per " + nomPersona + ":");
            reservesTrobades.forEach(System.out::println);
        }
    }
}