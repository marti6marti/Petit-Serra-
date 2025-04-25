package TextAndBinaris.ex7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class ex7 {
    public static void main(String[] args) {
        String nombreArchivo = "src/TextAndBinaris/ex7/files/text.txt";

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));


            for (String linea : lineas) {
                System.out.println(linea);
            }

            String nuevoNombre = nombreArchivo + ".2";

            Path rutaNouFitxer = Paths.get(nuevoNombre);
            Files.write(rutaNouFitxer, lineas);

        } catch (IOException e) {
            System.out.println("Error al processar el fitxer: " + e.getMessage());
        }
    }
}
