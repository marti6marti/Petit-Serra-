package ex2;

public class Marticula {
    private Alumne alumne;
    private Modul modul;
    private int nota;

    public Marticula(Alumne alumne, Modul modul, int nota) {
        this.alumne = alumne;
        this.modul = modul;
        this.nota = nota;
    }
    public Marticula() {
        this.alumne = new Alumne();
        this.modul = new Modul();
        this.nota = 0;
    }
}
