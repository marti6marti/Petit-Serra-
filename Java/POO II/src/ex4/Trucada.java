package ex4;

import java.util.Objects;

public class Trucada {
    private String desti;
    private int duracio;

    public Trucada(String desti, int duracio) {
        this.desti = desti;
        this.duracio = duracio;
    }

    public String getDesti() {
        return desti;
    }

    public void setDesti(String desti) {
        this.desti = desti;
    }

    public int getDuracio() {
        return duracio;
    }

    public void setDuracio(int duracio) {
        this.duracio = duracio;
    }


    @Override
    public String toString() {
        return "Duracio= " + duracio + "  Desti= "+ desti;
    }
}