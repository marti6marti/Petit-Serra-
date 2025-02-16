package Ciutats;

import java.util.HashSet;

public class Manager {
    public HashSet<Ciutat> ciutats;

    public Manager() {
        this.ciutats = new HashSet<>();
    }

    public HashSet<Ciutat> getCiutats() {
        return ciutats;
    }

    public void setCiutats(HashSet<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }

    public void addCiutat(Ciutat ciutat){
        ciutats.add(ciutat);
    }

    public void mostrarCiutats(){
        for (Ciutat ciutat : ciutats) {
            System.out.println(ciutat);
        }
    }
    public void mostrarCiutatsFiltrades(String lletraInicial) {
        getCiutats().stream().filter(ciutat -> ciutat.getNom().startsWith(lletraInicial)).forEach(System.out::println);
    }
    public void mostrarCiutatsOrdenades(){
        ciutats.stream()
                .sorted((c1,c2) ->c1.getNom().compareToIgnoreCase(c2.getNom()))
                .forEach(System.out::println);
    }
    public void mostrarCiutatsOrdenadesDesc() {
        ciutats.stream()
                .sorted((c1, c2) -> c2.getNom().compareToIgnoreCase(c1.getNom()))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ciutats=" + ciutats +
                '}';
    }
}
