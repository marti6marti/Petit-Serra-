package model.institute.operations;

import model.institute.Institut;
import model.person.Persona;

public class MostraPersones {
    public String mostrapersones(Institut institut) {
        StringBuilder resultado = new StringBuilder();

        for (Persona persona : institut.getPersonas()) {
            resultado.append(persona.toString()).append("\n");
        }

        return resultado.toString();
    }
}