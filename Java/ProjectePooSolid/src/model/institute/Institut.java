package model.institute;

import model.booking.Reserva;
import model.person.Persona;
import model.space.Espai;

import java.util.ArrayList;

public class Institut {
    private String nom;
    private ArrayList<Espai> espais;
    private ArrayList<Reserva> reserves;
    private ArrayList<Persona> personas;

    public Institut(String nom) {
        this.nom = nom;
        this.espais = new ArrayList<>();
        this.reserves = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Espai> getEspais() {
        return espais;
    }

    public void setEspais(ArrayList<Espai> espais) {
        this.espais = espais;
    }

    public ArrayList<Reserva> getReserves() {
        return reserves;
    }

    public void setReserves(ArrayList<Reserva> reserves) {
        this.reserves = reserves;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void addEspai(Espai espai) {
        espais.add(espai);
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public void addReserva(Reserva reserva) {
        reserves.add(reserva);
    }


}
