package exercisisArxius;

import java.io.*;

// Classe per llegir fitxers de text i mostrar el contingut en majúscules
public class GestorText {
    public static void llegirMajuscules(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                // Mostra cada línia en majúscules
                System.out.println(linia.toUpperCase());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}