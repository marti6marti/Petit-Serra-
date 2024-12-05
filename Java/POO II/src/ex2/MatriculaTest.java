package ex2;

import java.util.HashSet;

public class MatriculaTest {
    public static void main(String[] args) {
        HashSet<String> moduls1 = new HashSet<String>();
        
        moduls1.add("mates");
        moduls1.add("filo");
        moduls1.add("art");
        Marticula matricula1 = new Marticula();

        matricula1.getAlumne().setDni(1234);
        matricula1.getModul().setNomdelmodul(moduls1);
    }
}
