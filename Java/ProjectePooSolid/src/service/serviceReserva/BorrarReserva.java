package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;

import java.util.Scanner;

public class BorrarReserva {
    Scanner scanner = new Scanner(System.in);

    public void borrarReserva(Institut ins) {

        System.out.println("introdueix el id de la reserva que vols eliminar: ");
        int id = scanner.nextInt();

        boolean trobat = false;

        for(Reserva reserva : ins.getReserves()){
            if (reserva.getId() == id){
                ins.getReserves().remove(reserva);
                System.out.println("Reserva amb ID " + id + " eliminada amb èxit.");
                trobat = true;
                break;
            }
        }

        if (!trobat) {
            System.out.println("No s'ha trobat cap reserva amb ID " + id);
        }
    }
}
