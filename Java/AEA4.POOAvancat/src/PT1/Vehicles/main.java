package PT1.Vehicles;

public class main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Cotxe("1A",4,2);
        Vehicle vehicle2 = new Microbus("2A",5,3);
        Vehicle vehicle3 = new VehiclesGrans("4B",5,2);
        Vehicle vehicle4 = new Camions("12D",4,5) ;

        Empleat emp = new Empleat();

        emp.addVehicle(vehicle1);
        emp.addVehicle(vehicle2);
        emp.addVehicle(vehicle3);
        emp.addVehicle(vehicle4);

        emp.obtenirPreu("1A");
        emp.obtenirPreu("2A");
        emp.obtenirPreu("4B");
        emp.obtenirPreu("12D");
    }
}
