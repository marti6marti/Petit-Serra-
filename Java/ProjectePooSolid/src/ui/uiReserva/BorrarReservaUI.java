package ui.uiReserva;

import model.institute.Institut;
import service.serviceReserva.BorrarReserva;
import service.serviceReserva.DelReserva;

import java.util.Scanner;

public class BorrarReservaUI implements DelReserva {
    private Scanner scanner = new Scanner(System.in);
    private BorrarReserva borrarReserva = new BorrarReserva();

    public void borrarReserva(Institut ins) {
        System.out.println("Introdueix el id de la reserva que vols eliminar: ");
        int id = scanner.nextInt();

        boolean eliminado = borrarReserva.borrarReserva(ins, id);

        if (eliminado) {
            System.out.println("Reserva amb ID " + id + " eliminada amb èxit.");
        } else {
            System.out.println("No s'ha trobat cap reserva amb ID " + id);
        }
    }
}
