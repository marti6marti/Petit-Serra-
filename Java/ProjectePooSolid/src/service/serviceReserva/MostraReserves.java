package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;

public class MostraReserves {
    public void mostrareservas(Institut ins) {
        for (Reserva reserva : ins.getReserves()){
            System.out.println(reserva);
        }
    }
}
