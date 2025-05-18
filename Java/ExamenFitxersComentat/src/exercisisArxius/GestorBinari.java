package exercisisArxius;

import java.io.*;

// Classe per copiar fitxers binaris (text, imatges, etc.)
public class GestorBinari {
    public static void copiarFitxer(String origen, String desti) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origen));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desti))) {
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b); // Escriu cada byte llegit
            }
            System.out.println("Còpia feta correctament.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}