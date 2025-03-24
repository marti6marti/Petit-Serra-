package ActivitatsHerencia.Pt3_Interfaces.Pitzzeria;

import java.util.ArrayList;

public class OrderManager {
    ArrayList<Foodstuff> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Foodstuff newOrder) {
        orders.add(newOrder);
    }

    public void removeOrder(Foodstuff removedOrder) {

        for (Foodstuff order : orders) {
            if (order.getId() == removedOrder.getId()) {
                orders.remove(removedOrder);
                break;
            }
        }
    }

    public void showOrders(){
        for (Foodstuff order : orders) {
            System.out.println(order);
        }
    }

    public ArrayList<Foodstuff> showCustomizableOrders(){
        ArrayList<Foodstuff> customizableOrders = new ArrayList<>();

        for (Foodstuff order : orders) {
           if (order instanceof Pizza || order instanceof Milkshake){
               customizableOrders.add(order);
           }
        }
        return customizableOrders;
    }
}
