package service.serviceReserva;

import model.booking.Reserva;
import model.institute.Institut;
import model.person.Persona;
import model.space.Espai;
import service.serviceEspais.MostraEspais;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NovaReserva implements NewReserva{
    Scanner scanner = new Scanner(System.in);

    public void novaReserva(Institut ins){
        //id
        System.out.println("Posa un ID per la teva reserva");
        int id = scanner.nextInt();

        // persona
        System.out.println("Qui fa la reserva?");
        System.out.println("1. Alumne");
        System.out.println("2. Profesor");
        System.out.println("3. Persona Externa");
        int opcioPersona = scanner.nextInt();
        Persona personaReserva = null;

        switch (opcioPersona) {
            case 1:
                System.out.println("nom: ");
                String nomAlumne = scanner.next();

                for (Persona persona : ins.getPersonas()) {
                    if (persona.getNom().equalsIgnoreCase(nomAlumne)) {
                        personaReserva = persona;
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("nom: ");
                String nomProfesor = scanner.next();
                for (Persona persona : ins.getPersonas()) {
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
                for (Persona persona : ins.getPersonas()) {
                    if (persona.getNom().equalsIgnoreCase(nomExtern)) {
                        personaReserva = persona;
                        break;
                    }
                }
                break;
        }

        if (personaReserva == null) {
            System.out.println("Persona no trobada.");
        }

        //espai
        System.out.println("Tens aquest espais: ");
        MostraEspais me = new MostraEspais();
        me.mostrarespais(ins);

        System.out.println("Selecciona un espai per fer la reserva: ");
        String nomEspai = scanner.next();
        Espai espaiReserva = null;

        for (Espai espai : ins.getEspais()) {
            if (espai.getNom().equalsIgnoreCase(nomEspai)) {
                espaiReserva = espai;
                break;
            }
        }

        if (espaiReserva == null) {
            System.out.println("Espai no trobat.");
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
        for (Reserva reserva : ins.getReserves()) {
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
            ins.addReserva(reserva);
            System.out.println("Reserva realizada.");
        } else {
            System.out.println("Aquestes dates ja tenenen una reserva");
        }
    }
}
