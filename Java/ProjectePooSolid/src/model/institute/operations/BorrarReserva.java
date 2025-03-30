package model.institute.operations;

public class BorrarReserva {


    public void borrarReserva(int id) {
        boolean trobat = false;

        for (int i = 0; i < reserves.size(); i++) {
            if (reserves.get(i).getId() == id) {
                reserves.remove(i);
                System.out.println("model.booking.Reserva amb ID " + id + " eliminada amb èxit.");
                trobat = true;
                break;
            }
        }


        if (!trobat) {
            System.out.println("No s'ha trobat cap reserva amb ID " + id);
        }
    }
}
