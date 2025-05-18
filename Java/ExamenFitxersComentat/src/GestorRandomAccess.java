import java.io.*;

// Classe per gestionar una base de dades binària d'alumnes
public class GestorRandomAccess {
    static final String FITXER = "fitxers/alumnes.dat"; // Ruta del fitxer
    static final int REGISTRE_SIZE = 408; // Tamany fix de cada registre

    public static void menu() {
        try (RandomAccessFile raf = new RandomAccessFile(FITXER, "rw")) {
            escriureAlumne(raf, 0, 1, "Joan", "Pérez", 20); // Escriu alumne a posició 0
            llegirAlumne(raf, 0); // Llegeix alumne a posició 0
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Escriu un alumne a una posició concreta
    static void escriureAlumne(RandomAccessFile raf, int pos, int id, String nom, String cognom, int edat) throws IOException {
        raf.seek(pos * REGISTRE_SIZE);
        raf.writeInt(id); // id alumne
        escriureStringFix(raf, nom); // nom amb llargada fixa
        escriureStringFix(raf, cognom); // cognom amb llargada fixa
        raf.writeInt(edat); // edat
    }

    // Llegeix un alumne d'una posició concreta
    static void llegirAlumne(RandomAccessFile raf, int pos) throws IOException {
        raf.seek(pos * REGISTRE_SIZE);
        int id = raf.readInt();
        String nom = llegirStringFix(raf);
        String cognom = llegirStringFix(raf);
        int edat = raf.readInt();
        System.out.println(id + " " + nom.trim() + " " + cognom.trim() + " " + edat);
    }

    // Escriu un text amb llargada fixa (200 caràcters)
    static void escriureStringFix(RandomAccessFile raf, String text) throws IOException {
        StringBuilder sb = new StringBuilder(text);
        while (sb.length() < 200) sb.append(' ');
        raf.writeChars(sb.toString());
    }

    // Llegeix un text amb llargada fixa
    static String llegirStringFix(RandomAccessFile raf) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) sb.append(raf.readChar());
        return sb.toString();
    }
}