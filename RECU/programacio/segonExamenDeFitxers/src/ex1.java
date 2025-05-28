import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {
        String arxiuBase = "src/pg5200.txt";
        //List<String> lineas = Files.readAllLines(Paths.get(arxiuBase));


        //ex 1
        StringBuilder text = new StringBuilder();
        StringBuilder titol = new StringBuilder();
        StringBuilder autor = new StringBuilder();
        String inici = "*** START OF THIS PROJECT GUTENBERG EBOOK METAMORPHOSIS ***";
        String fi = "*** END OF THIS PROJECT GUTENBERG EBOOK METAMORPHOSIS ***";
        boolean trobat = false;
        int contador= 0;
        try (BufferedReader br = new BufferedReader(new FileReader(arxiuBase))) {
            String linea;

            while ((linea = br.readLine()) != null){

                if (linea.contains("Title:")){
                    titol.append(linea);
                }
                if (linea.contains("Author:")){
                    autor.append(linea);
                }

                if (linea.contains(inici)){
                    trobat = true;
                }
                if (trobat){
                    text.append(linea).append("\n");
                    contador++;
                }
                if (linea.contains(fi)&& trobat){
                    break;
                }
            }
            //ex1
            System.out.println(text.toString());
           //ex2
            System.out.println("el text conte aquestes lineas" + contador);
            //ex3
            System.out.println(titol);
            System.out.println(autor);
br.close();
        }catch (IOException exception){
            System.out.println("no s'ha llegit l'arxiu");
        }
        //ex 4
        String nouArxiu = "src/llegits.txt";
        try{
            FileWriter ex4 = new FileWriter(nouArxiu,true);
            ex4.write(titol.toString() + " " + autor.toString());
            ex4.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
