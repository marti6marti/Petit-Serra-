package fitxers;

import java.io.*;

public class FileReplacerSimple {
    public static void main(String[] args) {
        String archivoOriginal = "src/fitxers/txt1.txt";
        String archivoTemporal  = "src/fitxers/txt2.txt";

        try {

            // PASO 1: LEER EL ARCHIVO ORIGINAL
            StringBuilder contenido = new StringBuilder();
            BufferedReader lector1 = new BufferedReader(new FileReader(archivoOriginal));

            String linea;
            while ((linea = lector1.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            lector1.close();

            // PASO 2: CREAR ARCHIVO TEMPORAL
            FileWriter escritor = new FileWriter(archivoTemporal);
            escritor.write(contenido.toString());
            escritor.close();


            // PASO 3: ELIMINAR EL ARCHIVO ORIGINAL
            File original = new File(archivoOriginal);
            if (!original.delete()) {
                throw new IOException("No se pudo eliminar el archivo original");
            }

            // PASO 4: Renombrar txt2.txt a txt1.txt

            File temporal = new File(archivoTemporal);
            File nuevoNombre = new File(archivoOriginal);

            if (!temporal.renameTo(nuevoNombre)) {
                throw new IOException("Error al renombrar el archivo");
            }
            System.out.println("¡Archivo renombrado correctamente!");

        } catch (IOException e) {
            System.err.println("Error durante el proceso: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
