package PT2_Abstractes.Transports;

public class Main {
    public static void main(String[] args) {
        Transports t1 = new Bicicleta(1,25,8);
        Transports t2 = new Cotxe(2,120,"Diesel",1.18,0.2);
        Transports t3 = new Metro(3,50,10);

        t1.temps(20);
        t2.temps(20);
        t3.temps(20);

        System.out.println();
        System.out.println("----------factures en euros--------");
        System.out.println(t1.factura(20));
        System.out.println(t2.factura(20));
        System.out.println(t3.factura(20));
    }
}
