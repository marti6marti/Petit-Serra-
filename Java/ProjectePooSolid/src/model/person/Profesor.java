package model.person;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nom, int tel, String especialitzacio) {
        super(nom, tel);
        this.materia = especialitzacio;
    }

    @Override
    public boolean potFerReserva() {
        return true;
    }

    @Override
    public String toString() {
        return "model.person.Profesor{" +
                "nom='" + getNom() + '\'' +
                ", tel=" + getTel() +
                ", materia='" + materia + '\'' +
                '}';
    }
}
