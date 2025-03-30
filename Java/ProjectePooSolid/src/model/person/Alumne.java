package model.person;

public class Alumne extends Persona {
    private String curs;

    public Alumne(String nom, int tel, String curs) {
        super(nom, tel);
        this.curs = curs;
    }

    @Override
    public boolean potFerReserva() {
        return true;
    }

    @Override
    public String toString() {
        return "model.person.Alumne{" +
                "nom='" + getNom() + '\'' +
                ", tel=" + getTel() +
                ", curs='" + curs + '\'' +
                '}';
    }
}
