package service.servicePersones;

import model.institute.Institut;
import model.person.Alumne;
import model.person.PersonaExterna;
import model.person.Profesor;

import java.util.Scanner;

public class NovaPersona {

    public boolean crearAlumne(Institut ins, String nom, int telefon, String curs) {
        try {
            Alumne alumne = new Alumne(nom, telefon, curs);
            ins.addPersona(alumne);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean crearProfessor(Institut ins, String nom, int telefon, String materia) {
        try {
            Profesor professor = new Profesor(nom, telefon, materia);
            ins.addPersona(professor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean crearPersonaExterna(Institut ins, String nom, int telefon) {
        try {
            PersonaExterna personaExterna = new PersonaExterna(nom, telefon);
            ins.addPersona(personaExterna);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
