package ActivitatsHerencia.PT1_Herència.Biblioteca1.Biblioteca;


public class Obra extends Fitxa{
    public String autor;
    public short nrePags;

    public Obra(String referencia, String titol, String autor, short nrePags) {
        super(referencia, titol);
        this.autor = autor;
        this.nrePags = nrePags;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "autor='" + autor + '\'' +
                ", nrePags=" + nrePags +
                "} " + super.toString();
    }
}
