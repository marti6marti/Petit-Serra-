package Ex7;

public class ComptadorCiclic {
    private int valor;


    public ComptadorCiclic() {
        this.valor = 0;
    }


    public void setposarAZero() {
        this.valor = 0;
    }


    public void setincrementar() {
        this.valor = (this.valor + 1) % 10;
    }


    public int getValor() {
        return this.valor;
    }
}