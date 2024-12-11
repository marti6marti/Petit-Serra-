package ex3;


public class Camio {

    private String matricula;
    private int pes;

    public Camio(String matricula, int pes)
    {
        this.matricula = matricula;
        this.pes = pes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return "Camio{" +
                "matricula='" + matricula + '\'' +
                ", pes=" + pes +
                '}';
    }
}