package Pt3_Interfaces.Pitzzeria;



import java.util.ArrayList;

public class Milkshake extends Drink implements Customizable {
    private String milkType;
    ArrayList<String> ingredients;

    public Milkshake(int id, String name, double price, String milkType) {
        super(id, name, price);
        this.milkType = milkType;
        ingredients = new ArrayList<>();
    }

    @Override
    public void addIngredients(String ingredient) {
        if (ingredient.contains("berry") || ingredient.equalsIgnoreCase("Mint")|| ingredient.equalsIgnoreCase("Cookies")){
            ingredients.add(ingredient);
            System.out.println("\nThe ingredient " + ingredient + " has been added to the milkshake.");
        }
        else System.out.println("\nThe ingredient " + ingredient + " cannot be added to a milkshake.");
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Milkshake{" +
                "milkTupe='" + milkType + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
