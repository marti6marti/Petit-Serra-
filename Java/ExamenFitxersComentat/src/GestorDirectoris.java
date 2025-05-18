import java.io.File;

// Classe per gestionar directoris i fitxers utilitzant File
public class GestorDirectoris {
    public static void mostrarFitxers() {
        File dir = new File("fitxers"); // Ruta al directori
        if (dir.isDirectory()) {
            for (File f : dir.listFiles()) {
                // Mostra el nom i mida del fitxer
                System.out.println(f.getName() + " (" + f.length() + " bytes)");
            }
        }
    }
}