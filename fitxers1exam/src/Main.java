import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String mestre = "src/mestre.txt";
        String altes = "src/altes.txt";
        String fitxerAux = "src/fixerAux.txt";

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(mestre));
            BufferedReader br2 = new BufferedReader(new FileReader(altes));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fitxerAux,true));

            String lMestre= br1.readLine();
            String lAltes = br2.readLine();
            while ((lMestre != null)  || (lAltes != null)) {
                

                String[] elementsLmestre = lMestre.split(":");
                String[] elementsLaltes = lAltes.split(":");

                if (elementsLmestre[0].compareTo(elementsLaltes[0]) < 0){
                    bw.write(lMestre);
                    lMestre = br1.readLine();
                } else {
                    bw.write(lAltes);
                    lAltes = br2.readLine();
                }







                lMestre= br1.readLine();
                lAltes = br2.readLine();
            }



            br1.close();
            br2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
