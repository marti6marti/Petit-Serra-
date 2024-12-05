import java.util.Scanner;

public class Semafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String queSomos = sc.nextLine();
        String semaforoTranvia = sc.nextLine();
        String semaforoPeatones = sc.nextLine();
        String semaforoCoches = sc.nextLine();


        if (queSomos.equals("VIANANT")) {
            if (semaforoTranvia.equals("GO")) {
                if (semaforoPeatones.equals("VERD") || semaforoCoches.equals("VERD")) {
                    System.out.println("POSSIBLE COLISIO");
                } else {
                    System.out.println("PARAR");
                }

            } else if (semaforoTranvia.equals("STOP")) {
                if (semaforoPeatones.equals("VERD") && semaforoCoches.equals("VERMELL")) {
                    System.out.println("ENDAVANT");
                } else {
                    System.out.println("PARAR");
                }

            }
        } else if (queSomos.equals("COTXE")) {
            if (semaforoTranvia.equals("GO")) {
                if (semaforoPeatones.equals("VERD") || semaforoCoches.equals("VERD")) {
                    System.out.println("POSSIBLE COLISIO");
                } else {
                    System.out.println("PARAR");
                }

            } else if (semaforoTranvia.equals("STOP")) {
                if ((semaforoPeatones.equals("GROC") || semaforoPeatones.equals("VERMELL")) && semaforoCoches.equals("VERD")) {
                    System.out.println("ENDAVANT");
                } else {
                    System.out.println("PARAR");
                }

            }
        } else if (queSomos.equals("TRANVIA")) {
            if (semaforoTranvia.equals("GO")) {
                if (semaforoPeatones.equals("VERD") || semaforoCoches.equals("VERD")) {
                    System.out.println("POSSIBLE COLISIO");
                } else {
                    System.out.println("ENDAVANT");
                }

            } else if (semaforoTranvia.equals("STOP")) {
                if (semaforoPeatones.equals("VERD") && semaforoCoches.equals("VERD")) {
                    System.out.println("POSSIBLE COLISIO");
                } else {
                    System.out.println("PARAR");
                }

            }
        } else {
            System.out.println("Error, debe ingresar: COTXE, TRANVIA, VIANANT");
        }
    }
}
