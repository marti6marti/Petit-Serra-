package mobils2;

public class Test {
    public static void main(String[] args) {
        Inventari inventari = new Inventari();

        // Afegir mòbils
        System.out.println("\n📌 Afegint mòbils...");
        inventari.afegirMobil("12345678A", new Mobil("Samsung", "Galaxy S21", "666111222"));
        inventari.afegirMobil("87654321B", new Mobil("Apple", "iPhone 14", "677222333"));
        inventari.afegirMobil("11223344C", new Mobil("Xiaomi", "Redmi Note 11", "688333444"));

        // Mostrar inventari
        inventari.mostrarInventari();

        // Intentar afegir un DNI duplicat
        System.out.println("\n📌 Intentant afegir un mòbil amb DNI existent:");
        inventari.afegirMobil("12345678A", new Mobil("OnePlus", "9 Pro", "699444555"));

        // Buscar mòbil per DNI
        System.out.println("\n📌 Buscant el mòbil de DNI 12345678A:");
        System.out.println(inventari.buscarMobilAmbDni("12345678A"));

        // Buscar DNI per número de mòbil
        System.out.println("\n📌 Buscant DNI amb número 688333444:");
        System.out.println("DNI trobat: " + inventari.buscarDniPerNumero("688333444"));

        // Eliminar un mòbil
        System.out.println("\n📌 Eliminant mòbil del DNI 87654321B...");
        inventari.treureMobil("87654321B");

        // Mostrar inventari després de l'eliminació
        inventari.mostrarInventari();
    }
}
