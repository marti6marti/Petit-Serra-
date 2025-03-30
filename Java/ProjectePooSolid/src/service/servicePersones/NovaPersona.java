package service.servicePersones;

import model.institute.Institut;
import model.person.Alumne;
import model.person.PersonaExterna;
import model.person.Profesor;

import java.util.Scanner;

public class NovaPersona {
    Scanner scanner = new Scanner(System.in);

    public void novaPersona(Institut ins){
        System.out.println("\nQue ets?");
        System.out.println("1. Alumne");
        System.out.println("2. Profesor");
        System.out.println("3. Persona Externa");
        System.out.println("Opció: ");
        int opcio = scanner.nextInt();
        switch (opcio) {
            case 1:
                System.out.println("nom: ");
                String nom1 = scanner.next();
                System.out.println("tel: ");
                int tel1 = scanner.nextInt();
                System.out.println("curs: ");
                String curs1 = scanner.next();
                Alumne alumne = new Alumne(nom1, tel1, curs1);
                ins.addPersona(alumne);
                break;
            case 2:
                System.out.println("nom: ");
                String nom2 = scanner.next();
                System.out.println("tel: ");
                int tel2 = scanner.nextInt();
                System.out.println("materia: ");
                String materia2 = scanner.next();
                Profesor profesor = new Profesor(nom2, tel2, materia2);
                ins.addPersona(profesor);
                break;
            case 3:
                System.out.println("nom: ");
                String nom3 = scanner.next();
                System.out.println("tel: ");
                int tel3 = scanner.nextInt();
                PersonaExterna personaExterna = new PersonaExterna(nom3, tel3);
                ins.addPersona(personaExterna);
                break;
        }
    }
}
