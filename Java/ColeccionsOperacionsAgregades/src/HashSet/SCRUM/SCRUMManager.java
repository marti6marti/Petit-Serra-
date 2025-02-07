package HashSet.SCRUM;

import java.util.HashSet;

public class SCRUMManager {
    private HashSet<Tasca> toBeDone;
    private HashSet<Tasca> doing;
    private HashSet<Tasca> done;

    public SCRUMManager() {
        this.toBeDone = new HashSet<>();
        this.doing = new HashSet<>();
        this.done = new HashSet<>();
    }

    public void afegirTasca(String nom, String descripcio) {
        Tasca tasca = new Tasca(nom, descripcio);
        toBeDone.add(tasca);
        System.out.println("Tasca afegida a TO BE DONE.");
    }

    public void passarDeToBeDoneADoing(String nom) {
        Tasca tasca = trobarTasca(toBeDone, nom);
        if (tasca != null) {
            toBeDone.remove(tasca);
            doing.add(tasca);
            System.out.println("Tasca passada de TO BE DONE a DOING.");
        } else {
            System.out.println("Tasca no trobada a TO BE DONE.");
        }
    }

    public void passarDeDoingADone(String nom) {
        Tasca tasca = trobarTasca(doing, nom);
        if (tasca != null) {
            doing.remove(tasca);
            done.add(tasca);
            System.out.println("Tasca passada de DOING a DONE.");
        } else {
            System.out.println("Tasca no trobada a DOING.");
        }
    }

    public void mostrarEstat() {
        System.out.println("TO BE DONE:");
        toBeDone.forEach(System.out::println);

        System.out.println("DOING:");
        doing.forEach(System.out::println);

        System.out.println("DONE:");
        done.forEach(System.out::println);
    }

    private Tasca trobarTasca(HashSet<Tasca> conjunt, String nom) {
        for (Tasca tasca : conjunt) {
            if (tasca.getNom().equals(nom)) {
                return tasca;
            }
        }
        return null;
    }
}
