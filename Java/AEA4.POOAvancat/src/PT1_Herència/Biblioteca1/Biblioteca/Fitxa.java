package PT1_Herència.Biblioteca1.Biblioteca;

import java.util.Objects;

public class Fitxa {
    public String referencia;
    public String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fitxa fitxa)) return false;
        return Objects.equals(referencia, fitxa.referencia);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(referencia);
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                '}';
    }
}
