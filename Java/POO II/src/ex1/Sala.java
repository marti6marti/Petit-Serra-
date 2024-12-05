package ex1;

public class Sala {
    private int numeroDeTelevisions;
    private String tipusSala;

    public Sala() {
        this.numeroDeTelevisions = 0;
        this.tipusSala = "desconegut";
    }
    public Sala(int numeroDeTelevisions, String tipusSala) {
        this.numeroDeTelevisions = numeroDeTelevisions;
        this.tipusSala = tipusSala;
    }

    public int getNumeroDeTelevisions() {
        return numeroDeTelevisions;
    }

    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        this.numeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipusSala() {
        return tipusSala;
    }

    public void setTipusSala(String tipusSala) {
        this.tipusSala = tipusSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipusSala='" + tipusSala + '\'' +
                '}';
    }
}
