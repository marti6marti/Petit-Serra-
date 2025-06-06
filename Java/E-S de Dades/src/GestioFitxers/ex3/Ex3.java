package GestioFitxers.ex3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        long max = Integer.MIN_VALUE;
        String name = null;
        String nombreArchivo = "src/GestioFitxers/ex3/fitxers";
        Path directori1 = Paths.get(nombreArchivo);

        System.out.println("Directori " + Files.exists(directori1));

        DirectoryStream<Path> files = Files.newDirectoryStream(directori1);
        for (Path file : files) {
            if (file.getFileName().toString().contains("exercici")){
                System.out.println(file.getFileName());
            }
        }

    }
}
