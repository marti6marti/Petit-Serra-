package ex5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persona {
    private int Dni;
    private String Nom;
    private ArrayList<Contracte> contractes;

    public Persona(int dni, String nom) {
        Dni = dni;
        Nom = nom;
        this.contractes = new ArrayList<Contracte>();
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public ArrayList<Contracte> getContractes() {
        return contractes;
    }

    public void setContractes(ArrayList<Contracte> contractes) {
        this.contractes = contractes;
    }

    public void AfegirContracte(Contracte contracte){
        contractes.add(contracte);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Dni=" + Dni +
                ", Nom='" + Nom + '\'' +
                ", contractes=" + contractes +
                '}';
    }
}
