package GestioFitxers.ex5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        long max = Integer.MIN_VALUE;
        String number = "0";
        Path directori1 = Paths.get("/home/41652609t/Documents/Petit-Serra-/Java/E-S de Dades/src/GestioFitxers/ex5/fitxers");

        DirectoryStream<Path> files = Files.newDirectoryStream(directori1);
        for (Path file : files) {
            for (int i = 0; i < 9; i++) {
               number = "" + i;
            }
            if (file.startsWith(number)){
                System.out.println(file.getFileName());
            }
        }
    }
}
