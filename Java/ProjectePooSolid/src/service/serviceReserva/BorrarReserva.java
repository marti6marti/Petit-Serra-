package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;

import java.util.Scanner;

public class BorrarReserva {
    public boolean borrarReserva(Institut ins, int id) {
        for (Reserva reserva : ins.getReserves()) {
            if (reserva.getId() == id) {
                ins.getReserves().remove(reserva);
                return true;
            }
        }
        return false;
    }
}
