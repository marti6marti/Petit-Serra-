package TextAndBinaris.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {

        String nombreArchivo = "src/TextAndBinaris/ex2/files/text.txt";

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            for (String linea : lineas) {
                System.out.println(linea.toUpperCase());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}