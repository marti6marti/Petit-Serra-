package Examen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Examen {
    public static void main(String[] args) throws IOException {
        String nombreArchivo = "src/Examen/arxius/paper1.txt";
        List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
        byte[] lletres = Files.readAllBytes(Paths.get(nombreArchivo));
        
        // et retorna la ruta del arxiu
        System.out.println(Paths.get(nombreArchivo));
        //si existeix
        System.out.println(Files.exists(Paths.get(nombreArchivo)));
        //et eretorna 0 --- mirar q es
        System.out.println(Files.size(Paths.get(nombreArchivo)));
        //llegeix el document
        System.out.println(lineas);
        //posar tot mayuscules
        for (String linea : lineas) {
            System.out.println(linea.toUpperCase());
        }
        //algun fitxer conte x paraula en el nom
        System.out.println(Paths.get(nombreArchivo).getFileName().toString().contains("pa"));
        //el nom del arxiu comensa per x
        System.out.println(Paths.get(nombreArchivo).getFileName().toString().startsWith("p"));
        //algun fitxer conte x paraula en el arxiu
        for (String linea : lineas) {
            System.out.println(linea.contains("preparar l'examen"));
        }
        //quans cops apareix la lletra a?

    }
}
