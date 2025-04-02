package service.servicePersones;

import model.institute.Institut;
import model.person.Persona;

public class MostraPersones implements ShowPersones{


    public void mostrapersones(Institut ins) {
        for (Persona persona : ins.getPersonas()){
            System.out.println(persona);
        }
    }
}