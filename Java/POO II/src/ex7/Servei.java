package ex7;

public class Servei {
    private String servei;

    public Servei(String servi) {
        this.servei = servi;
    }

    public String getServi() {
        return servei;
    }

    public void setServi(String servi) {
        this.servei = servi;
    }

    @Override
    public String toString() {
        return "Servei{" +
                "servi='" + servei + '\'' +
                '}';
    }
}