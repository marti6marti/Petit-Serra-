package GestioFitxers.ex2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        long max = Integer.MIN_VALUE;
        String name = null;
        Path directori1 = Paths.get("/home/41652609t/Documents/Petit-Serra-/Java/E-S de Dades/src/GestioFitxers/ex2/fitxers");

        if(args.length!=0){
            directori1 = Paths.get(args[0]);
        }

        System.out.println("Directori " + Files.exists(directori1));

        DirectoryStream<Path> files = Files.newDirectoryStream(directori1);
        for (Path file : files) {
            if (max < Files.size(file)) {
                max = Files.size(file);
                name = file.getFileName().toString();
            }
        }
        System.out.println("El fitxer mes gran és: " + name);
    }
}
