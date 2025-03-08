package PT2.Aquarium;

public class Main {
    public static void main(String[] args) {
        Peix o1 = new Peix("Marti", "Blau", "L", 12,3,8,5,"Figueres","W",35);
        Planta o2 = new Planta("Rosa", "roses", "H", 12,3,8,5,"R");








        System.out.println(o1.getDescripcioLlum());
        System.out.println(o1.getMargesAcidesa());
        System.out.println(o1.getMargesTemperatura());

        System.out.println(o1.getDescripcioDieta());
        System.out.println(o2.getDescripcioTipus());



    }
}
