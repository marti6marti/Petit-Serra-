package CiutatsHashset;

public class Test {
    public static void main(String[] args) {
        Manager ciutats = new Manager();
        Ciutat ciutat1 = new Ciutat("Barcelona");
        Ciutat ciutat2 = new Ciutat("Madrid");
        Ciutat ciutat3 = new Ciutat("Barcelona");
        Ciutat ciutat4 = new Ciutat("arcelona");
        ciutats.addCiutat(ciutat1);
        ciutats.addCiutat(ciutat2);
        ciutats.addCiutat(ciutat4);
        ciutats.addCiutat(ciutat3);
        System.out.println("totes les citys");
        ciutats.mostrarCiutats();
        System.out.println("totes les citys oredenades");
        ciutats.mostrarCiutatsOrdenades();
        System.out.println("inici b");
        ciutats.mostrarCiutatsFiltrades("B");

    }
}
