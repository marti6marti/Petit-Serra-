package ex7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacio> habitacions;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        habitacions = new ArrayList<Habitacio>();
        reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Habitacio> getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(ArrayList<Habitacio> habitacions) {
        this.habitacions = habitacions;
    }

    public void novaReserva (LocalDate entrada, LocalDate sortida){
        Reserva reserva = new Reserva(entrada,sortida);
        reservas.add(reserva);
        System.out.println("S'ha reservat amb éxit");
    }



    @Override
    public String toString() {
        return "Hotel{" +
                "habitacions=" + habitacions +
                ", reservas=" + reservas +
                '}';
    }
}

