package ActivitatsHerencia.PT1_Herència.Biblioteca2.Biblioteca;

public class Revista extends Fitxa {
    public short any;
    public short nro;

    public Revista(String referencia, String titol, short any, short nro) {
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "any=" + any +
                ", nro=" + nro +
                "} " + super.toString();
    }
}
