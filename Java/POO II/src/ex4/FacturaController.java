
package ex4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FacturaController {
    private ArrayList<Client> clients;

    FacturaController(){
        clients = new ArrayList<>();
    }

    public static void main(String[] args) {
        FacturaController fc = new FacturaController();
        Scanner sc = new Scanner(System.in);
        int opcio;
        do{
            fc.menu();
            opcio = sc.nextInt();
            switch(opcio){
                case 1:{
                    fc.afegirClient();
                    break;
                } case 2:{
                    fc.afegirTrucadaAClient();
                    break;
                } case 3:{
                    fc.comprovarFacturaClient();
                    break;
                } case 4:{
                    fc.llistatClients();
                    break;
                } case 5:{
                    break;
                } default:{
                    System.out.println("Opcio incorrecta, siusplau introdueix un altre nombre");
                }
            }

        }while(opcio!=5);


    }

    public void menu(){
        System.out.println("Menu:\n" +
                "1. Afegir client\n" +
                "2. Afegir trucada a client\n" +
                "3. Comprovar factura de client\n" +
                "4. Llistat de clients\n"+
                "5. Sortir\n");
    }

    public void afegirClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el dni del Client");
        String dni = sc.nextLine();
        while(existeixClient(dni)) {
            System.out.println("Client ja existent, introdueix un altre dni: ");
            dni = sc.nextLine();
        }
        System.out.println("Introdueix el nom del Client");
        String nom = sc.nextLine();
        System.out.println("Introdueix el preu per minut");
        double preuXMinut = Double.parseDouble(sc.nextLine());
        this.clients.add(new Client(dni, nom, preuXMinut));
    }

    public void afegirTrucadaAClient(){
        Scanner sc = new Scanner(System.in);

        //CLIENT
        String dni = this.introdueixDni(1);

        //AFEGIR TRUCADA
        System.out.println("Introdueix el desti");
        String desti = sc.nextLine();

        System.out.println("Introdueix la duracio");
        int duracio = Integer.parseInt(sc.nextLine());

        //BUSCAR CLIENT
        Client client = this.retornaClient(dni);

        //AFEGIR TRUCADA
        client.afegirTrucada( new Trucada(desti, duracio));
    }

    public void comprovarFacturaClient(){
        String dni = this.introdueixDni(2);
        Client client = this.retornaClient(dni);
        System.out.println("FACTURA");
        System.out.println(client);

        System.out.println("Minuts totals= " + client.totalMinuts());
        System.out.println("Preu total= " + client.totalPreu());
        System.out.println("-------------------\n");


    }

    public void llistatClients(){
        for(Client client: clients){
            System.out.println(client.getNom()+"("+client.getDni()+")");
            System.out.println("Numero trucades: " + client.trucades.size());
            System.out.println("Numero minuts totals: " + client.totalMinuts());
            System.out.println("Import total: " + client.totalPreu());
            System.out.println("--------------------------------------");


        }
    }


    /**
     *
     * FUNCIONS AUXILIARS
     *
     */

    public String introdueixDni(int opcio){
        Scanner sc = new Scanner(System.in);
        if(opcio == 1)System.out.println("Introdueix el dni del client al que volem introduir una trucada");
        else if(opcio==2)System.out.println("Introdueix el dni del client al que volem fer la factura");
        return sc.nextLine();
    }

    public boolean existeixClient(String dni){
        return clients.stream().filter(client-> client.getDni().equals(dni)).count() > 0;
    }

    public Client retornaClient(String dni){
        for(Client c: clients){
            if(c.getDni().equals(dni)) return c;
        }
        return null;
    }
}