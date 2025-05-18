import java.util.Scanner;

// Classe principal amb menú per accedir a les diferents funcionalitats
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("MENÚ:");
            System.out.println("1. Treballar amb directoris");
            System.out.println("2. Fitxers de text");
            System.out.println("3. Còpia fitxer binari");
            System.out.println("4. Base de dades amb RandomAccessFile");
            System.out.println("0. Sortir");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> GestorDirectoris.mostrarFitxers(); // Mostra fitxers d’un directori
                case 2 -> GestorText.llegirMajuscules("fitxers/text.txt"); // Llegeix i mostra contingut en majúscules
                case 3 -> GestorBinari.copiarFitxer("fitxers/text.txt", "fitxers/text2.txt"); // Còpia binària
                case 4 -> GestorRandomAccess.menu(); // Menú de RandomAccessFile
            }
        } while (op != 0);
    }
}