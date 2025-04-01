package model.booking;

import model.person.Persona;
import model.space.Espai;

import java.time.LocalDateTime;

public class Reserva {
    private int id;
    private Persona persona;
    private Espai espai;
    private LocalDateTime entrada;
    private LocalDateTime sortida;

    public Reserva(int id, Persona persona, Espai espai, LocalDateTime entrada, LocalDateTime sortida) {
        this.id = id;
        this.persona = persona;
        this.espai = espai;
        this.entrada = entrada;
        this.sortida = sortida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Espai getEspai() {
        return espai;
    }

    public void setEspai(Espai espai) {
        this.espai = espai;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSortida() {
        return sortida;
    }

    public void setSortida(LocalDateTime sortida) {
        this.sortida = sortida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", persona=" + persona +
                ", espai=" + espai +
                ", entrada=" + entrada +
                ", sortida=" + sortida +
                '}';
    }
}
