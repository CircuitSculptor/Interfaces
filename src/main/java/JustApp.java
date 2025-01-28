import ie.atu.week1sem2.Food;
import ie.atu.week1sem2.Fries;
import ie.atu.week1sem2.Pizza;

import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {

        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App ");
        System.out.println("You ordered...");

        //Add some items burgers, pizzas, fries, salad...
        Burger cheeseBurger = new Burger("CheeseBurgeer", 1.99, "Tasty");
        Pizza pepperoni = new Pizza("Pizza", 9.99, "Tasty");
        Fries curry = new Fries("Curly", 4.99, "Good");

        //Add all the orders to a collection
        items.add(cheeseBurger);
        items.add(pepperoni);
        items.add(curry);

        //Display all the orders
        for(Food item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());

        }
        // Find the total cost of the whole order
    }
}
