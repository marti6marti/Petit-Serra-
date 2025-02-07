package HashSet.Loteria;

import java.util.HashSet;
import java.util.Iterator;

public class Loteria {
    private HashSet<Integer> sac;
    private Jugador[] jugadors;

    public Loteria() {
        this.sac = new HashSet<>();
        this.jugadors = new Jugador[4];
    }

    public void crearSac() {
        for (int i = 0; i <= 100; i++) {
            sac.add(i);
        }
    }

    public void crearJugadors() {
        for (int i = 0; i < jugadors.length; i++) {
            jugadors[i] = new Jugador("DNI" + (i + 1));
            jugadors[i].generarBoleto();
        }
    }

    public void iniciarLoteria() {
        HashSet<Integer> numerosSortejats = new HashSet<>();
        boolean guanyador = false;

        System.out.println("S'inicia la loteria!");
        while (!guanyador) {
            Iterator<Integer> it = sac.iterator();
            int numero = (int) it.next();
            sac.remove(numero);
            numerosSortejats.add(numero);

            System.out.println("S'ha sortejat el número: " + numero);

            for (Jugador jugador : jugadors) {
                if (jugador.haGuanyat(numerosSortejats)) {
                    System.out.println("El guanyador és: " + jugador.getDni());
                    guanyador = true;
                    break;
                }
            }
        }
    }
}
