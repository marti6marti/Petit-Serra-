package HashMap.Mobils;

import java.util.HashMap;
import java.util.Scanner;

public class ConjuntManager {
    private HashMap<String, Mobil> conjuntMobils;

    public ConjuntManager() {
        this.conjuntMobils = new HashMap<>();
    }

    public void newMobil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI: ");
        String dni = sc.next();

        if (conjuntMobils.containsKey(dni)) {
            System.out.println("Aquest DNI ja té un mòbil registrat.");
            return;
        }

        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Model: ");
        String model = sc.next();
        System.out.println("Número: ");
        int num = sc.nextInt();

        Mobil mobil = new Mobil(marca, model, num);
        conjuntMobils.put(dni, mobil);
        System.out.println("Mòbil afegit correctament.");
    }

    public void removeMobil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el DNI de l'usuari per eliminar el mòbil: ");
        String dni = sc.next();

        if (conjuntMobils.containsKey(dni)) {
            conjuntMobils.remove(dni);
            System.out.println("Mòbil eliminat correctament.");
        } else {
            System.out.println("El DNI no existeix.");
        }
    }

    public void searchMobilByDni() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el DNI de l'usuari per cercar el mòbil: ");
        String dni = sc.next();

        if (conjuntMobils.containsKey(dni)) {
            Mobil mobil = conjuntMobils.get(dni);
            System.out.println(mobil);
        } else {
            System.out.println("El DNI no existeix.");
        }
    }

    public void searchDniByNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el número de mòbil per cercar el DNI: ");
        int num = sc.nextInt();

        boolean trobat = false;
        for (String dni : conjuntMobils.keySet()) {
            Mobil mobil = conjuntMobils.get(dni);
            if (mobil.getNum() == num) {
                System.out.println("El DNI associat al número és: " + dni);
                trobat = true;
                break;
            }
        }
        if (!trobat) {
            System.out.println("No es va trobar cap mòbil amb aquest número.");
        }
    }
}
