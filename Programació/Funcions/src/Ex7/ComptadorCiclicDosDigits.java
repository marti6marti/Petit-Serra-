package Ex7;

public class ComptadorCiclicDosDigits {
    private ComptadorCiclic unitats;
    private ComptadorCiclic desenes;


    public ComptadorCiclicDosDigits() {
        this.unitats = new ComptadorCiclic();
        this.desenes = new ComptadorCiclic();
    }

    public void setposarAZero() {
        this.unitats.setposarAZero();
        this.desenes.setposarAZero();
    }


    public void incrementar() {
        this.unitats.setincrementar();
        if (this.unitats.getValor() == 0) {
            this.desenes.setincrementar();
        }
    }


    public int obtenirValor() {
        return (this.desenes.getValor() * 10 + this.unitats.getValor());
    }
}
