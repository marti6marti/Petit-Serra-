public class Alumne extends Persona {
    private String curs;

    public Alumne(String nom, int tel, String curs) {
        super(nom, tel);
        this.curs = curs;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "curs='" + curs + '\'' +
                '}';
    }
}
