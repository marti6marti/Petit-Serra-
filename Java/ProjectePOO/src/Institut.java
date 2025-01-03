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

    public String mostrarespais() {
        for (int i = 0; i < espais.size(); i++) {
            System.out.println(espais.get(i));
        }
        return "";
    }

    public String mostrapersones() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
        return "";
    }

    public String mostrareservas() {
        for (int i = 0; i < reserves.size(); i++) {
            System.out.println(reserves.get(i));
        }
        return "";
    }

    public void borrarReserva(int id) {
        boolean trobat = false;

        for (int i = 0; i < reserves.size(); i++) {
            if (reserves.get(i).getId() == id) {
                reserves.remove(i);
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
