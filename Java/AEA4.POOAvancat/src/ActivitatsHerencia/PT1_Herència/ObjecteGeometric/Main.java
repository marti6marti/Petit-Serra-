package ActivitatsHerencia.PT1_Herència.ObjecteGeometric;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(2,4,"blau",5);
        Quadrat quadrat = new Quadrat(5,6,"negre",5);

        System.out.println(cercle.perimetre());
        System.out.println(cercle.area());

        System.out.println(quadrat.perimetre());
        System.out.println(quadrat.area());


    }
}
