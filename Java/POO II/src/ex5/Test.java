package ex5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Cocacola",123456,"Aliments");
        Empresa empresa2 = new Empresa("Fanta",666,"Refrescos");
        Contracte contracte1 = new Contracte(1211, LocalDate.of(2006,1,1),LocalDate.of(2007,3,23),empresa1);
        Contracte contracte2 = new Contracte(2122, LocalDate.of(2008,2,1),LocalDate.of(2009,6,16),empresa2);
        Persona persona1 = new Persona(123,"Martí");

        persona1.AfegirContracte(contracte1);
        persona1.AfegirContracte(contracte2);

        long sumatotal = 0;



        Scanner sc =new Scanner(System.in);

        System.out.println("1. Determinar la suma total de les durades dels contractes en dies.");
        System.out.println("2. Determinar en quantes empreses diferents ha treballat.");
        System.out.println("3. Signar un contracte per una empresa");
        System.out.println("4. Determinar la durada d'un contracte en dies.");
        System.out.println("5.sortir");

        int opcio = sc.nextInt();
        boolean menu = true;

            switch (opcio) {
                case 1:
                    for (Contracte contracte : persona1.getContractes()) {
                        sumatotal += contracte.duradaContracte(contracte.getDataInici(), contracte.getDataFi());
                    }

                    System.out.println("La suma total de les durades dels contractes en dies es: " + sumatotal);

                    break;
                case 2:
                    System.out.println(contracte1.getEmpresa());
                    System.out.println(contracte2.getEmpresa());
                    break;
                case 4:
                    for (Contracte contracte : persona1.getContractes()) {
                        System.out.println(contracte.duradaContracte(contracte.getDataInici(), contracte.getDataFi()));
                    }
                    break;

            }
        }

    }

