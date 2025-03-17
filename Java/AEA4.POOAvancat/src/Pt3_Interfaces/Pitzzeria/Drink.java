package Pt3_Interfaces.Pitzzeria;

public class Drink extends Foodstuff{

    public Drink(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
