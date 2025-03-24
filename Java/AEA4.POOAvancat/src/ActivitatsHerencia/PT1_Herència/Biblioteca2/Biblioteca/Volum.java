package ActivitatsHerencia.PT1_Herència.Biblioteca2.Biblioteca;

public class Volum extends Obra {
    public short nro;

    public Volum(String referencia, String titol, String autor, short nrePags, short nro) {
        super(referencia, titol, autor, nrePags);
        this.nro = nro;
    }


    @Override
    public String toString() {
        return "Volum{" +
                "nro=" + nro +
                "} " + super.toString();
    }
}
