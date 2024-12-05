package Ex1;

public class CotxeTest {
    public static void main(String[] args) {
        // Creem dos objectes de tipus Cotxe
        Cotxe cotxe1 = new Cotxe();
        Cotxe cotxe2 = new Cotxe();


        cotxe1.setModel("Toyota Corolla");
        cotxe1.setMatricula("1234MSR");


        cotxe2.setModel("Honda Civic");
        cotxe2.setMatricula("5678MSR");


        System.out.println("Cotxe 1:");
        System.out.println("Model: " + cotxe1.getModel());
        System.out.println("Matrícula: " + cotxe1.getMatricula());


        System.out.println("Cotxe 2:");
        System.out.println("Model: " + cotxe2.getModel());
        System.out.println("Matrícula: " + cotxe2.getMatricula());
    }
}