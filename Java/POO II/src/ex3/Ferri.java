package ex3;


import java.util.ArrayList;

public class Ferri {

    private String matricula;
    private String nom;
    private String desti;
    private int preuXT;
    private int pesMax;
    private ArrayList<Camio> camions;

    public Ferri(){
        camions = new ArrayList<Camio>();
    }

    public Ferri(String matricula, String nom, String desti, int preuXT, int pesMax){
        this.matricula = matricula;
        this.nom = nom;
        this.desti = desti;
        this.preuXT = preuXT;
        this.pesMax = pesMax;
        camions = new ArrayList<Camio>();
    }

    /**
     * Retorna el Atribut Matricula
     * @return Matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Fica valor al atribut Matricula
     * @param matricula El valor que volem ficar
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna el atribut Nom
     * @return atribut nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Posa valor al atribut nom
     * @param nom El valor  que volem ficar
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return El atribut Destí
     */
    public String getDesti() {
        return desti;
    }

    /**
     *
     * @param desti El valor que volem ficar
     */
    public void setDesti(String desti) {
        this.desti = desti;
    }

    public int getPreuXT() {
        return preuXT;
    }

    public void setPreuXT(int preuXT) {
        this.preuXT = preuXT;
    }

    public int getPesMax() {
        return pesMax;
    }

    public void setPesMax(int pesMax) {
        this.pesMax = pesMax;
    }



    /**
     * Afegeix un camió al ferry
     * @param camio que volem ficar
     */
    public void embarcarCamio(Camio camio) {

        camions.add(camio);
    }

    /**
     * Calcula el pes total dels camions
     * @return El pes total
     */
    public int pesTotalCamions() {
        int TPes=0;
        for(Camio cam: camions) {
            TPes += cam.getPes();
        }
        return TPes;
    }

    /**
     * Determina si un camió està embarcat o  no
     * @param matricula La matricula del camió cercat
     */
    public boolean camioEmbarcat(String matricula) {
        boolean trobat = false;
        for(Camio cam: camions) {
            if(cam.getMatricula().equals(matricula) ) {
                trobat = true;
            }
        }
        return trobat;
    }

    public void llistarCamions(){
        for(Camio cam: camions) {
            System.out.println(cam);
        }
    }

    public boolean determinarSiPucEmbarcar(Camio camio){
        boolean pucEmbarcar = false;
        if(!camioEmbarcat(camio.getMatricula())){

            if(pesMax > pesTotalCamions() + camio.getPes())
                pucEmbarcar = true;

        }
        return pucEmbarcar;
    }

}