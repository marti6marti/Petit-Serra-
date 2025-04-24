package TextAndBinaris.ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {

        String nombreArchivo = "src/TextAndBinaris/ex3/files/text.txt";

        try {
            if (Files.readAllLines(Paths.get(nombreArchivo)).contains("dia")) {
                System.out.println(true);
            }
            else System.out.println(false);
        }

        catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}



