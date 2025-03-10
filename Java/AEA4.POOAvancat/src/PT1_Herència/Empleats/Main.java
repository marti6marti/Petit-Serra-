package PT1.Empleats;

public class Main {
    public static void main(String[] args) {
        Empleat e1 = new Comercial("Marti","Serra", 18,2000,5);
        Empleat e2 = new Repartidor("Biel", "Font", 18,2500,"Figueres","pitzza");

        if (e1.getClass() == e2.getClass()){
            System.out.println("Son de la mateixa classe");
        } else {
            System.out.println("No son de la mateixa classe");
        }



        if (e1 instanceof Empleat == e2 instanceof Empleat){
            System.out.println("Els 2 son de la instamcia Empleat");
        } else {
            System.out.println("Els 2  no son de la instamcia Empleat");
        }


        System.out.println("Els 2 empleats son iguals?:  " + e1.equals(e2));




    }
}
