package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscarReservesNom {

    public List<Reserva> buscarReservesPerNom(Institut ins, String nomPersona) {
        List<Reserva> reservesTrobades = new ArrayList<>();

        for (Reserva reserva : ins.getReserves()) {
            if (reserva.getPersona().getNom().equalsIgnoreCase(nomPersona)) {
                reservesTrobades.add(reserva);
            }
        }
        return reservesTrobades;
    }
}
