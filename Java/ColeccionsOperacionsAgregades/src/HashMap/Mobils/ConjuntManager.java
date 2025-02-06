package HashMap.Mobils;

import ArrayList.Books.Book;

import java.util.HashMap;
import java.util.Scanner;

public class ConjuntManager {
    private HashMap<String,Mobil> conjuntMobils;

    public ConjuntManager(HashMap<String, Mobil> conjuntMobils) {
        this.conjuntMobils = new HashMap<>();
    }

    public HashMap<String, Mobil> getConjuntMobils() {
        return conjuntMobils;
    }

    public void setConjuntMobils(HashMap<String, Mobil> conjuntMobils) {
        this.conjuntMobils = conjuntMobils;
    }

    public void newmobil (){
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI: ");
        String dni = sc.next();
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Model: ");
        String model = sc.next();
        System.out.println("num: ");
        int num = sc.nextInt();
        Mobil mobil = new Mobil(marca,model,num);
        conjuntMobils.put(dni,mobil);
    }
}
