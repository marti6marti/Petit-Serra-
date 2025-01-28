package EnfonsaLaFlota;

import java.util.Scanner;

public class EnfonsaLaFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vaixells = 0;

        //matriu 1
        int tamany1 = sc.nextInt();
        String[][] matriu1 = new String[tamany1][tamany1];
        for (int i = 0; i < tamany1; i++) {
            for (int j = 0; j < tamany1; j++) {
                matriu1[i][j] = sc.next();
                if (matriu1[i][j].equals("V")){
                    vaixells++;
                }
            }
        }

        int tirx = 0;
        int tiry = 0;
        int acerts = 0;

        while(true) {
            tirx = sc.nextInt();
            tiry = sc.nextInt();

            if (tirx == -1 && tiry == -1){
                break;
            } else if (matriu1[tirx][tiry].equals("V")) {
                acerts++;
            }
        }

        if (acerts == vaixells){
            System.out.println("GUANYA");
        }else {
            System.out.println("NO GUANYA");
        }




    }
}
