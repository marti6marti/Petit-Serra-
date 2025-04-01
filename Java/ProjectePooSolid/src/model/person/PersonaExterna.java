package model.person;

public class PersonaExterna extends Persona {


    public PersonaExterna(String nom, int tel) {
        super(nom, tel);
    }

    @Override
    public boolean potFerReserva() {
        return true;
    }

    @Override
    public String toString() {
        return "PersonaExterna{" +
                "nom='" + getNom() + '\'' +
                ", tel=" + getTel() +
                '}';
    }
}
