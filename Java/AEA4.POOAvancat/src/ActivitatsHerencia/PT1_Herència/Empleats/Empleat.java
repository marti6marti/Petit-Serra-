package ActivitatsHerencia.PT1_Herència.Empleats;

public class Empleat {
    public String nom;
    public String cognom;
    public int edat;
    public double salari;

    public Empleat(String nom, String cognom, int edat, double salari) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.salari = salari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public boolean plus(int plusSalarial){
        if (edat>40){
            salari = salari + plusSalarial;
            System.out.println("s'ha apujat el salari");
            return true;
        }else {
            System.out.println("NO s'ha apujat el salari");
            return false;
        }
    }

    public boolean comprovaNom(){
        if (nom == ""){
            System.out.println("el nom està buit");
            return false;
        } else {
            System.out.println("te un nom");
            return true;
        }
    }
}
