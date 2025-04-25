package TextAndBinaris.ex5;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {

        String nombreArchivo = "src/TextAndBinaris/ex5/files/text.txt";
        String cadenaABuscar = "suro";
        int contador = 0;

        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            for (String linea : lineas) {
                int index = linea.indexOf(cadenaABuscar);
                while (index != -1) {
                    contador++;
                    index = linea.indexOf(cadenaABuscar, index + cadenaABuscar.length());
                }
            }

            String nomFitxerResultat = nombreArchivo + ".count";

            escriureResultat(nomFitxerResultat, contador);



        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());

        }
    }

    public static void escriureResultat(String nomFitxer, int comptador) {
        try {
            FileWriter fw = new FileWriter(nomFitxer, false);
            fw.write(String.valueOf(comptador));
            fw.close();
        } catch (IOException e) {
            System.out.println("Error escrivint al fitxer: " + e.getMessage());
        }
    }

}

