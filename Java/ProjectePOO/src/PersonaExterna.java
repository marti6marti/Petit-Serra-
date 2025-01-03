public class PersonaExterna extends Persona {


    public PersonaExterna(String nom, int tel) {
        super(nom, tel);
    }

    public String toString() {
        return "PersonaExterna{" +
                "nom='" + getNom() + '\'' +
                ", tel=" + getTel() +
                '}';
    }
}
