package ex5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Cocacola",123456,"Aliments");
        Empresa empresa2 = new Empresa("Fanta",666,"Refrescos");
        Contracte contracte1 = new Contracte(1211, LocalDate.of(2006,1,1),LocalDate.of(2007,3,23),empresa1);
        Contracte contracte2 = new Contracte(2122, LocalDate.of(2008,2,1),LocalDate.of(2009,6,16),empresa2);
        Persona persona1 = new Persona(123,"Martí");

        persona1.AfegirContracte(contracte1);
        persona1.AfegirContracte(contracte2);

        for(Contracte contracte: persona1.getContractes()){
            System.out.println(contracte.duradaContracte(contracte.getDataInici(), contracte.getDataFi()));
        }


        ArrayList<Contracte> contractes = persona1.getContractes();
        contractes.size()
        contractes.add(new Contracte());
        contractes.get(3);
        contractes.set(0, new Contracte());


        Contracte contracteAComparar = new Contracte();

        for(Contracte contracte: contractes){

            if(contracte.equals(contracteAComparar)){
                
            }

        }

    }
}
