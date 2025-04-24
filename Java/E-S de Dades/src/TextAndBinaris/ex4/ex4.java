package TextAndBinaris.ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {

        String nombreArchivo = "src/TextAndBinaris/ex4/files/text.txt";
        int contador = 0;

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

                for (String linea : lineas){
                    linea.indexOf("suro");

                }
            System.out.println(contador);
        }

        catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
