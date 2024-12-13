package ex7;

import java.util.ArrayList;

public class Habitacio {
    private int numero;
    private String tipus;
    private ArrayList<Servei> serveis;


    public Habitacio(int numero, String tipus) {
        this.numero = numero;
        this.tipus = tipus;
        serveis = new ArrayList<Servei>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public ArrayList<Servei> getServeis() {
        return serveis;
    }

    public void setServeis(ArrayList<Servei> serveis) {
        this.serveis = serveis;
    }

    public ArrayList<Servei> serveisisponibles(){
        return getServeis();
    }

    @Override
    public String toString() {
        return "Habitacio{" +
                "numero=" + numero +
                ", tipus='" + tipus + '\'' +
                ", serveis=" + serveis +
                '}';
    }
}
