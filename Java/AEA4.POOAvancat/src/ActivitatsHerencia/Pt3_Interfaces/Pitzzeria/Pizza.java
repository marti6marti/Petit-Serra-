package ActivitatsHerencia.Pt3_Interfaces.Pitzzeria;


import java.util.ArrayList;

public class Pizza extends Foodstuff implements Customizable {
    private String size;
    ArrayList<String> ingredients;

    public Pizza(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
        ingredients = new ArrayList<>();
    }

    @Override
    public void addIngredients(String ingredient) {
        if (ingredient.contains("cheese") || ingredient.equalsIgnoreCase("Spicy sauce")|| ingredient.equalsIgnoreCase("Anchovies")){
            ingredients.add(ingredient);
            System.out.println("\nThe ingredient " + ingredient + " has been added to the pizza.");
        }
        else System.out.println("\nThe ingredient " + ingredient + " cannot be added to a pizza.");;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
