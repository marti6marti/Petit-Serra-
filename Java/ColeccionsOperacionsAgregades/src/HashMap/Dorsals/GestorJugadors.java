package HashMap.Dorsals;

import java.util.*;

public class GestorJugadors {
    private HashMap<Integer, Jugador> jugadorsHashMap;

    public GestorJugadors(HashMap<Integer, Jugador> jugadorsHashMap) {
        this.jugadorsHashMap = jugadorsHashMap;
    }

    public GestorJugadors() {
        jugadorsHashMap = new HashMap<>();
    }

    public HashMap<Integer, Jugador> getJugadorsHashMap() {
        return jugadorsHashMap;
    }

    public void setJugadorsHashMap(HashMap<Integer, Jugador> jugadorsHashMap) {
        this.jugadorsHashMap = jugadorsHashMap;
    }

    public void afegirJugador(Integer dorsal, Jugador jugador) {
        jugadorsHashMap.put(dorsal, jugador);
        System.out.println("Jugador afegit correctament.");
    }

    public Jugador obtenirJugadorPerDorsal(Integer dorsal) {
        System.out.println(jugadorsHashMap.get(dorsal));
        return jugadorsHashMap.get(dorsal);
    }

    public void obtenirJugadorsPerNom(String nomJugador) {
        ArrayList<Jugador> llistaJugadors = new ArrayList<>();
        for (Map.Entry<Integer, Jugador> item : jugadorsHashMap.entrySet()) {
            if (item.getValue().getNom().equalsIgnoreCase(nomJugador)) {
                llistaJugadors.add(item.getValue());
            }
        }
        for (Jugador j : llistaJugadors) {
            System.out.println(j);
        }
    }

    public void mostrarTotsElsJugadors() {
        List<Map.Entry<Integer, Jugador>> llistaJugadors = new ArrayList<>(jugadorsHashMap.entrySet());
        llistaJugadors.sort(Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<Integer, Jugador> entry : llistaJugadors) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void mostrarJugadorsPerEdat() {
        List<Map.Entry<Integer, Jugador>> llistaJugadors = new ArrayList<>(jugadorsHashMap.entrySet());
        llistaJugadors.sort(Comparator.comparing(entry -> entry.getValue().getEdat()));

        for (Map.Entry<Integer, Jugador> entry : llistaJugadors) {
            System.out.println(entry.getValue());
        }
    }

    public void mostrarJugadorsPerPosicio() {
        List<Map.Entry<Integer, Jugador>> llistaJugadors = new ArrayList<>(jugadorsHashMap.entrySet());
        llistaJugadors.sort(Comparator.comparing(entry -> entry.getValue().getPosicio()));

        for (Map.Entry<Integer, Jugador> entry : llistaJugadors) {
            System.out.println(entry.getValue());
        }
    }
}
