package GestioFitxers.ex4;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        long max = Integer.MIN_VALUE;
        String name = null;
        Path directori1 = Paths.get("/home/41652609t/Documents/Petit-Serra-/Java/E-S de Dades/src/GestioFitxers/ex4/fitxers");


        DirectoryStream<Path> files = Files.newDirectoryStream(directori1);
        for (Path file : files) {
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.println(file.getFileName());
            System.out.println(file.getParent());
            System.out.println("Hi ha " + file.getNameCount() + "salts per arribar a l' arxiu");
            System.out.println(Files.exists(file));
            System.out.println(Files.size(file));
            System.out.println(Files.isDirectory(file));
            System.out.println(Files.isExecutable(file));
            System.out.println(Files.probeContentType(file));
            System.out.println(Files.isHidden(file));
            System.out.println(Files.isReadable(file));
            System.out.println(Files.isWritable(file));

        }
    }
}
