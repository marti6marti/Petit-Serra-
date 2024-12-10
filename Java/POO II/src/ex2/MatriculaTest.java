package ex2;

import java.util.HashSet;

public class MatriculaTest {
    public static void main(String[] args) {
        Modul modul1 = new Modul();
        Modul modul2 = new Modul();
        Modul modul3 = new Modul();
        Marticula matricula1 = new Marticula();
        Marticula matricula2 = new Marticula();

        matricula1.getAlumne().setDni(1234);
        matricula1.setNota(3);
        matricula2.getAlumne().setDni(4321);
    }
}
