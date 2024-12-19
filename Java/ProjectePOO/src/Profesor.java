public class Profesor extends Persona{
    private String especialitzacio;

    public Profesor(String nom, int tel, String especialitzacio) {
        super(nom, tel);
        this.especialitzacio = especialitzacio;
    }

    public String getEspecialitzacio() {
        return especialitzacio;
    }

    public void setEspecialitzacio(String especialitzacio) {
        this.especialitzacio = especialitzacio;
    }
}
