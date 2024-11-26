package Ex3;

import java.util.Scanner;

public class CotxePermis {
    public static void main(String[] args) {
        Cotxe cotxe1 = new Cotxe();
        PermisConduir permisConduir1 = new PermisConduir();
        Scanner scanner = new Scanner(System.in);
        Boolean salir= false;

        while (!salir){

            System.out.println("---Escull---");
            System.out.println("a) Modificar info cotxe");
            System.out.println("b) Modificar info permis");
            System.out.println("c) Mostrar info");
            System.out.println("Introdueix la lletra:");
            String opcio = scanner.next();

            switch (opcio) {
                case "a":
                    System.out.println("Model:");
                    String model = scanner.next();
                    cotxe1.setModel(model);
                    System.out.println("Matrícula:");
                    String matricula = scanner.next();
                    cotxe1.setMatricula(matricula);
                    break;

                case "b":
                    System.out.println("Nom:");
                    String nom = scanner.next();
                    permisConduir1.setNom(nom);
                    System.out.println("Tipus de permis:");
                    String tipusdepermis = scanner.next();
                    permisConduir1.setTipusPermis(tipusdepermis);
                    System.out.println("Punts:");
                    int punts = scanner.nextInt();
                    permisConduir1.setPunts(punts);
                    break;

                case "c":
                    cotxe1.imprimirCotxe();
                    permisConduir1.imprimirPermis();
                    salir= true;


            }
        }








    }
}
