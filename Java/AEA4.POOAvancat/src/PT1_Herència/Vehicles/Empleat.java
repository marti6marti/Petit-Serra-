package PT1_Herència.Vehicles;

import java.util.ArrayList;

public class Empleat {
    public ArrayList<Vehicle> vehicles;

    public Empleat() {
        this.vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void obtenirPreu(String matricula){
        for (Vehicle v :vehicles){
            if (v.getMatricula().equals(matricula)){
                System.out.println(v.preu());
            }
        }
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "vehicles=" + vehicles +
                '}';
    }
}
