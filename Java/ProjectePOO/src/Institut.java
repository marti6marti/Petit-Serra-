import java.util.ArrayList;

public class Institut {
    private String nom;
    private ArrayList<Espai> espais;
    private ArrayList<Reserva> reservas;
    private ArrayList<Persona> personas;

    public Institut(String nom) {
        this.nom = nom;
        this.espais = espais;
        this.reservas = reservas;
        this.personas = personas;
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

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void addEspai(Espai espai) {

    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Institut{" +
                "nom='" + nom + '\'' +
                ", espais=" + espais +
                ", reservas=" + reservas +
                ", personas=" + personas +
                '}';
    }
}
