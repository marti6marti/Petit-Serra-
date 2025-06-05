package ex7i;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class Manager {

    public void crearDirectori(String nomDir) {
        String rutaDir = "src/ex7i/" + nomDir;
        File newDir = new File(rutaDir);
        try {
            newDir.mkdir();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void borrarDirectori(String nomDir) {
        String rutaDir = "src/ex7i/" + nomDir;
        File newDir = new File(rutaDir);
        try {
            newDir.delete();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void creaArxiu(String nomFil) {
        String rutaFil = "src/ex7i/" + nomFil + ".txt";
        File newFil = new File(rutaFil);
        try {
            if (!newFil.exists()) {
                newFil.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrarArxiu(String nomFil) {
        String rutaFil = "src/ex7i/" + nomFil + ".txt";
        File newFil = new File(rutaFil);
        try {
            if (newFil.exists()) {
                newFil.delete();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void convertFilesADir (String nomDirAmbArxius){
        String rutaDir = "src/ex7i/" + nomDirAmbArxius;

        try {
            File dir = new File(rutaDir);
            for (String arxiu : dir.list()){
                File dirT = new File(arxiu);
                String nouNom = dirT.getName().substring(0,dirT.getName().length() -4) ;
                File nousdir = new File(rutaDir + "/" +nouNom);
                nousdir.mkdir();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void ordenarLexFrasesDe2Files(String nomFil1, String nomFil2){
        String rutaFil1 = "src/ex7i/ordenar/" + nomFil1 + ".txt";
        String rutaFil2 = "src/ex7i/ordenar/" + nomFil2 + ".txt";
        String rutafileT = "src/ex7i/ordenar/temporal.txt";

        try {
            BufferedReader lector1 = new BufferedReader(new FileReader(rutaFil1));
            BufferedReader lector2 = new BufferedReader(new FileReader(rutaFil2));
            BufferedWriter fileOrdenat = new BufferedWriter(new FileWriter(rutafileT,false));

            String lin1 = lector1.readLine();
            String lin2 = lector2.readLine();

            while (lin1 != null && lin2 != null){
                String[] ls1 = lin1.split(":");
                String[] ls2 = lin2.split(":");

                if (ls1[0].compareTo(ls2[0]) < 0 ){
                    fileOrdenat.write(lin1);
                    fileOrdenat.write("\n");
                    lin1 = lector1.readLine();
                }else {
                    fileOrdenat.write(lin2);
                    fileOrdenat.write("\n");
                    lin2 = lector2.readLine();
                }
            }

            while (lin2 != null){
                fileOrdenat.write(lin2);
                fileOrdenat.write("\n");
                lin2 = lector2.readLine();;
            }

            while (lin1 != null){
                fileOrdenat.write(lin1);
                fileOrdenat.write("\n");
                lin1 = lector1.readLine();
            }

            lector1.close();
            lector2.close();
            fileOrdenat.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void autorRecepte (String recepte){
        String ruta = "src/ex7i/trobarX/" + recepte + ".txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader (ruta));
            String lin = br.readLine();
            boolean trobat = false;

            while (lin !=null){
                String[] paraules = lin.split(" ");
                for (String paraula : paraules){
                    if (trobat){
                        System.out.println(paraula);
                        br.close();
                        return;

                    } else if (paraula.equalsIgnoreCase("Autor:")){
                        trobat = true;
                    }
                }
                lin = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void historiaRecepte (String recepte){
        String ruta = "src/ex7i/trobarX/" + recepte + ".txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader (ruta));
            String lin = br.readLine();
            boolean inici = false;
            while (lin !=null){
                String[] lineas = lin.split("\n");
                for (String linea : lineas){
                    if (linea.contains("** ingredients**")){
                        inici = false;
                    }
                    if (linea.contains("**historia**")){
                        inici = true;
                    }
                    if (inici){
                        System.out.println(linea);
                    }
                }
                lin = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void ingredientsRecepte (String recepte){
        String ruta = "src/ex7i/trobarX/" + recepte + ".txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader (ruta));

            String lin = br.readLine();
            boolean inici = false;
            while (lin !=null){
                String[] lineas = lin.split("\n");
                for (String linea : lineas){
                    if (linea.contains("**fi**")){
                        inici = false;
                    }
                    if (inici){
                        String[] paraules = linea.split(" ");
                        System.out.println(paraules[0]);
                    }
                    if (linea.contains("** ingredients**")){
                        inici = true;
                    }

                }
                lin = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void nouIngredientRecepte (String recepte, String nouIngredient){
        String ruta = "src/ex7i/trobarX/" + recepte + ".txt";
        String rutafileT = "src/ex7i/trobarX/temporal.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutafileT,false));

            String lin = br.readLine();
            boolean trobat = false;

            while (lin != null){
                String[] lineas = lin.split("\n");

                for (String linea : lineas){
                    bw.write(linea);
                    bw.write("\n");
                    if (linea.contains("** ingredients**")){
                        trobat = true;
                    }
                    if (trobat){
                        bw.write("\n");
                        bw.write(nouIngredient);
                        bw.write("\n");
                        trobat = false;
                    }
                }
                lin = br.readLine();
            }

            br.close();
            bw.close();

            File original = new File(ruta);
            File nou = new File(rutafileT);

            if (original.exists()){
                original.delete();
            }
            nou.renameTo(original);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void quantaMelRecepte (String recepte){
        String ruta = "src/ex7i/trobarX/" + recepte + ".txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader (ruta));

            String lin = br.readLine();
            boolean inici = false;
            while (lin !=null){
                String[] lineas = lin.split("\n");
                for (String linea : lineas){
                    if (linea.contains("mel: ")){
                        String[] paraules = linea.split(" ");
                        System.out.println(paraules[1] + paraules[2]);
                    }
                }
                lin = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<File> funcioOrdenarfilesPerTamany(List<File> files){
        return files.stream().sorted(Comparator.comparing(File ::length)).toList().reversed();
    }

    public void ordenarfilesPerTamany() {
        String ruta = "src/ex7i/arxius";
        try {
            File dir = new File(ruta);

            File[] arxius = dir.listFiles();
            for (File arxiu : funcioOrdenarfilesPerTamany(List.of(arxius))) {
                System.out.println(arxiu);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void infoDeUnDir(){
        String ruta = "src/ex7i/arxius";
        try {
            File dir = new File(ruta);

            String[] lsDir = dir.list();
            for (String arxiu : lsDir){
                File interior = new File(arxiu);
                System.out.println(interior.getName());
                System.out.println(interior.exists());
                System.out.println(interior.canExecute());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void cercadorDeParaula(String paraula){
        String ruta = "src/ex7i/arxius";
        File dir = new File(ruta);
        String[] lsDir = dir.list();

        for (String arxiu : lsDir){
            File fixer = new File(dir,arxiu);
            try {
                BufferedReader br = new BufferedReader(new FileReader(fixer));
                String lin = br.readLine();
                while (lin != null){
                    String[] lineas = lin.split("\n");
                    for (String linea : lineas){
                        if(linea.contains(paraula)){
                            System.out.println(arxiu);
                        }
                    }
                    lin = br.readLine();
                }
                br.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void cercadorFilesStartNum(){
        String ruta = "src/ex7i/arxius";
        File dir = new File(ruta);
        File[] lsDir = dir.listFiles();

        for (File arxiu : lsDir){
            if(Character.isDigit(arxiu.getName().charAt(0))){
                System.out.println(arxiu);
            }
        }
    }
}
