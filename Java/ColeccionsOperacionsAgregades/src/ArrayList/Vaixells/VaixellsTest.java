package ArrayList.Vaixells;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class VaixellsTest {

    private ArrayList<Vaixell> vaixells;

    public VaixellsTest() {
        this.vaixells = new ArrayList<>();
    }


    public void introduirVaixell(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nom: ");
        String nom1 = sc.next();
        System.out.println("preu: ");
        Float preu1 = sc.nextFloat();
        System.out.println("edat: ");
        int edat1 = sc.nextInt();

        Vaixell vaixell1 = new Vaixell(nom1,preu1,edat1);
        vaixells.add(vaixell1);
    }

    public Vaixell buscarVaixell(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del vaixell per buscar la seva info: ");
        String nomVaixell = sc.next();

        for (Vaixell vaixell : vaixells) {
            if (vaixell.getNom().equalsIgnoreCase(nomVaixell)) {
                return vaixell;
            }
        }
        return null;
    }
    public void modificarVaixell(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del vaixell per modificar la seva info: ");
        String nomVaixell = sc.next();

        Vaixell vaixell = this.buscarVaixell();

        if(vaixell != null){
            System.out.println("nou nom: ");
            String nom1 = sc.next();
            System.out.println("nou preu: ");
            Float preu1 = sc.nextFloat();
            System.out.println("nova edat: ");
            int edat1 = sc.nextInt();
            vaixell.setNom(nom1);
            vaixell.setPreu(preu1);
            vaixell.setEdat(edat1);
        }
    }
    public void trureVaixell(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del vaixell que vols treure: ");
        String nomVaixell = sc.next();
        Vaixell vaixell = this.buscarVaixell();
        if(vaixell != null){
            vaixells.remove(vaixell);
            System.out.println("Vaixell tret");
        }
    }


    public void deVellANou() {
        vaixells.sort(Comparator.comparingInt(Vaixell::getEdat));
        vaixells.forEach(System.out::println);
    }


    public void ordenarPerNom(){
        vaixells.sort(Comparator.comparing(Vaixell::getNom).thenComparing(Vaixell::getPreu));
        vaixells.forEach(System.out::println);
    }

    public void ordenarPerPreu() {
        vaixells.sort(Comparator.comparing(Vaixell::getPreu));
        vaixells.forEach(System.out::println);
    }



    public static void main(String[] args) {
        VaixellsTest vt = new VaixellsTest();
        Vaixell vaixell2 = new Vaixell("Sunny",10F,5);
        Vaixell vaixell3 = new Vaixell("Merry",100F,12);
        vt.vaixells.add(vaixell2);
        vt.vaixells.add(vaixell3);


        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {

            System.out.println("\nMenú del Port:");
            System.out.println("1. Introduir vaixells");
            System.out.println("2. Buscar vaixells");
            System.out.println("3. Modificar vaixells");
            System.out.println("4. Treure un vaixell");
            System.out.println("5. Tots els vaixells actuals (de més vell a més nou)");
            System.out.println("6. Tots els vaixells actuals (per ordre lexicogràfic)");
            System.out.println("7. Tots els vaixells actuals (de car a barat)");
            System.out.println("8. Sortir");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    vt.introduirVaixell();
                    break;
                case 2:
                    System.out.println(vt.buscarVaixell());
                    break;
                case 3:
                    vt.modificarVaixell();
                    break;
                case 4:
                    vt.trureVaixell();
                    break;
                case 5:
                    vt.deVellANou();
                    break;
                case 6:
                    vt.ordenarPerNom();
                    break;
                case 7:
                    vt.ordenarPerPreu();
                    break;
                case 8:
                    continuar = false;

            }
        }
    }
}
