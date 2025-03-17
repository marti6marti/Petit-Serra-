package Pt3_Interfaces.Pitzzeria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OrderManager or = new OrderManager();

        Pizza pizza = new Pizza(1, "Martí's Deluxe", 16.75, "Extra Large");
        Milkshake milkshake = new Milkshake(2, "Martishake", 9.25, "Soy milk");
        Drink drink = new Drink(3, "Figuerade Plus", 4.79);
        Burger burger = new Burger(4, "Figueres Ultimate Burger", 14.50, "Black Angus beef");

        or.addOrder(pizza);
        or.addOrder(milkshake);
        or.addOrder(drink);
        or.addOrder(burger);

        System.out.println("Current Orders:");
        or.showOrders();

        or.removeOrder(pizza);
        or.removeOrder(milkshake);

        System.out.println("\nUpdated Orders:");
        or.showOrders();
        System.out.println("\nCustomizable Orders: " + or.showCustomizableOrders());

        ArrayList<String> martiDeluxeIngredients = new ArrayList<>();
        martiDeluxeIngredients.add("BBQ Sauce");
        martiDeluxeIngredients.add("Cheddar Cheese");
        martiDeluxeIngredients.add("Grilled Chicken");
        martiDeluxeIngredients.add("Bacon");

        pizza.setIngredients(martiDeluxeIngredients);
        pizza.addIngredients("Mushrooms");
        pizza.addIngredients("Red Onion");
        pizza.addIngredients("Jalapeños");

        ArrayList<String> martishakeIngredients = new ArrayList<>();
        martishakeIngredients.add("Vanilla Ice Cream");
        martishakeIngredients.add("Peanut Butter");
        martishakeIngredients.add("Chocolate Chips");

        milkshake.setIngredients(martishakeIngredients);
        milkshake.addIngredients("Banana");
        milkshake.addIngredients("Honey");
        milkshake.addIngredients("Cinnamon");

        System.out.println("\nMartí's Deluxe ingredients: " + pizza.getIngredients());
        System.out.println("\nMartishake ingredients: " + milkshake.getIngredients());
    }
}
