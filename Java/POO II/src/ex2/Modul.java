package ex2;


import java.util.HashSet;

public class Modul {
    private String nomdelmodul;


    public Modul(String nomdelmodul) {
        this.nomdelmodul = nomdelmodul;
    }

    public Modul(){
        this.nomdelmodul="asd";
    }

    public String getNomdelmodul() {
        return nomdelmodul;
    }

    public void setNomdelmodul(String nomdelmodul) {
        this.nomdelmodul = nomdelmodul;
    }


    public String toString() {
        return "Modul{" +
                "nomdelmodul='" + nomdelmodul + '\'' +
                '}';
    }
}
