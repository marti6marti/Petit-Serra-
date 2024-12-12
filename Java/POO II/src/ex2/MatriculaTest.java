package ex2;


public class MatriculaTest {
    public static void main(String[] args) {
        Marticula matricula1 = new Marticula();
        Marticula matricula2 = new Marticula();

        matricula1.getAlumne().setDni(1234);
        matricula1.getAlumne().setEdat(15);
        matricula1.getAlumne().setNom("Miquel");
        matricula1.getAlumne().setCognom("Soler");

        matricula1.getModul().setNomdelmodul("Fisica");
        matricula1.getModul().setNomdelmodul("Quimica");
        matricula1.getModul().setNomdelmodul("Mates");

        matricula1.setNota(3);

        matricula2.getAlumne().setDni(4321);

        System.out.println(matricula1);
    }
}
