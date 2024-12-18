import java.time.LocalDateTime;

public class Reserva {
    private Persona persona;
    private Espai espai;
    private LocalDateTime entrada;
    private LocalDateTime sortida;

    public Reserva(Persona persona, Espai espai, LocalDateTime entrada, LocalDateTime sortida) {
        this.persona = persona;
        this.espai = espai;
        this.entrada = entrada;
        this.sortida = sortida;
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
                "persona=" + persona +
                ", espai=" + espai +
                ", entrada=" + entrada +
                ", sortida=" + sortida +
                '}';
    }
}
