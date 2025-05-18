package TextAndBinaris.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ex1 {
    public static void main(String[] args) throws IOException {

        String nombreArchivo = "src/TextAndBinaris/ex1/files/text.txt";

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));


            for (String linea : lineas) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}