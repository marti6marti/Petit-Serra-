package ex3;


import java.util.Scanner;

public class gestioFerryCamio {

    public static void main(String[] args) {
        int opcion;
        Ferri fer = new Ferri();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1. Peso total dels Camions embarcats");
            System.out.println("2. Determinar si un camió està embarcat");
            System.out.println("4. Embarcar un camió");
            System.out.println("8. Listado de camions");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = scan.nextInt();
            switch (opcion){
                case 1: {
                    System.out.println("Peso total camions: " + fer.pesTotalCamions());
                    break;
                }
                case 2: {
                    System.out.println("Matricula: ");
                    String matricula = scan.next();
                    fer.camioEmbarcat(matricula);
                    break;
                }
                case 4:{
                    Camio cam = crearCamio(scan);
                    if(fer.determinarSiPucEmbarcar(cam))
                        fer.embarcarCamio(cam);

                    break;
                }
                case 5:{
                    Camio cam = crearCamio(scan);
                    System.out.println(fer.determinarSiPucEmbarcar(cam));
                    break;
                }
                case 8:
                    fer.llistarCamions();
                    break;
            }
        } while(opcion != 0);
    }

    public static Camio crearCamio(Scanner scan){
        System.out.println("Matricula camion: ");
        String mat = scan.next();
        System.out.println("Peso camion: ");
        int pes = scan.nextInt();
        Camio camio = new Camio(mat,pes);
        return camio;
    }

}