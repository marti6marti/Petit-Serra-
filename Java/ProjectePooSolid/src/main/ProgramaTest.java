package main;

import model.booking.Reserva;
import model.institute.Institut;
import model.person.Alumne;
import model.person.Persona;
import model.person.PersonaExterna;
import model.person.Profesor;
import model.space.Espai;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramaTest {
    public static void main(String[] args) {
        Institut poblenou = new Institut("Poblenou");

        Espai biblioteca = new Espai("Biblioteca", 10);
        Espai aulaReunions = new Espai("Aula de reunions", 2.5);
        Espai menjador = new Espai("Menjador", 15);

        poblenou.addEspai(biblioteca);
        poblenou.addEspai(aulaReunions);
        poblenou.addEspai(menjador);

        Alumne alumne1 = new Alumne("Martí", 123456789, "2º ESO");
        Profesor profesor1 = new Profesor("Joan", 987654321, "Matemàticas");
        PersonaExterna visitant1 = new PersonaExterna("Miquel", 567890123);
        poblenou.addPersona(alumne1);
        poblenou.addPersona(profesor1);
        poblenou.addPersona(visitant1);

        Reserva reserva1 = new Reserva(333,alumne1, biblioteca, LocalDateTime.of(2025, 1, 9, 15, 0), LocalDateTime.of(2025, 1, 9, 17, 0));
        Reserva reserva2 = new Reserva(666,profesor1, menjador, LocalDateTime.of(2025, 1, 10, 9, 0), LocalDateTime.of(2025, 1, 10, 10, 0));
        poblenou.addReserva(reserva1);
        poblenou.addReserva(reserva2);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("\nMenú del model.institute.Institut:");
            System.out.println("1. Espais disponibles");
            System.out.println("2. Mostra totes les resrvas");
            System.out.println("3. Registre't");
            System.out.println("4. Fer una reserva");
            System.out.println("5. Buscar reserves a partir del nom d'una persona");
            System.out.println("6. Anular reserva");
            System.out.println("7. Sortir");
            System.out.print("Opció: ");
            int opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    poblenou.mostrarespais();
                    break;
                case 2:
                    poblenou.mostrareservas();
                    break;
                case 3:
                    System.out.println("\nQue ets?");
                    System.out.println("1. model.person.Alumne");
                    System.out.println("2. model.person.Profesor");
                    System.out.println("3. model.person.Persona Externa");
                    System.out.println("Opció: ");
                    int opcio2 = scanner.nextInt();
                    switch (opcio2) {
                        case 1:
                            System.out.println("nom: ");
                            String nom1 = scanner.next();
                            System.out.println("tel: ");
                            int tel1 = scanner.nextInt();
                            System.out.println("curs: ");
                            String curs1 = scanner.next();
                            Alumne alumne = new Alumne(nom1, tel1, curs1);
                            poblenou.addPersona(alumne);
                            break;
                        case 2:
                            System.out.println("nom: ");
                            String nom2 = scanner.next();
                            System.out.println("tel: ");
                            int tel2 = scanner.nextInt();
                            System.out.println("materia: ");
                            String materia2 = scanner.next();
                            Profesor profesor = new Profesor(nom2, tel2, materia2);
                            poblenou.addPersona(profesor);
                            break;
                        case 3:
                            System.out.println("nom: ");
                            String nom3 = scanner.next();
                            System.out.println("tel: ");
                            int tel3 = scanner.nextInt();
                            PersonaExterna personaExterna = new PersonaExterna(nom3, tel3);
                            poblenou.addPersona(personaExterna);
                            break;
                    }
                    break;
                case 4:
                    //id
                    System.out.println("Posa un ID per la teva reserva");
                    int id = scanner.nextInt();

                    // persona
                    System.out.println("Qui fa la reserva?");
                    System.out.println("1. model.person.Alumne");
                    System.out.println("2. model.person.Profesor");
                    System.out.println("3. model.person.Persona Externa");
                    int opcioPersona = scanner.nextInt();
                    Persona personaReserva = null;

                    switch (opcioPersona) {
                        case 1:
                            System.out.println("nom: ");
                            String nomAlumne = scanner.next();

                            for (Persona persona : poblenou.getPersonas()) {
                                if (persona.getNom().equalsIgnoreCase(nomAlumne)) {
                                    personaReserva = persona;
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("nom: ");
                            String nomProfesor = scanner.next();
                            for (Persona persona : poblenou.getPersonas()) {
                                if (persona.getNom().equalsIgnoreCase(nomProfesor)) {
                                    personaReserva = persona;
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ja que vostè no està matriculat al centre, per poder fer ús de les instal·lacions ha de pagar 5€ per cada reserva.");
                            System.out.println("Fes un bon ús de les instal·lacions Gràcies.");
                            System.out.println("Introdueix el teu nom:");
                            String nomExtern = scanner.next();
                            for (Persona persona : poblenou.getPersonas()) {
                                if (persona.getNom().equalsIgnoreCase(nomExtern)) {
                                    personaReserva = persona;
                                    break;
                                }
                            }
                            break;
                    }

                    if (personaReserva == null) {
                        System.out.println("model.person.Persona no trobada.");
                        break;
                    }

                    //espai
                    System.out.println("Tens aquest espais: ");
                    poblenou.mostrarespais();

                    System.out.println("Selecciona un espai per fer la reserva: ");
                    String nomEspai = scanner.next();
                    Espai espaiReserva = null;

                    for (Espai espai : poblenou.getEspais()) {
                        if (espai.getNom().equalsIgnoreCase(nomEspai)) {
                            espaiReserva = espai;
                            break;
                        }
                    }

                    if (espaiReserva == null) {
                        System.out.println("model.person.space.Espai no trobat.");
                        break;
                    }


                    //data entrada
                    System.out.println("Quin any vols entrar?: ");
                    int anyentrada = scanner.nextInt();
                    System.out.println("Quin mes vols entrar?: ");
                    int mesentrada = scanner.nextInt();
                    System.out.println("Quin dia vols entrar?: ");
                    int diaentrada = scanner.nextInt();
                    System.out.println("Quia hora vols entrar?: ");
                    int horaentrada = scanner.nextInt();
                    System.out.println("Quin min vols entrar?: ");
                    int minentrada = scanner.nextInt();
                    LocalDateTime entrada = LocalDateTime.of(anyentrada, mesentrada, diaentrada, horaentrada, minentrada);


                    //data sortida
                    System.out.println("Quin any vols sortir?: ");
                    int anysortida = scanner.nextInt();
                    System.out.println("Quin mes vols sortir?: ");
                    int messortida = scanner.nextInt();
                    System.out.println("Quin dia vols sortir?: ");
                    int diasortida = scanner.nextInt();
                    System.out.println("Quia hora vols sortir?: ");
                    int horasortida = scanner.nextInt();
                    System.out.println("Quin min vols sortir?: ");
                    int minsortida = scanner.nextInt();
                    LocalDateTime sortida = LocalDateTime.of(anysortida, messortida, diasortida, horasortida, minsortida);

                    //Que les hores no es solapin
                    boolean espaiDisponible = true;
                    for (Reserva reserva : poblenou.getReserves()) {
                        if (reserva.getEspai().equals(espaiReserva)) {

                            if ((entrada.isBefore(reserva.getSortida()) && sortida.isAfter(reserva.getEntrada())) ||
                                    (entrada.isEqual(reserva.getEntrada()) || sortida.isEqual(reserva.getSortida()))) {
                                espaiDisponible = false;
                                break;
                            }
                        }
                    }


                    if (espaiDisponible) {
                        Reserva reserva = new Reserva(id,personaReserva, espaiReserva, entrada, sortida);
                        poblenou.addReserva(reserva);
                        System.out.println("model.booking.Reserva realizada.");
                    } else {
                        System.out.println("Aquestes dates ja tenenen una reserva");
                    }
                    break;


                case 5:

                    System.out.println("Introdueix el nom de la persona per buscar les seves reserves: ");
                    String nomPersona = scanner.next();

                    boolean trobat = false;
                    for (Reserva reserva : poblenou.getReserves()) {
                        if (reserva.getPersona().getNom().equalsIgnoreCase(nomPersona)) {
                            System.out.println(reserva);
                            trobat = true;
                        }
                    }

                    if (!trobat) {
                        System.out.println("No hi ha reserves amb aquest nom: " + nomPersona);
                    }
                    break;
                case 6:
                    System.out.println("introdueix el id de la reserva que vols eliminar: ");
                    int idEliminar = scanner.nextInt();
                    poblenou.borrarReserva(idEliminar);
                    System.out.println("model.booking.Reserva borrada.");
                    break;
                case 7:
                    continuar = false;
            }
        }
    }
}
