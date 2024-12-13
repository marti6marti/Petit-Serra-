package ex7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Reserva {
    private LocalDate entrada;
    private LocalDate sortida;
    private Habitacio habitacio;

    public Reserva(LocalDate entrada, LocalDate sortida) {
        this.entrada = entrada;
        this.sortida = sortida;
        this.habitacio = habitacio;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSortida() {
        return sortida;
    }

    public void setSortida(LocalDate sortida) {
        this.sortida = sortida;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public void setHabitacio(Habitacio habitacio) {
        this.habitacio = habitacio;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "entrada=" + entrada +
                ", sortida=" + sortida +
                ", habitacio=" + habitacio +
                '}';
    }

    
