package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;
import model.person.Persona;
import model.space.Espai;
import service.serviceEspais.MostraEspais;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NovaReserva {

    public boolean verificarDisponibilitat(Institut ins, Espai espai, LocalDateTime entrada, LocalDateTime sortida) {
        for (Reserva reserva : ins.getReserves()) {
            if (reserva.getEspai().equals(espai)) {
                if ((entrada.isBefore(reserva.getSortida()) && sortida.isAfter(reserva.getEntrada())) ||
                        (entrada.isEqual(reserva.getEntrada()) || sortida.isEqual(reserva.getSortida()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public Persona buscarPersona(Institut ins, String nom) {
        for (Persona persona : ins.getPersonas()) {
            if (persona.getNom().equalsIgnoreCase(nom)) {
                return persona;
            }
        }
        return null;
    }

    public Espai buscarEspai(Institut ins, String nomEspai) {
        for (Espai espai : ins.getEspais()) {
            if (espai.getNom().equalsIgnoreCase(nomEspai)) {
                return espai;
            }
        }
        return null;
    }

    public boolean crearReserva(Institut ins, int id, Persona persona, Espai espai,
                                LocalDateTime entrada, LocalDateTime sortida) {
        if (persona == null || espai == null) {
            return false;
        }

        Reserva reserva = new Reserva(id, persona, espai, entrada, sortida);
        ins.addReserva(reserva);
        return true;
    }
}
