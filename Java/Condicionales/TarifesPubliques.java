import java.util.Scanner;

public class TarifesPubliques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edadUser = sc.nextInt();
        int numeroViajes = sc.nextInt();

        if (edadUser>=25 && edadUser<=60 && numeroViajes>0){
            if (numeroViajes==1){
                System.out.println("Bitllet senzill");
            } else if (numeroViajes>1 && numeroViajes<=10) {
                System.out.println("T-casual");
            } else if (numeroViajes>10) {
                System.out.println("T-usual");
            }
        } else if (edadUser<25 && edadUser>16 && numeroViajes>0) {
            if (numeroViajes==1){
                System.out.println("Bitllet senzill");
            } else if (numeroViajes>1 && numeroViajes<=10) {
                System.out.println("T-casual");
            } else if (numeroViajes>10 && numeroViajes<=30) {
                System.out.println("T-usual");
            } else {
                System.out.println("T-jove");
            }
        } else if(edadUser>60 && numeroViajes>0){
            System.out.println("Targeta Rosa");
        } else if (edadUser>=4 && edadUser<=16 && numeroViajes>0) {
            System.out.println("T-16");
        } else {
            System.out.println("Introducir una edad correcta");
        }
    }
}
