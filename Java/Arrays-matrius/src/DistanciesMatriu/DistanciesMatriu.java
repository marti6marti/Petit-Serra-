package DistanciesMatriu;

import java.util.Scanner;

public class DistanciesMatriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriu1 = {
                {0, 100, 156, 98, 296, 409},
                {100, 0, 256, 198, 396, 509},
                {156, 256, 0, 91, 140, 319},
                {98, 198, 91, 0, 231, 311},
                {296, 396, 140, 231, 0, 181},
                {409, 509, 319, 311, 181, 0}
        };

        //la x de la taula
        String ubix = sc.next();
        int x = 0;
        switch (ubix){
            case "Barcelona":
                x = 0;
                break;
            case "Girona":
                x = 1;
                break;
            case "Lleida":
                x = 2;
                break;
            case "tarragona":
                x = 3;
                break;
            case "Saragossa":
                x = 4;
                break;
            case "Terol":
                x = 5;

        }
        // la y de la taula
        String ubiy = sc.next();
        int y = 0;
        switch (ubiy){
            case "Barcelona":
                y = 0;
                break;
            case "Girona":
                y = 1;
                break;
            case "Lleida":
                y = 2;
                break;
            case "tarragona":
                y = 3;
                break;
            case "Saragossa":
                y = 4;
                break;
            case "Terol":
                y = 5;

        }

        System.out.print(matriu1[x][y]);

    }
}
