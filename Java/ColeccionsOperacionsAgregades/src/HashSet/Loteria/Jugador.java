package HashSet.Loteria;

import java.util.HashSet;


public class Jugador {
    private String dni;
    private HashSet<Integer> boleto;

    public Jugador(String dni) {
        this.dni = dni;
        this.boleto = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public HashSet<Integer> getBoleto() {
        return boleto;
    }

    public void generarBoleto() {
        while (boleto.size() < 4) {
            int numero = (int) (Math.random() * 101);
            boleto.add(numero);
        }
    }

    public boolean haGuanyat(HashSet<Integer> numerosSortejats) {
        return numerosSortejats.containsAll(boleto);
    }
}
